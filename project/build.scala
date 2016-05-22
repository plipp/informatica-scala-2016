import sbt._
import Keys._

object Build extends Build {
    val botDirectory = SettingKey[File]("bot-directory")
    val startServer = TaskKey[Unit]("startServer")
    val deploy = TaskKey[Unit]("deploy")

    val bot = Project(
        id = "mybot",
        base = file("."),
        settings = Project.defaultSettings ++ botSettings)

    val botSettings = Seq[Setting[_]](
        organization := "de.informatica",
        name := "scalatron-bot",
        version := "1.0.0-SNAPSHOT",

        scalaVersion := "2.11.8",
        scalacOptions ++= Seq("-deprecation", "-unchecked"),

        javaOptions += "-Xmx1g", //

        libraryDependencies ++= Seq(
            "org.specs2" %% "specs2" % "2.4.17" % "test",
            "org.pegdown" % "pegdown" % "1.6.0" %"test",
            "junit" % "junit" % "4.12" % "test"),

        testOptions := Seq(
            Tests.Filter(_ == "de.informatica.scalatron.BotSpec"),
            Tests.Argument("html", "console")),

        testOptions <+= crossTarget map { ct =>
            Tests.Setup { () =>
                System.setProperty("specs2.outDir", new File(ct, "specs2").getAbsolutePath)
            }
        },

        botDirectory := file("bots"),

        deploy <<= (botDirectory, name, Keys.`package` in Compile) map { (bots, name, botJar) =>
            val target: File = bots / name
            IO createDirectory target
            IO copyFile (botJar, target / "ScalatronBot.jar")
            println(s"COPIED $botJar =>  $target")
        }

    )
}