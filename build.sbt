name := "pureconfig-sandbox"

lazy val commonSettings = Seq(
  scalaVersion := "2.12.7",
  organization := "com.jk",
  libraryDependencies ++= Seq(
    "com.github.pureconfig" %% "pureconfig" % "0.10.0"))


lazy val root = (project in file("."))
  .aggregate(app, lib)


lazy val app = (project in file("app"))
  .settings(
    commonSettings,
    version := "0.1",
    libraryDependencies += "com.jk" %% "lib" % "0.1"
  )


lazy val lib = (project in file("lib"))
  .settings(
    commonSettings,
    version := "0.1"
  )
