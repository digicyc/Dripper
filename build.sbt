name := "Dripper"

version := "0.1"

scalaVersion := "2.9.1"

libraryDependencies ++= {
  Seq(
    "org.specs2" %% "specs2" % "1.6.1",
    "org.specs2" %% "specs2-scalaz-core" % "6.0.1" % "test"
  )
}

resolvers ++= Seq("snapshots" at "http://scala-tools.org/repo-snapshots",
                  "releases"  at "http://scala-tools.org/repo-releases",
                  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"
)

