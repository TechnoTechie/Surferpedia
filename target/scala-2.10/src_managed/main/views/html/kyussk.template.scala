
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
object kyussk extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""
"""),_display_(Seq[Any](/*2.2*/Main("kyussk")/*2.16*/ {_display_(Seq[Any](format.raw/*2.18*/("""
   <div class="container">
     <div class="row">
        <div class=col-md-4>
            <div class="well">
                <div class="kyussk"></div>
            </div>
        </div>
        <div class=col-md-8>
            <div class="well">
                <h1>Kyuss King</h1>
                <p>Kyuss started surfing at the age of 2, surfing small days out the Pass on the front of his dads Mal, Kyuss would stand tall and ride the waves to shore clapping his hands, turn to his dad and say “MORE” Kyuss took to surfing like he’d done it in another life, Kyuss was always keen to get out there, onshore, rain, blue bottles, Kyuss wanted to go.</p>
                <p>At the age of 4 Kyuss featured on the front cover of the local newspaper surfing across a green face solo out the Pass and with a stance that true of a grounded point surfer… Kyuss’s surfing talents were soon noticed by the surf brands and was sponsored by Volcom at the age of 6. Kyuss loved competing and went on to win many national junior events over the past years and recently claimed the 2011 U12 NSW State Titles Championship and added 2 perfect 10 point rides at state level.</p>
                <p>Kyuss has been travelling the world with his family, chasing the sun, surfing new waves, making new friends, living different cultures and learning life. Kyuss’s passion are surfing, skating, guitar, music and art. Kyuss is also a historian and keen collector. Kyuss loves 90’s Indy Rock, Old School Movies, Collecting Retro Skate Boards, and Surfboards, fashion from the 70′s and 80′s, American Muscle Cars and so on.</p>
            </div>
        </div>
     </div>
   </div>
""")))})),format.raw/*20.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 08 19:45:53 HST 2013
                    SOURCE: /Users/TechnoTechie/git/surferpedia/app/views/kyussk.scala.html
                    HASH: f5b71d8ab35d02c6f0c898736329cfcd6734de07
                    MATRIX: 775->1|886->18|922->20|944->34|983->36|2677->1699
                    LINES: 26->1|29->1|30->2|30->2|30->2|48->20
                    -- GENERATED --
                */
            