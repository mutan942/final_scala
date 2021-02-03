// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Utama/Semester 7/Scala/scala_final/conf/routes
// @DATE:Tue Feb 02 19:46:09 SGT 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseClientSocket(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:13
    def latihan2(stringku:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "minta2" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stringku", stringku)))))
    }
  
    // @LINE:12
    def minta_balik(stringku:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "minta" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stringku", stringku)))))
    }
  
    // @LINE:9
    def jalanserver(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "jalanserver")
    }
  
  }

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def tutorial(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tutorial")
    }
  
    // @LINE:10
    def serverku(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "serverku")
    }
  
    // @LINE:8
    def explore(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explore")
    }
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
