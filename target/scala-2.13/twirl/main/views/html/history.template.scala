
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

object history extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.3*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.5*/(""" """),_display_(/*1.7*/main("Welcome")/*1.22*/ {_display_(Seq[Any](format.raw/*1.24*/(""" """),_display_(/*1.26*/defining(play.core.PlayVersion.current)/*1.65*/ { version =>_display_(Seq[Any](format.raw/*1.78*/("""
"""),format.raw/*2.1*/("""<div class="card">
    <div class="row">
        <div class="col-md-12">
            <div class="card">
                <div class="card-body">
                    <h5>History Kegiatan</h5>
                    <hr>
                    <table id="myTable" class="table">
                        <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Geometri</th>
                                <th scope="col">Ukuran</th>
                                <th scope="col">Luas</th>
                            </tr>
                        </thead>
                        <tbody id="bodyku">


                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    $.ajax("""),format.raw/*29.12*/("""{"""),format.raw/*29.13*/("""
        """),format.raw/*30.9*/("""url: '/hhh',
        type: 'GET',
        data: $(this).serialize(),
        success: function(data) """),format.raw/*33.33*/("""{"""),format.raw/*33.34*/("""
            """),format.raw/*34.13*/("""$('#bodyku').html(data)
            $('#myTable').DataTable();
        """),format.raw/*36.9*/("""}"""),format.raw/*36.10*/("""
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/(""");
</script>
""")))}),format.raw/*39.2*/(""" """)))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-02T16:04:30.615
                  SOURCE: D:/Utama/Semester 7/Scala/scala_final/app/views/history.scala.html
                  HASH: 81fc8649b7babc669020a6a5537827893ccd0c56
                  MATRIX: 724->2|820->4|847->6|870->21|909->23|937->25|984->64|1034->77|1062->79|1957->946|1986->947|2023->957|2155->1061|2184->1062|2226->1076|2326->1149|2355->1150|2388->1156|2416->1157|2462->1173
                  LINES: 21->1|26->1|26->1|26->1|26->1|26->1|26->1|26->1|27->2|54->29|54->29|55->30|58->33|58->33|59->34|61->36|61->36|62->37|62->37|64->39
                  -- GENERATED --
              */
          