package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.anastasia;
import views.html.bill;
import views.html.kyussk;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result anastasia() {
    return ok(anastasia.render("Anastasia Ashley"));
    
  }
 
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result bill() {
    return ok(bill.render("Bill Hamilton"));
    
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result kyussk() {
    return ok(kyussk.render("Kyuss King"));
    
  }  
}
