// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ipan/workspace/play-java-seed/conf/routes
// @DATE:Sun Mar 11 16:51:31 WIB 2018


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
