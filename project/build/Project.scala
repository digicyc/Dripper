import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) with IdeaProject {
  val casbah = "com.mongodb.casbah" %% "casbah" % "2.0.2"
  val scalatest = "org.scalatest" % "scalatest" % "1.3"
  // XMPP Lib Not working.. so have .jar in lib instead.
  //val troutwineRepo = "troutwine.us repository" at "http://maven.troutwine.us/"
  //val phone = "us.troutwine" %% "Barkety" % "0.1.3"
}
