
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object Index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*2.2*/Main("Home")/*2.14*/ {_display_(Seq[Any](format.raw/*2.16*/("""
   <div class="container">

    <div class="well">
      <div id="carousel-example-generic" class="carousel slide">
        <!-- Indicators -->
        <ol class="carousel-indicators">
          <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
          <li data-target="#carousel-example-generic" data-slide-to="1"></li>
          <li data-target="#carousel-example-generic" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner">
          <div class="item active">
            <div class="carousel-1"></div>
            <div class="carousel-caption">
              <h3>Anastasia Ashley</h3>
            </div>
          </div>
          
          <div class="item">
            <div class="carousel-2"></div>
            <div class="carousel-caption">
              <h3>Bill Hamilton</h3>
            </div>
          </div>

          <div class="item">
            <div class="carousel-3"></div>
            <div class="carousel-caption">
              <h3>Kyuss King</h3>
            </div>
          </div>
        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev"> <span class="icon-prev"></span>
        </a> <a class="right carousel-control" href="#carousel-example-generic" data-slide="next"> <span
          class="icon-next"></span>
        </a>
      </div>
    </div>
  </div>
""")))})),format.raw/*46.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 08 19:45:53 HST 2013
                    SOURCE: /Users/TechnoTechie/git/surferpedia/app/views/Index.scala.html
                    HASH: 19a4802345efe57c21555d0bf70ad91055387897
                    MATRIX: 774->1|885->18|921->20|941->32|980->34|2472->1495
                    LINES: 26->1|29->1|30->2|30->2|30->2|74->46
                    -- GENERATED --
                */
            