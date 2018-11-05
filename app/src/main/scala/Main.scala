package main.scala

import com.jk.{Config, Service}
import pureconfig._
import pureconfig.generic.auto._

object Main {

  case class MainConfig(phase: String) {
    require(phase == "prd" || phase == "dev")
  }

  def main(args: Array[String]): Unit = {

    val mainConfig = loadConfigOrThrow[MainConfig]
    val config = loadConfigOrThrow[Config](mainConfig.phase + ".lib")

    // application config
    val s = new Service(config)
    s.foo()

    // optional value
    config.opt.foreach(println)

    // default namespace config
    val d = new Service
    d.foo()
  }

}
