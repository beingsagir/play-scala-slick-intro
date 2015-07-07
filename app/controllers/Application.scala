package controllers

import play.api.Play
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def home = Action {
    val projectRoot = Play.current.path
    // val absolutePath = Play.current().path().getAbsolutePath()
    // val filename = "fileopen.scala"

/*    val fpu = new FileProcessorUtility("test.txt")
    fpu.readFile

    File fileo = new File(projectRoot.asText()); */
    Ok(views.html.index("ok"))
  }
}
