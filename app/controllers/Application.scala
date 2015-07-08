package controllers

import play.api.Play
import play.api.mvc._

import scala.io.Source
import play.api.libs.json._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index(1))
  }

}
