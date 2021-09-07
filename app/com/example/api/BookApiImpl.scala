package com.example.api

import com.example.OpenApiExceptions
import com.example.model.Book
import com.example.model.BookRegistrationParameter
import com.example.model.Error

import java.util.UUID

/**
  * Provides a default implementation for [[BookApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-09-07T08:41:25.199689Z[Etc/UTC]")
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
    books.getOrElse(bookId, throw IllegalStateException)
  }

  /**
    * @inheritdoc
    */
  override def v1BookBookIdPut(bookId: String, bookRegistrationParameter: Option[BookRegistrationParameter]): Unit = {
    // TODO: Implement better logic
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
    bookRegistrationParameter.foreach(param => books + Book(
      id = Some(UUID.randomUUID().toString),
      name = param.name,
      author = param.author,
      isbn = param.isbn
    ))
  }
}
