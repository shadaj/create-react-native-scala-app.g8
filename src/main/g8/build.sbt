enablePlugins(ScalaJSPlugin)

name := "$name$"

scalaVersion := "2.12.8"

libraryDependencies += "me.shadaj" %%% "slinky-native" % "0.6.0"
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.6.0"

scalacOptions += "-P:scalajs:sjsDefinedByDefault"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

scalaJSModuleKind := ModuleKind.CommonJSModule
