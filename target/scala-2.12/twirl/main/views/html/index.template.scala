
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Home")/*2.14*/ {_display_(Seq[Any](format.raw/*2.16*/("""
  """),format.raw/*3.53*/("""
"""),format.raw/*4.1*/("""<h3>COre Design is a professional web design and online application
  development company based in Dublin, Ireland
  </h3>>
  <h4>We specialise in the following areas:</h4>
  <ul>
    <li>Web Design</li>
    <li>Content Managment</li>
    <li>Web application development</li>
    <li>Ecommerce and payment</li>
    <li>Security</li>
    <li>Search Engine Optimisation</li>
  </ul>
  <p>
    Please <a href="/contact">contact us</a>
    to discuss your requirments
  </p>
""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 17 16:30:13 GMT 2017
                  SOURCE: /media/sf_student/play-java-seed/app/views/index.scala.html
                  HASH: 24a8022148468423ab73f17a64ca12c6cac00fc6
                  MATRIX: 1030->2|1050->14|1089->16|1119->69|1146->70|1648->542
                  LINES: 33->2|33->2|33->2|34->3|35->4|51->20
                  -- GENERATED --
              */
          