
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

object serverku extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.3*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.5*/(""" """),_display_(/*1.7*/main("Welcome")/*1.22*/ {_display_(Seq[Any](format.raw/*1.24*/(""" """),_display_(/*1.26*/defining(play.core.PlayVersion.current)/*1.65*/ { version =>_display_(Seq[Any](format.raw/*1.78*/("""

"""),format.raw/*3.1*/("""<div class="row">
    <div class="col-md-4">

    </div>

    <div class="col-md-4">
        <div class="row">
            <div class="col-md-9"> <input type="text" name="ade" class="form-control" id="ade" placeholder="Socket"></div>
            <div class="col-md-3"><button onclick="setsoket()" class="btn btn-danger">Set Soket</button></div>
        </div>
        <hr>
        <div class="messaging">
            <div class="inbox_msg">

                <div class="mesgs">
                    <div class="msg_history">
                        <div class="incoming_msg">
                            <div class="incoming_msg_img"> <img src="https://ptetutorials.com/images/user-profile.png" alt="sunil"> </div>
                            <div class="received_msg">
                                <div class="received_withd_msg">
                                    <p>Test which is a new approach to have all solutions
                                    </p>
                                    <span class="time_date"> 11:01 AM    |    June 9</span></div>
                            </div>
                        </div>
                        <div class="outgoing_msg">
                            <div class="sent_msg">
                                <p>Test which is a new approach to have all solutions
                                </p>
                                <span class="time_date"> 11:01 AM    |    June 9</span> </div>
                        </div>

                    </div>
                    <div class="type_msg">
                        <div class="input_msg_write">
                            <form>
                                <input type="text" style="outline: none;" class="write_msg" placeholder="Type a message" />
                                <button style="outline: none;" class="msg_send_btn" type="button"><i class="fa fa-paper-plane-o" aria-hidden="true"></i></button>
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
    var soket = 0;
    $('#clientku').on('submit', function(e) """),format.raw/*56.45*/("""{"""),format.raw/*56.46*/("""
        """),format.raw/*57.9*/("""e.preventDefault();
        $.ajax("""),format.raw/*58.16*/("""{"""),format.raw/*58.17*/("""
            """),format.raw/*59.13*/("""url: '/minta',
            type: 'GET',
            data: $(this).serialize(),
            success: function(data) """),format.raw/*62.37*/("""{"""),format.raw/*62.38*/("""
                """),format.raw/*63.17*/("""$('.response').html(data)
            """),format.raw/*64.13*/("""}"""),format.raw/*64.14*/("""
        """),format.raw/*65.9*/("""}"""),format.raw/*65.10*/(""");
    """),format.raw/*66.5*/("""}"""),format.raw/*66.6*/(""")

    function setsoket() """),format.raw/*68.25*/("""{"""),format.raw/*68.26*/("""
        """),format.raw/*69.9*/("""var a = $('#ade').val();
        soket = a;
        alert(a)
    """),format.raw/*72.5*/("""}"""),format.raw/*72.6*/("""

    """),format.raw/*74.5*/("""setInterval(function() """),format.raw/*74.28*/("""{"""),format.raw/*74.29*/("""
        """),format.raw/*75.9*/("""$.ajax("""),format.raw/*75.16*/("""{"""),format.raw/*75.17*/("""
            """),format.raw/*76.13*/("""url: '/jalanserver',
            type: 'GET',
            data: $(this).serialize(),
            success: function(data) """),format.raw/*79.37*/("""{"""),format.raw/*79.38*/("""
                """),format.raw/*80.17*/("""$('.response2').html(data)
            """),format.raw/*81.13*/("""}"""),format.raw/*81.14*/("""
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/(""");
    """),format.raw/*83.5*/("""}"""),format.raw/*83.6*/(""", 1000);
</script>
""")))}),format.raw/*85.2*/(""" """)))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-03T08:24:43.329
                  SOURCE: D:/Utama/Semester 7/Scala/scala_final/app/views/serverku.scala.html
                  HASH: 47254d84a879f548b23fbb89e24a6c2abb322795
                  MATRIX: 725->2|821->4|848->6|871->21|910->23|938->25|985->64|1035->77|1065->81|3346->2334|3375->2335|3412->2345|3476->2381|3505->2382|3547->2396|3693->2514|3722->2515|3768->2533|3835->2572|3864->2573|3901->2583|3930->2584|3965->2592|3993->2593|4050->2622|4079->2623|4116->2633|4211->2701|4239->2702|4274->2710|4325->2733|4354->2734|4391->2744|4426->2751|4455->2752|4497->2766|4649->2890|4678->2891|4724->2909|4792->2949|4821->2950|4858->2960|4887->2961|4922->2969|4950->2970|5002->2992
                  LINES: 21->1|26->1|26->1|26->1|26->1|26->1|26->1|26->1|28->3|81->56|81->56|82->57|83->58|83->58|84->59|87->62|87->62|88->63|89->64|89->64|90->65|90->65|91->66|91->66|93->68|93->68|94->69|97->72|97->72|99->74|99->74|99->74|100->75|100->75|100->75|101->76|104->79|104->79|105->80|106->81|106->81|107->82|107->82|108->83|108->83|110->85
                  -- GENERATED --
              */
          