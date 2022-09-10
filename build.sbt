name := "sbt-services"

version := "0.0.001"

scalaVersion := "2.13.8"

crossScalaVersions := Seq("2.13.8", "3.1.3")

val projectSourceDirs = List("core")
Compile / unmanagedSourceDirectories ++= projectSourceDirs.map(dir => (Compile / baseDirectory).value / dir)

organization := "com.logicovercode"

val techLead = Developer(
  "techLead",
  "techLead",
  "techlead@logicovercode.com",
  url("https://github.com/logicovercode")
)
developers := List(techLead)

homepage := Some(
  url("https://github.com/logicovercode/sbt-services")
)
scmInfo := Some(
  ScmInfo(
    url("https://github.com/logicovercode/sbt-services"),
    "git@github.com:logicovercode/sbt-services.git"
  )
)

licenses += ("MIT", url("https://opensource.org/licenses/MIT"))

//publishing related settings

//crossPaths := false
//publishMavenStyle := true
publishTo := Some(Opts.resolver.sonatypeStaging)

publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)

val fSbtAdtsProject = project in file(".")
