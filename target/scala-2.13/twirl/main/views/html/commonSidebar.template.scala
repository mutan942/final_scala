
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
import play.api.mvc._
import play.api.data._

object commonSidebar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/(""" """),_display_(/*1.6*/defining(play.core.PlayVersion.current)/*1.45*/ { version =>_display_(Seq[Any](format.raw/*1.58*/("""
"""),format.raw/*2.1*/("""<h3>Table of Contents</h3>
<h3>Related Resources</h3>
<ul>
    <li><a href="https://playframework.com/documentation/"""),_display_(/*5.59*/version),format.raw/*5.66*/("""" target="_blank">Play documentation</a></li>
    <li><a href="https://discuss.lightbend.com/c/play/" target="_blank">Forum</a></li>
    <li><a href="//gitter.im/playframework/playframework" target="_blank">Gitter Channel</a></li>
    <li><a href="//stackoverflow.com/questions/tagged/playframework" target="_blank">Stackoverflow</a></li>
    <li><a href="//lightbend.com/how" target="_blank">Professional support</a></li>
</ul>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-02T16:04:30.601
                  SOURCE: D:/Utama/Semester 7/Scala/scala_final/app/views/commonSidebar.scala.html
                  HASH: 90466fbbdbcaf068f48487b2c416496f94c3373d
                  MATRIX: 730->1|826->3|853->5|900->44|950->57|978->59|1124->179|1151->186
                  LINES: 21->1|26->1|26->1|26->1|26->1|27->2|30->5|30->5
                  -- GENERATED --
              */
          