package com.stacktrace.yo.scrapeline.engine.file

import akka.actor.{Actor, ActorLogging}
import com.stacktrace.yo.scrapeline.engine.core.engine.Engine

/**
  * Created by Stacktraceyo on 9/6/17.
  */
class FileSourceSupervisor(engine: Engine) extends Actor with ActorLogging {

  override def receive: PartialFunction[Any, Unit] = {

    case _ =>

  }
}
