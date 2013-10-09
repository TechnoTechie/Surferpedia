
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
object Adriano extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/Main("Adriano de Souza")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
   <div class="row">
  </div>
   <div class="row">
   <div class="col-md-4">
      <div class="well">
        <div class="adriano"></div>
      </div>
    </div>
    <div class="col-md-8">
      <div class="well">
        <h1 id="intro">Adriano de Souza</h1>
        <p class="page"> Adriano De Souza rode his first wave at eight years old and eight years later 
        the surf world would take notice of this young, talented surfer at the Billabong ASP World Junior Championships. 
        At the 2004 event, 
        he defeated opponents four years his senior and was named the youngest ASP World Junior Champion ever at 16.</p>
       <p class="page">Spectators observed his fast, energetic surfing and he quickly became known as one of the most exciting 
       surfers to watch. In 2005, he won the ASP WQS by the widest margin in history. 
       That win took him into his first year on the ASP World Tour where he finished an impressive 18th in the world. 
       Although his style is more conducive to smaller beachbreaks, 
       he is showing his competitors that he can also handle big wave surf, 
       giving his country hope that he has what it takes to transition from a junior champion to something much more. 
       To date, he's one of the most ferocious competitors the sport has ever seen and it shows in the ratings, 
       with consistent top 10 overall finishes since 2008, 
       positioning himself as a serious contender for a world title.</p>

      </div>
    </div>
  </div>
""")))})),format.raw/*32.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 08 23:41:18 HST 2013
                    SOURCE: C:/Users/Andrew/Documents/GitHub/Surferpedia/app/views/Adriano.scala.html
                    HASH: c8882c71e342b3459ee571c7b4f25c548336f3dc
                    MATRIX: 776->1|887->18|926->23|958->47|997->49|2572->1593
                    LINES: 26->1|29->1|31->3|31->3|31->3|60->32
                    -- GENERATED --
                */
            