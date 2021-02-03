// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Utama/Semester 7/Scala/scala_final/conf/routes
// @DATE:Tue Feb 02 19:46:09 SGT 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseClientSocket(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientSocket.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:13
    def latihan2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientSocket.latihan2",
      """
        function(stringku0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "minta2" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stringku", stringku0)])})
        }
      """
    )
  
    // @LINE:12
    def minta_balik: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientSocket.minta_balik",
      """
        function(stringku0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "minta" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stringku", stringku0)])})
        }
      """
    )
  
    // @LINE:9
    def jalanserver: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientSocket.jalanserver",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jalanserver"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def tutorial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tutorial",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorial"})
        }
      """
    )
  
    // @LINE:10
    def serverku: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.serverku",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serverku"})
        }
      """
    )
  
    // @LINE:8
    def explore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.explore",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "explore"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
