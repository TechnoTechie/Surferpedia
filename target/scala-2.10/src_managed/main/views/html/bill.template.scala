
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
object bill extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/(""" 
"""),_display_(Seq[Any](/*2.2*/Main("Home")/*2.14*/ {_display_(Seq[Any](format.raw/*2.16*/("""
   <div class="container">
     <div class="row">
        <div class=col-md-4>
            <div class="well">
                <div class="bill"></div>
            </div>
        </div>
        <div class=col-md-8>
            <div class="well">
                <h1>Bill Hamilton</h1>
                <p>was born in Long Beach, California, where he and his half-brother, Gordon, surfed SouthLaguna Beach. In 1959, Hamilton was riding a Hobie double-ender, anywhere from Rincon to Baja. Winning the Junior Division of theBrooks Street Classic in 1963 earned Hamilton membership into the prestigious Windansea Surf Club. He joined them for the annual Makaha Championships the following year. In 1966, he returned to Hawaii and was acknowledged as one of the most popular surfers around, placing sixth in the Surfer Poll. The young filmmaking duo of MacGillivray/Freeman chose him to co-star with Mark Martinson in two monumental films, Free and Easy andSunshine Sea. He placed second at both the Smirnoff and Duke, in 1970. But, family took priority and he soon left the scene behind.</p>
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
                    SOURCE: /Users/TechnoTechie/git/surferpedia/app/views/bill.scala.html
                    HASH: 2681ddd16462713dd15e1baebe247ab002165413
                    MATRIX: 773->1|884->18|921->21|941->33|980->35|2155->1179
                    LINES: 26->1|29->1|30->2|30->2|30->2|46->18
                    -- GENERATED --
                */
            