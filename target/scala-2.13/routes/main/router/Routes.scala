// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Utama/Semester 7/Scala/scala_final/conf/routes
// @DATE:Tue Feb 02 19:46:09 SGT 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  ClientSocket_1: controllers.ClientSocket,
  // @LINE:8
  HomeController_2: controllers.HomeController,
  // @LINE:17
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    ClientSocket_1: controllers.ClientSocket,
    // @LINE:8
    HomeController_2: controllers.HomeController,
    // @LINE:17
    Assets_0: controllers.Assets
  ) = this(errorHandler, ClientSocket_1, HomeController_2, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ClientSocket_1, HomeController_2, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ClientSocket.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """explore""", """controllers.HomeController.explore"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jalanserver""", """controllers.ClientSocket.jalanserver"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """serverku""", """controllers.HomeController.serverku"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tutorial""", """controllers.HomeController.tutorial"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """minta""", """controllers.ClientSocket.minta_balik(stringku:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """minta2""", """controllers.ClientSocket.latihan2(stringku:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_ClientSocket_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ClientSocket_index0_invoker = createInvoker(
    ClientSocket_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientSocket",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_explore1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("explore")))
  )
  private[this] lazy val controllers_HomeController_explore1_invoker = createInvoker(
    HomeController_2.explore,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "explore",
      Nil,
      "GET",
      this.prefix + """explore""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ClientSocket_jalanserver2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jalanserver")))
  )
  private[this] lazy val controllers_ClientSocket_jalanserver2_invoker = createInvoker(
    ClientSocket_1.jalanserver,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientSocket",
      "jalanserver",
      Nil,
      "GET",
      this.prefix + """jalanserver""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_serverku3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("serverku")))
  )
  private[this] lazy val controllers_HomeController_serverku3_invoker = createInvoker(
    HomeController_2.serverku,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "serverku",
      Nil,
      "GET",
      this.prefix + """serverku""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_tutorial4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tutorial")))
  )
  private[this] lazy val controllers_HomeController_tutorial4_invoker = createInvoker(
    HomeController_2.tutorial,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tutorial",
      Nil,
      "GET",
      this.prefix + """tutorial""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ClientSocket_minta_balik5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("minta")))
  )
  private[this] lazy val controllers_ClientSocket_minta_balik5_invoker = createInvoker(
    ClientSocket_1.minta_balik(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientSocket",
      "minta_balik",
      Seq(classOf[String]),
      "GET",
      this.prefix + """minta""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ClientSocket_latihan26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("minta2")))
  )
  private[this] lazy val controllers_ClientSocket_latihan26_invoker = createInvoker(
    ClientSocket_1.latihan2(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientSocket",
      "latihan2",
      Seq(classOf[String]),
      "GET",
      this.prefix + """minta2""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_ClientSocket_index0_route(params@_) =>
      call { 
        controllers_ClientSocket_index0_invoker.call(ClientSocket_1.index)
      }
  
    // @LINE:8
    case controllers_HomeController_explore1_route(params@_) =>
      call { 
        controllers_HomeController_explore1_invoker.call(HomeController_2.explore)
      }
  
    // @LINE:9
    case controllers_ClientSocket_jalanserver2_route(params@_) =>
      call { 
        controllers_ClientSocket_jalanserver2_invoker.call(ClientSocket_1.jalanserver)
      }
  
    // @LINE:10
    case controllers_HomeController_serverku3_route(params@_) =>
      call { 
        controllers_HomeController_serverku3_invoker.call(HomeController_2.serverku)
      }
  
    // @LINE:11
    case controllers_HomeController_tutorial4_route(params@_) =>
      call { 
        controllers_HomeController_tutorial4_invoker.call(HomeController_2.tutorial)
      }
  
    // @LINE:12
    case controllers_ClientSocket_minta_balik5_route(params@_) =>
      call(params.fromQuery[String]("stringku", None)) { (stringku) =>
        controllers_ClientSocket_minta_balik5_invoker.call(ClientSocket_1.minta_balik(stringku))
      }
  
    // @LINE:13
    case controllers_ClientSocket_latihan26_route(params@_) =>
      call(params.fromQuery[String]("stringku", None)) { (stringku) =>
        controllers_ClientSocket_latihan26_invoker.call(ClientSocket_1.latihan2(stringku))
      }
  
    // @LINE:17
    case controllers_Assets_versioned7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
