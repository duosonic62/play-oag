package com.example.api

import com.example.OpenApiExceptions
import com.example.model.Book
import com.example.model.BookRegistrationParameter
import com.example.model.Error

import java.util.UUID
import javax.inject.Singleton

/**
  * Provides a default implementation for [[BookApi]].
  */
class BookApiImpl extends BookApi {
  private var books = Map.empty[String, Book]
  /**
    * @inheritdoc
    */
  override def v1BookBookIdDelete(bookId: String): Unit = {
    books = books - bookId
  }

  /**
    * @inheritdoc
    */
  override def v1BookBookIdGet(bookId: String): Book = {
    books.getOrElse(bookId, throw new IllegalArgumentException)
  }

  /**
    * @inheritdoc
    */
  override def v1BookBookIdPut(bookId: String, bookRegistrationParameter: Option[BookRegistrationParameter]): Unit = {
    bookRegistrationParameter.foreach { param =>
      if (!books.contains(bookId)) {
        throw new IllegalArgumentException
      }

      val newBook = Book(
        id = bookId,
        name = param.name,
        author = param.author,
        isbn = param.isbn
      )
      books = books - bookId
      books = books + (bookId-> newBook)
    }
  }

  /**
    * @inheritdoc
    */
  override def v1BookGet(): List[Book] = {
    books.toList.map[Book] { book => book._2 }
  }

  /**
    * @inheritdoc
    */
  override def v1BookPost(bookRegistrationParameter: Option[BookRegistrationParameter]): Unit = {
    bookRegistrationParameter.foreach(param => {
      val id = UUID.randomUUID().toString
      val newBook = Book(
        id = id,
        name = param.name,
        author = param.author,
        isbn = param.isbn
      )
      books = books + (id -> newBook)
    })
  }
}
