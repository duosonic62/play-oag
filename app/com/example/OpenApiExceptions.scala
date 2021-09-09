package com.example

object OpenApiExceptions {
  class MissingRequiredParameterException(paramName: String, paramType: String) extends Exception(s"Missing required $paramType parameter `$paramName`.")
}
