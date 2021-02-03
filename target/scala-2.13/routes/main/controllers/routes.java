// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Utama/Semester 7/Scala/scala_final/conf/routes
// @DATE:Tue Feb 02 19:46:09 SGT 2021

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseClientSocket ClientSocket = new controllers.ReverseClientSocket(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseClientSocket ClientSocket = new controllers.javascript.ReverseClientSocket(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
