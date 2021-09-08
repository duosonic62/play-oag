package com.example.api

import com.example.model.Book
import com.example.model.BookRegistrationParameter
import com.example.model.Error

/**
  * Provides a default implementation for [[BookApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-09-08T12:01:30.531650Z[Etc/UTC]")
class BookApiImpl extends BookApi {
  /**
    * @inheritdoc
    */
  override def v1BookBookIdDelete(bookId: String): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def v1BookBookIdGet(bookId: String): Book = {
    // TODO: Implement better logic

    Book("", "", "", "")
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
    // TODO: Implement better logic

    List.empty[Book]
  }

  /**
    * @inheritdoc
    */
  override def v1BookPost(bookRegistrationParameter: Option[BookRegistrationParameter]): Unit = {
    // TODO: Implement better logic

    
  }
}
