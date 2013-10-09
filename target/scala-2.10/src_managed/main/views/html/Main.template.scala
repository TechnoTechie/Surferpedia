
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
object Main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.31*/("""

<!DOCTYPE html>

<html>
<head>
<title>Surferpedia</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<!--  Load site-specific customizations after bootstrap. -->
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.46*/routes/*12.52*/.Assets.at("stylesheets/main.css"))),format.raw/*12.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*13.51*/routes/*13.57*/.Assets.at("images/favicon.png"))),format.raw/*13.89*/("""">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.2/html5shiv.js"></script>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.2.0/respond.js"></script>
        <![endif]-->
</head>
<body>

  <div class="header"></div>

  <!-- Responsive navbar -->
  <div class="navbar navbar-inverse" role="navigation">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <!--  Display three horizontal lines when navbar collapsed. -->
          <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/">Surferpedia</a>
      </div>
      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav">
        
          <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Males<b
              class="caret"></b></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href=""""),_display_(Seq[Any](/*41.29*/routes/*41.35*/.Application.bill())),format.raw/*41.54*/("""">Bill Hamilton</a></li>
              <li><a href=""""),_display_(Seq[Any](/*42.29*/routes/*42.35*/.Application.adriano())),format.raw/*42.57*/("""">Adriano de Souza</a></li>              
            </ul>
          </li>
            
            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Females<b
              class="caret"></b></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href=""""),_display_(Seq[Any](/*49.29*/routes/*49.35*/.Application.anastasia())),format.raw/*49.59*/("""">Anastasia Ashley</a></li>
            </ul>
          </li>
          
          <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Grom bio<b
              class="caret"></b></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href=""""),_display_(Seq[Any](/*56.29*/routes/*56.35*/.Application.kyussk())),format.raw/*56.56*/("""">Kyuss King</a></li>
            </ul>
          </li>
            
        </ul>
      </div>
    </div>
  </div>
  """),_display_(Seq[Any](/*64.4*/content)),format.raw/*64.11*/("""
  <!-- Load Bootstrap JavaScript components. HTMLUnit (used in testing) requires JQuery 1.8.3 or below). -->
  <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
  <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
</body>
</html>
"""))}
    }
    
    def render(page:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(page)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (page) => (content) => apply(page)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 08 23:41:19 HST 2013
                    SOURCE: C:/Users/Andrew/Documents/GitHub/Surferpedia/app/views/Main.scala.html
                    HASH: 0a69d1a8c6e444f8ba832cd52de1ebc0176da4a8
                    MATRIX: 778->1|901->30|1286->379|1301->385|1357->419|1447->473|1462->479|1516->511|2776->1735|2791->1741|2832->1760|2922->1814|2937->1820|2981->1842|3331->2156|3346->2162|3392->2186|3725->2483|3740->2489|3783->2510|3945->2637|3974->2644
                    LINES: 26->1|29->1|40->12|40->12|40->12|41->13|41->13|41->13|69->41|69->41|69->41|70->42|70->42|70->42|77->49|77->49|77->49|84->56|84->56|84->56|92->64|92->64
                    -- GENERATED --
                */
            