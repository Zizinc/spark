resolvers ++= Seq(
  "sbt-idea-repo" at "http://mpeltonen.github.com/maven/",
  Classpaths.typesafeResolver
)

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")

//addSbtPlugin("com.eed3si9n" %% "sbt-assembly" % "1.1.0")

addSbtPlugin("com.alpinenow" % "junit_xml_listener" % "0.5.1")