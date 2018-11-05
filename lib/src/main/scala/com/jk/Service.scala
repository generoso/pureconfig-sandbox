package com.jk

import pureconfig._
import pureconfig.generic.auto._

class Service(config: Config) {

  // Allow creation without passing a config (uses default namespace)
  def this() = this(loadConfigOrThrow[Config])

  def foo() = {
    println(s"cool stuff, using [${config.name}], [${config.id}] and [${config.list}]")
  }

}
