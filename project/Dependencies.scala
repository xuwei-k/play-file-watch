/*
 * Copyright (C) Lightbend Inc. <https://www.lightbend.com>
 */
import sbt._

object Dependencies {
  // to allow for use in sbt 0.13
  val Scala210 = "2.10.7"
  val Scala211 = "2.11.12"
  val Scala212 = "2.12.13"
  val Scala213 = "2.13.5"

  val ScalaVersions = Seq(Scala210, Scala211, Scala212, Scala213)
}
