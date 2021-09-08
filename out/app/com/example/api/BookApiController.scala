package com.example.api

import com.example.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import com.example.model.Book
import com.example.model.BookRegistrationParameter
import com.example.model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-09-08T12:01:30.531650Z[Etc/UTC]")
@Singleton
class BookApiController @Inject()(cc: ControllerComponents, api: BookApi) extends AbstractController(cc) {
  /**
    * DELETE /v1/book/:bookId
    */
  def v1BookBookIdDelete(bookId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.v1BookBookIdDelete(bookId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v1/book/:bookId
    */
  def v1BookBookIdGet(bookId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Book = {
      api.v1BookBookIdGet(bookId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /v1/book/:bookId
    */
  def v1BookBookIdPut(bookId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val bookRegistrationParameter = request.body.asJson.map(_.as[BookRegistrationParameter])
      api.v1BookBookIdPut(bookId, bookRegistrationParameter)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v1/book
    */
  def v1BookGet(): Action[AnyContent] = Action { request =>
    def executeApi(): List[Book] = {
      api.v1BookGet()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/book
    */
  def v1BookPost(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val bookRegistrationParameter = request.body.asJson.map(_.as[BookRegistrationParameter])
      api.v1BookPost(bookRegistrationParameter)
    }

    executeApi()
    Ok
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
