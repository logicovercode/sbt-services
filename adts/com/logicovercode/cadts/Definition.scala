package com.logicovercode.cadts

case class Version(version: String)

trait IDependency{
  def organization : String
  def artifactId : String
  def version : Version
  def onlyPom : Boolean
}

case class JDependency private (override val organization : String,
                       override val artifactId : String,
                       override val version : Version,
                       override val onlyPom : Boolean) extends IDependency

object JDependency{
  def apply(organization: String, artifactId: String, version: String, onlyPom: Boolean = false): JDependency = {
    new JDependency(organization, artifactId, Version(version), onlyPom)
  }
}

case class SDependency private (override val organization : String,
                       override val artifactId : String,
                       override val version : Version,
                       override val onlyPom : Boolean) extends IDependency

object SDependency{
  def apply(organization: String, artifactId: String, version: String, onlyPom: Boolean = false): SDependency = {
    new SDependency(organization, artifactId, Version(version), onlyPom)
  }
}

