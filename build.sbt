name := """open-api-generator-sample"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  guice,
  ws,
  "org.webjars" % "swagger-ui" % "3.1.5",
  "javax.annotation" % "javax.annotation-api" % "1.3.2" % "compile",
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
)


// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
