// @SOURCE:C:/Users/Andrew/Documents/GitHub/Surferpedia/conf/routes
// @HASH:e70317c3cf2e1b9d7fedaaab72124fa68fc82cb6
// @DATE:Tue Oct 08 23:41:14 HST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:14
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def anastasia(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "anastasia")
}
                                                

// @LINE:9
def kyussk(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "kyussk")
}
                                                

// @LINE:8
def bill(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bill")
}
                                                

// @LINE:10
def adriano(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "adriano")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:14
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def anastasia : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.anastasia",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "anastasia"})
      }
   """
)
                        

// @LINE:9
def kyussk : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.kyussk",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kyussk"})
      }
   """
)
                        

// @LINE:8
def bill : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.bill",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bill"})
      }
   """
)
                        

// @LINE:10
def adriano : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.adriano",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adriano"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:14
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def anastasia(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.anastasia(), HandlerDef(this, "controllers.Application", "anastasia", Seq(), "GET", """""", _prefix + """anastasia""")
)
                      

// @LINE:9
def kyussk(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.kyussk(), HandlerDef(this, "controllers.Application", "kyussk", Seq(), "GET", """""", _prefix + """kyussk""")
)
                      

// @LINE:8
def bill(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.bill(), HandlerDef(this, "controllers.Application", "bill", Seq(), "GET", """""", _prefix + """bill""")
)
                      

// @LINE:10
def adriano(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.adriano(), HandlerDef(this, "controllers.Application", "adriano", Seq(), "GET", """""", _prefix + """adriano""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    