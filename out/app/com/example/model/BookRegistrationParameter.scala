package com.example.model

import play.api.libs.json._

/**
  * 本の情報の登録パラメータ
  * @param name 本の名前
  * @param author 著者
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-09-08T12:01:30.531650Z[Etc/UTC]")
case class BookRegistrationParameter(
  name: String,
  author: String,
  isbn: BigDecimal
)

object BookRegistrationParameter {
  implicit lazy val bookRegistrationParameterJsonFormat: Format[BookRegistrationParameter] = Json.format[BookRegistrationParameter]
}

