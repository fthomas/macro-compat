scalacOptions += "-deprecation"
libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25"

addSbtPlugin("com.github.gseitz"  % "sbt-release"           % "1.0.4")
addSbtPlugin("com.jsuereth"       % "sbt-pgp"               % "1.0.1")
addSbtPlugin("com.typesafe.sbt"   % "sbt-git"               % "0.9.2")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"           % "0.6.19")
addSbtPlugin("com.typesafe"       % "sbt-mima-plugin"       % "0.1.14")
addSbtPlugin("org.xerial.sbt"     % "sbt-sonatype"          % "1.1")
addSbtPlugin("org.portable-scala" % "sbt-crossproject"      % "0.3.0")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.3.0")
addSbtPlugin("org.scala-native"   % "sbt-scala-native"      % "0.3.6")
