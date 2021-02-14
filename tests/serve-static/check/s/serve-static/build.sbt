organization := "org.scalablytyped"
name := "serve-static"
version := "0.0-unknown-646f48"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.3.0",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.0-unknown-093aa4",
  "org.scalablytyped" %%% "mime" % "2.0-df95ec",
  "org.scalablytyped" %%% "std" % "0.0-unknown-de1384")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
