
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.13"

lazy val root = (project in file("."))
  .settings(
    name := "scala-dsa"
  )

libraryDependencies ++= Dependencies.compile
libraryDependencies ++= Dependencies.test

resolvers += Resolver.jcenterRepo