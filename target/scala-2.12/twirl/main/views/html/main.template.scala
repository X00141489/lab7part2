
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.3*/(pageID: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.34*/("""
 """),format.raw/*8.2*/("""<!DOCTYPE html>
 <html lang="en" id=""""),_display_(/*9.23*/pageID),format.raw/*9.29*/("""">
   <head>
     <title>Core Design -"""),_display_(/*11.27*/pageID),format.raw/*11.33*/("""</title>
     <link href =""""),_display_(/*12.20*/routes/*12.26*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.67*/("""" rel ="stylesheet" type ="text/css"/>
     <link href =""""),_display_(/*13.20*/routes/*13.26*/.Assets.versioned("stylesheets/Form.css")),format.raw/*13.67*/("""" rel ="stylesheet" type ="text/css"/>
   </head>
   <body>
     <div class="Container">
       <div id="Logo">
         <h1>Core Design</h1>
         <h3>
           <em>Website Design and Development Services</em>
         </h3>
       </div>
       <div id ="Nav"<div class ="active">
     <ul>
       <li><a href=""""),_display_(/*25.22*/routes/*25.28*/.HomeController.index()),format.raw/*25.51*/("""" class="home">Home</a></li>
       <li><a href=""""),_display_(/*26.22*/routes/*26.28*/.HomeController.about()),format.raw/*26.51*/("""" class="about">About Us</a></li>
       <li><a href=""""),_display_(/*27.22*/routes/*27.28*/.HomeController.services()),format.raw/*27.54*/("""" class="services">Services</a></li>
       <li><a href=""""),_display_(/*28.22*/routes/*28.28*/.HomeController.clients()),format.raw/*28.53*/("""" class="clients">Clients</a></li>
       <li><a href=""""),_display_(/*29.22*/routes/*29.28*/.HomeController.contact()),format.raw/*29.53*/("""" class="contact">Contact</a></li>
     </ul></div>

     </div>
     <div id ="Content">
         """),_display_(/*34.11*/content),format.raw/*34.18*/("""
     """),format.raw/*35.6*/("""</div>
     <div id="Footer">
         <h6>
             <em>copyright & copy; 2015  Core Design</em>
             </h6>
        
     </div>
     </div>
   </body>
 </html>"""))
      }
    }
  }

  def render(pageID:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pageID)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pageID) => (content) => apply(pageID)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 17 16:45:39 GMT 2017
                  SOURCE: /media/sf_student/play-java-seed/app/views/main.scala.html
                  HASH: cb29287a227799aebd2e90ad044317676b38cd75
                  MATRIX: 1206->261|1332->292|1360->294|1424->332|1450->338|1516->377|1543->383|1598->411|1613->417|1675->458|1760->516|1775->522|1837->563|2183->882|2198->888|2242->911|2319->961|2334->967|2378->990|2460->1045|2475->1051|2522->1077|2607->1135|2622->1141|2668->1166|2751->1222|2766->1228|2812->1253|2939->1353|2967->1360|3000->1366
                  LINES: 33->7|38->7|39->8|40->9|40->9|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|65->34|65->34|66->35
                  -- GENERATED --
              */
          