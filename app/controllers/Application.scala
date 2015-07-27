package controllers

import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index(1))
  }

  /******************************
    *  ToDo
    ******************************/

  def toDoLater = TODO

  /******************************
   *  Different Types of Actions
   ******************************/

  def noReferenceAction = Action {
    Ok("This Action Has No Reference!")
  }

  def passingArgumentAction = Action { request =>
    val abc = request.getQueryString("key")
    Ok("Got request [" + abc.toString() + "]")
  }


  /******************************
    *
    *
    ******************************/

}
