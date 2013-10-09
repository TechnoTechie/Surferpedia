
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
object anastasia extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/(""" 
"""),_display_(Seq[Any](/*2.2*/Main("anastasia")/*2.19*/ {_display_(Seq[Any](format.raw/*2.21*/("""
   <div class="container">
     <div class="row">
        <div class=col-md-4>
            <div class="well">
                <div class="anastasia"></div>
            </div>
        </div>
        <div class=col-md-8>
            <div class="well">
                <h1>Anastasia Ashley</h1>
                <p>There’s “hot” hot and there’s “red-hot-and-I-know-it” hot. Consider 21-year old LA-based surfer girl Anastasia Ashley the latter. Anastasia, who plans to surf all the women’s WQS she can this year, has her own signature shoe line with Airwalk and is getting to work on an as of yet untitled film project. In between shoes, films, and shredding, Anastasia has been spending a lot of time with Hulk Hogan’s son, Nick, whom she calls her best friend and her biggest fan. The pair were recently stalked by the paparazzi at the Sundance Film Festival and their photo appeared in Star Magazine with the fitting title, “Nick’s New Surfer Babe.” Selfishly, we want Anastasia to make the World Championship Tour just to see who wears a smaller bikini—her or Alana Blanchard.</p>
            </div>
        </div>
     </div>
   </div>
""")))})),format.raw/*18.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 08 19:45:53 HST 2013
                    SOURCE: /Users/TechnoTechie/git/surferpedia/app/views/anastasia.scala.html
                    HASH: 926fe6f2cfaa6bc0a6a8e6e821bfa4b3c7d06d81
                    MATRIX: 778->1|889->18|926->21|951->38|990->40|2160->1179
                    LINES: 26->1|29->1|30->2|30->2|30->2|46->18
                    -- GENERATED --
                */
            