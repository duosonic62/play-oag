package com.example.api

import play.api.libs.json._
import com.example.model.Book
import com.example.model.BookRegistrationParameter
import com.example.model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-09-08T12:01:30.531650Z[Etc/UTC]")
trait BookApi {
  /**
    * upfate book
    */
  def v1BookBookIdDelete(bookId: String): Unit

  /**
    * show book details
    */
  def v1BookBookIdGet(bookId: String): Book

  /**
    * upfate book
    */
  def v1BookBookIdPut(bookId: String, bookRegistrationParameter: Option[BookRegistrationParameter]): Unit

  /**
    * show books
    */
  def v1BookGet(): List[Book]

  /**
    * new book
    */
  def v1BookPost(bookRegistrationParameter: Option[BookRegistrationParameter]): Unit
}
