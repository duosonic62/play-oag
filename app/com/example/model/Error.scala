package com.example.model

import play.api.libs.json._

/**
  * 共通エラーオブジェクト
  * @param code エラーコード
  * @param message エラーメッセージ
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-09-07T08:41:25.199689Z[Etc/UTC]")
case class Error(
  code: Int,
  message: Option[String]
)

object Error {
  implicit lazy val errorJsonFormat: Format[Error] = Json.format[Error]
}

