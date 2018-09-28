enablePlugins(ScalaJSPlugin)

name := "$name$"

scalaVersion := "2.12.4"

libraryDependencies += "me.shadaj" %%% "slinky-native" % "0.5.0"
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.5.0"

scalacOptions += "-P:scalajs:sjsDefinedByDefault"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

scalaJSModuleKind := ModuleKind.CommonJSModule
