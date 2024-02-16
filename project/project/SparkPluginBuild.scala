import sbt._

object SparkPluginDef extends Build {
  //lazy val root = Project("plugins", file(".")) dependsOn(junitXmlListener)
  /* This is not published in a Maven repository, so we get it from GitHub directly */
  //lazy val junitXmlListener = uri("git://github.com/AlpineNow/junit_xml_listener.git")
}