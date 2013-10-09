// @SOURCE:/Users/TechnoTechie/git/surferpedia/conf/routes
// @HASH:73d9e62c37423a2e27da396d3b75ea5265973b30
// @DATE:Tue Oct 08 19:45:53 HST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_anastasia1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anastasia"))))
        

// @LINE:8
private[this] lazy val controllers_Application_bill2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bill"))))
        

// @LINE:9
private[this] lazy val controllers_Application_kyussk3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("kyussk"))))
        

// @LINE:13
private[this] lazy val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anastasia""","""controllers.Application.anastasia()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bill""","""controllers.Application.bill()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """kyussk""","""controllers.Application.kyussk()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_anastasia1(params) => {
   call { 
        invokeHandler(controllers.Application.anastasia(), HandlerDef(this, "controllers.Application", "anastasia", Nil,"GET", """""", Routes.prefix + """anastasia"""))
   }
}
        

// @LINE:8
case controllers_Application_bill2(params) => {
   call { 
        invokeHandler(controllers.Application.bill(), HandlerDef(this, "controllers.Application", "bill", Nil,"GET", """""", Routes.prefix + """bill"""))
   }
}
        

// @LINE:9
case controllers_Application_kyussk3(params) => {
   call { 
        invokeHandler(controllers.Application.kyussk(), HandlerDef(this, "controllers.Application", "kyussk", Nil,"GET", """""", Routes.prefix + """kyussk"""))
   }
}
        

// @LINE:13
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     