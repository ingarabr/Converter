organization := "org.scalablytyped"
name := "vue-scrollto"
version := "2.7-2f35da"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "0.0-unknown-ce8a1d",
  "org.scalablytyped" %%% "vue" % "2.5.13-232968")
publishArtifact in packageDoc := false
scalacOptions ++= List("-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        