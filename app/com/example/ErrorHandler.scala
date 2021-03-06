package com.example

import play.api.http.DefaultHttpErrorHandler
import play.api.libs.json.JsResultException
import play.api.mvc.Results._
import play.api.mvc.{RequestHeader, Result}

import scala.concurrent.Future

class ErrorHandler extends DefaultHttpErrorHandler {
  override def onServerError(request: RequestHeader, e: Throwable): Future[Result] = e match {
    case _: OpenApiExceptions.MissingRequiredParameterException =>
      Future.successful(BadRequest(e.getMessage))
    case _: JsResultException =>
      Future.successful(BadRequest(e.getMessage))
    case _ =>
      // Handles dev mode properly, or otherwise returns internal server error in production mode
      super.onServerError(request, e)
  }
}
