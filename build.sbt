name := "Particle-Swarm-Optimization-in-Spark"

version := "1.0"

scalaVersion := "2.12.15"

val sparkVersion = "3.2.0"

libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-mllib" % sparkVersion