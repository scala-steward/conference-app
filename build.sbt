name := """conference-app"""

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(ws, cache, specs2 % Test)

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "2.1.0",
  "org.postgresql" % "postgresql" % "9.4-1206-jdbc4",
  "com.typesafe.play" %% "play-slick-evolutions" % "4.0.2",
  "com.h2database" % "h2" % "1.4.194",
  "org.webjars" %% "webjars-play" % "2.5.0",
  "org.webjars" % "bootstrap" % "3.1.1-2"
)

TwirlKeys.templateImports += "models._"

