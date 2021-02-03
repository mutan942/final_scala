// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Utama/Semester 7/Scala/scala_final/conf/routes
// @DATE:Tue Feb 02 19:46:09 SGT 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
