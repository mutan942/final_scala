
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.3*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.5*/(""" """),_display_(/*1.7*/main("Welcome")/*1.22*/ {_display_(Seq[Any](format.raw/*1.24*/(""" """),_display_(/*1.26*/defining(play.core.PlayVersion.current)/*1.65*/ { version =>_display_(Seq[Any](format.raw/*1.78*/("""
"""),format.raw/*2.1*/("""<div class="row">
    <div class="col-md-4">
        <div class="card"><br>
            <div class="card-body">
                <h5>Segitiga</h5>
                <hr>
                <form id="segitiga">
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Alas</label>
                        <input name="alas" type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Tinggi</label>
                        <input name="tinggi" type="number" class="form-control" id="exampleInputPassword1">
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Luas</label>
                        <input id="h_segitiga" readonly type="number" class="form-control" id="exampleInputPassword1">
                    </div>
                    <button type="submit" class="btn btn-primary">Hitung dan Simpan</button>
                </form>
            </div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="card">
            <div class="card-body">
                <h5>Lingkaran</h5>
                <hr>
                <form id="lingkaran">
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Jari jari</label>
                        <input name="jari" type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Luas</label>
                        <input id="h_lingkaran" readonly type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    </div>
                    <button type="submit" class="btn btn-primary">Hitung dan Simpan</button>
                </form>
            </div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="card">
            <div class="card-body">
                <h5>Persegi Panjang</h5>
                <hr>
                <form id="persegipanjang">
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Panjang</label>
                        <input name="panjang" type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Lebar</label>
                        <input name="lebar" type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Luas</label>
                        <input id="h_pp" readonly type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    </div>
                    <button type="submit" class="btn btn-primary">Hitung dan Simpan</button>
                </form>
            </div>
        </div>
    </div>
</div>
<script>
    $('#segitiga').on('submit', function(e) """),format.raw/*70.45*/("""{"""),format.raw/*70.46*/("""
        """),format.raw/*71.9*/("""e.preventDefault();
        $.ajax("""),format.raw/*72.16*/("""{"""),format.raw/*72.17*/("""
            """),format.raw/*73.13*/("""url: '/hitung_s',
            type: 'GET',
            data: $(this).serialize(),
            success: function(data) """),format.raw/*76.37*/("""{"""),format.raw/*76.38*/("""
                """),format.raw/*77.17*/("""$('#h_segitiga').val(data)
            """),format.raw/*78.13*/("""}"""),format.raw/*78.14*/("""
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/(""");
    """),format.raw/*80.5*/("""}"""),format.raw/*80.6*/(""")

    $('#lingkaran').on('submit', function(e) """),format.raw/*82.46*/("""{"""),format.raw/*82.47*/("""
        """),format.raw/*83.9*/("""e.preventDefault();
        $.ajax("""),format.raw/*84.16*/("""{"""),format.raw/*84.17*/("""
            """),format.raw/*85.13*/("""url: '/hitung_l',
            type: 'GET',
            data: $(this).serialize(),
            success: function(data) """),format.raw/*88.37*/("""{"""),format.raw/*88.38*/("""
                """),format.raw/*89.17*/("""$('#h_lingkaran').val(data)
            """),format.raw/*90.13*/("""}"""),format.raw/*90.14*/("""
        """),format.raw/*91.9*/("""}"""),format.raw/*91.10*/(""");
    """),format.raw/*92.5*/("""}"""),format.raw/*92.6*/(""")

    $('#persegipanjang').on('submit', function(e) """),format.raw/*94.51*/("""{"""),format.raw/*94.52*/("""
        """),format.raw/*95.9*/("""e.preventDefault();
        $.ajax("""),format.raw/*96.16*/("""{"""),format.raw/*96.17*/("""
            """),format.raw/*97.13*/("""url: '/hitung_p',
            type: 'GET',
            data: $(this).serialize(),
            success: function(data) """),format.raw/*100.37*/("""{"""),format.raw/*100.38*/("""
                """),format.raw/*101.17*/("""$('#h_pp').val(data)
            """),format.raw/*102.13*/("""}"""),format.raw/*102.14*/("""
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/(""");
    """),format.raw/*104.5*/("""}"""),format.raw/*104.6*/(""")
</script>
""")))}),format.raw/*106.2*/(""" """)))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-02T16:04:30.621
                  SOURCE: D:/Utama/Semester 7/Scala/scala_final/app/views/index.scala.html
                  HASH: 76fb9d4559e9c2bea9b53cae151f0cb919ca30ae
                  MATRIX: 722->2|818->4|845->6|868->21|907->23|935->25|982->64|1032->77|1060->79|4578->3569|4607->3570|4644->3580|4708->3616|4737->3617|4779->3631|4928->3752|4957->3753|5003->3771|5071->3811|5100->3812|5137->3822|5166->3823|5201->3831|5229->3832|5307->3882|5336->3883|5373->3893|5437->3929|5466->3930|5508->3944|5657->4065|5686->4066|5732->4084|5801->4125|5830->4126|5867->4136|5896->4137|5931->4145|5959->4146|6042->4201|6071->4202|6108->4212|6172->4248|6201->4249|6243->4263|6393->4384|6423->4385|6470->4403|6533->4437|6563->4438|6601->4448|6631->4449|6667->4457|6696->4458|6742->4473
                  LINES: 21->1|26->1|26->1|26->1|26->1|26->1|26->1|26->1|27->2|95->70|95->70|96->71|97->72|97->72|98->73|101->76|101->76|102->77|103->78|103->78|104->79|104->79|105->80|105->80|107->82|107->82|108->83|109->84|109->84|110->85|113->88|113->88|114->89|115->90|115->90|116->91|116->91|117->92|117->92|119->94|119->94|120->95|121->96|121->96|122->97|125->100|125->100|126->101|127->102|127->102|128->103|128->103|129->104|129->104|131->106
                  -- GENERATED --
              */
          