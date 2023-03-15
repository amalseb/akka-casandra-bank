ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "akka-cassandra-bank"
  )

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.5.0",
  "com.typesafe.akka" %% "akka-actor-typed" % "2.8.0-M6",
  "com.typesafe.akka" %% "akka-stream" % "2.8.0-M6",
  "com.typesafe.akka" %% "akka-persistence-typed" % "2.8.0-M6",
  "com.datastax.oss" % "java-driver-core" % "4.15.0",
  "com.typesafe.akka" %% "akka-persistence-cassandra" % "1.1.0",
  "io.circe" %% "circe-core" % "0.14.5",
  "io.circe" %% "circe-generic" % "0.15.0-M1",
  "io.circe" %% "circe-parser" % "0.15.0-M1",
  "de.heikoseeberger" %% "akka-http-circe" % "1.39.2",
  "ch.qos.logback" % "logback-classic" % "1.4.5",
  "com.typesafe.akka" %% "akka-http-testkit" % "10.5.0" % Test,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.8.0-M6" % Test,
  "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test

)
