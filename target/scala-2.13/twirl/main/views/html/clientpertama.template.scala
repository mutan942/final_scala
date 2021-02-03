
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

object clientpertama extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Welcome")/*1.17*/ {_display_(Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<div class="row">
    <div class="col-md-3">
    </div>
    <div class="col-md-5">
        <div class="messaging">
            <div class="inbox_msg">
                <div class="mesgs">
                    <div class="msg_history">
                    </div>
                    <div class="type_msg">
                        <div class="input_msg_write">
                            <form id="form_minta">
                                <input autocomplete="off" type="text" name="stringku" id="stringku" style="outline: none;" class="write_msg" placeholder="Type a message" />
                                <button style="outline: none;" class="msg_send_btn" type="submit"><i class="fa fa-paper-plane-o" aria-hidden="true"></i></button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="col-md-4">

</div>

<script>
    $('#form_minta').on('submit', function(e) """),format.raw/*30.47*/("""{"""),format.raw/*30.48*/("""
        """),format.raw/*31.9*/("""e.preventDefault();
        var d = new Date();
        var tam = $('.msg_history').html()
        var tam2 = '<div class="outgoing_msg"><div class="sent_msg"><p>' + $('#stringku').val() + '</p><span class="time_date">' + d.getFullYear() + "/" + (d.getMonth() + 1) + "/" + d.getDate() + '</span> </div></div>';
        $('.msg_history').html(tam + tam2)
        $.ajax("""),format.raw/*36.16*/("""{"""),format.raw/*36.17*/("""
            """),format.raw/*37.13*/("""url: '/minta',
            type: 'GET',
            data: $(this).serialize(),
            success: function(data) """),format.raw/*40.37*/("""{"""),format.raw/*40.38*/("""
                """),format.raw/*41.17*/("""var tam = $('.msg_history').html()
                $('.msg_history').html(tam + data)
                $('#stringku').val('')
                $(".msg_history").animate("""),format.raw/*44.43*/("""{"""),format.raw/*44.44*/("""
                    """),format.raw/*45.21*/("""scrollTop: $(
                        '.msg_history').get(0).scrollHeight
                """),format.raw/*47.17*/("""}"""),format.raw/*47.18*/(""", 2000);
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/("""
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/(""");
    """),format.raw/*50.5*/("""}"""),format.raw/*50.6*/(""")

    /* setInterval(function() """),format.raw/*52.31*/("""{"""),format.raw/*52.32*/("""
         """),format.raw/*53.10*/("""$.ajax("""),format.raw/*53.17*/("""{"""),format.raw/*53.18*/("""
             """),format.raw/*54.14*/("""url: '/jalanserver',
             type: 'GET',
             success: function(data) """),format.raw/*56.38*/("""{"""),format.raw/*56.39*/("""
                 """),format.raw/*57.18*/("""console.log(data)
             """),format.raw/*58.14*/("""}"""),format.raw/*58.15*/("""
         """),format.raw/*59.10*/("""}"""),format.raw/*59.11*/(""");
         // console.log('ade');
     """),format.raw/*61.6*/("""}"""),format.raw/*61.7*/(""", 1);*/
</script>
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
                  DATE: 2021-02-03T12:53:40.636
                  SOURCE: D:/Utama/Semester 7/Scala/scala_final/app/views/clientpertama.scala.html
                  HASH: 1d4a9981cc0c7ccd708b007ab4f7a441e03cfeb8
                  MATRIX: 819->1|842->16|881->18|909->20|1965->1048|1994->1049|2031->1059|2433->1433|2462->1434|2504->1448|2650->1566|2679->1567|2725->1585|2923->1755|2952->1756|3002->1778|3122->1870|3151->1871|3201->1893|3230->1894|3267->1904|3296->1905|3331->1913|3359->1914|3422->1949|3451->1950|3490->1961|3525->1968|3554->1969|3597->1984|3711->2070|3740->2071|3787->2090|3847->2122|3876->2123|3915->2134|3944->2135|4013->2177|4041->2178
                  LINES: 26->1|26->1|26->1|27->2|55->30|55->30|56->31|61->36|61->36|62->37|65->40|65->40|66->41|69->44|69->44|70->45|72->47|72->47|73->48|73->48|74->49|74->49|75->50|75->50|77->52|77->52|78->53|78->53|78->53|79->54|81->56|81->56|82->57|83->58|83->58|84->59|84->59|86->61|86->61
                  -- GENERATED --
              */
          