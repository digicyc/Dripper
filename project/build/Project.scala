import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) with IdeaProject {
  val casbah = "com.mongodb.casbah" %% "casbah" % "2.0.2"
  val scalatest = "org.scalatest" % "scalatest" % "1.3"
}
