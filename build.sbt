name := "trainModel"
organization := "edu.nyu"
version := "1.0-SUBMIT"

// Spark Information
val sparkVersion = "2.12.10"

// allows us to include spark packages
resolvers += "bintray-spark-packages" at
  "https://dl.bintray.com/spark-packages/maven/"

resolvers += "Typesafe Simple Repository" at
  "http://repo.typesafe.com/typesafe/simple/maven-releases/"

resolvers += "MavenRepository" at
  "https://mvnrepository.com/"

libraryDependencies ++= Seq(
  // spark core
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,

  // spark-modules
  "org.apache.spark" %% "spark-mllib" % sparkVersion,

  // spark packages

  // logging
  "org.apache.logging.log4j" % "log4j-api" % "1.2.17",
  "org.apache.logging.log4j" % "log4j-core" % "1.2.17"
)


