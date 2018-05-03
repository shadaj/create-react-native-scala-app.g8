enablePlugins(ScalaJSPlugin)

name := "$name$"

scalaVersion := "2.12.4"

libraryDependencies += "me.shadaj" %%% "slinky-native" % "0.4.1"
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.4.1"

scalacOptions += "-P:scalajs:sjsDefinedByDefault"

addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M11" cross CrossVersion.full)

scalaJSModuleKind := ModuleKind.CommonJSModule
