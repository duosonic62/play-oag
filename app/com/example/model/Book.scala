package com.example.model

import play.api.libs.json._

/**
  * 本の登録情報
  * @param id 本のID
  * @param name 本の名前
  * @param author 著者
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-09-07T08:41:25.199689Z[Etc/UTC]")
case class Book(
  id: Option[String],
  name: String,
  author: String,
  isbn: BigDecimal
)

object Book {
  implicit lazy val bookJsonFormat: Format[Book] = Json.format[Book]
}

