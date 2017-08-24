package com.stacktrace.yo.scrapeline.igdb

import akka.actor.{ActorSystem, Props}
import akka.stream.ActorMaterializer
import com.stacktrace.yo.scrapeline.igdb.pipeline.IGDBPipelineController
import com.stacktrace.yo.scrapeline.igdb.pipeline.IGDBPipelineController.Start

import scala.language.postfixOps

/**
  * Created by Stacktraceyo on 8/18/17.
  */
object IGDBScraper extends App {

  implicit val as = ActorSystem()
  implicit val ec = as.dispatcher
  implicit val mat = ActorMaterializer()


  val controller = as.actorOf(Props(new IGDBPipelineController()))
  controller ! Start()
}
