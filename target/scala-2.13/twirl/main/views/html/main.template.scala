
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /* * This template is called from the `index` template. This template * handles the rendering of the page header and body tags. It takes * two arguments, a `String` for the title of the page and an `Html` * object to insert into the body of the page.
*/
  def apply/*2.5*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.35*/("""

"""),format.raw/*4.1*/("""<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href='"""),_display_(/*12.18*/routes/*12.24*/.Assets.versioned("stylesheets/css/bootstrap.min.css")),format.raw/*12.78*/("""' rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <script src='"""),_display_(/*13.19*/routes/*13.25*/.Assets.versioned("stylesheets/js/bootstrap.bundle.min.js")),format.raw/*13.84*/("""' integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.23/datatables.min.css" />
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" type="text/css" rel="stylesheet">
    <script type="text/javascript" src="https://cdn.datatables.net/v/bs4/dt-1.10.23/datatables.min.js">
    </script>

    <title>SCALA SERVER</title>
    <style>
        .container """),format.raw/*22.20*/("""{"""),format.raw/*22.21*/("""
            """),format.raw/*23.13*/("""max-width: 1170px;
            margin: auto;
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/("""
        
        """),format.raw/*27.9*/("""img """),format.raw/*27.13*/("""{"""),format.raw/*27.14*/("""
            """),format.raw/*28.13*/("""max-width: 100%;
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/("""
        
        """),format.raw/*31.9*/(""".inbox_people """),format.raw/*31.23*/("""{"""),format.raw/*31.24*/("""
            """),format.raw/*32.13*/("""background: #f8f8f8 none repeat scroll 0 0;
            float: left;
            overflow: hidden;
            width: 40%;
            border-right: 1px solid #c4c4c4;
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""
        
        """),format.raw/*39.9*/(""".inbox_msg """),format.raw/*39.20*/("""{"""),format.raw/*39.21*/("""
            """),format.raw/*40.13*/("""border: 1px solid #c4c4c4;
            clear: both;
            overflow: hidden;
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/("""
        
        """),format.raw/*45.9*/(""".top_spac """),format.raw/*45.19*/("""{"""),format.raw/*45.20*/("""
            """),format.raw/*46.13*/("""margin: 20px 0 0;
        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/("""
        
        """),format.raw/*49.9*/(""".recent_heading """),format.raw/*49.25*/("""{"""),format.raw/*49.26*/("""
            """),format.raw/*50.13*/("""float: left;
            width: 40%;
        """),format.raw/*52.9*/("""}"""),format.raw/*52.10*/("""
        
        """),format.raw/*54.9*/(""".srch_bar """),format.raw/*54.19*/("""{"""),format.raw/*54.20*/("""
            """),format.raw/*55.13*/("""display: inline-block;
            text-align: right;
            width: 60%;
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/("""
        
        """),format.raw/*60.9*/(""".headind_srch """),format.raw/*60.23*/("""{"""),format.raw/*60.24*/("""
            """),format.raw/*61.13*/("""padding: 10px 29px 10px 20px;
            overflow: hidden;
            border-bottom: 1px solid #c4c4c4;
        """),format.raw/*64.9*/("""}"""),format.raw/*64.10*/("""
        
        """),format.raw/*66.9*/(""".recent_heading h4 """),format.raw/*66.28*/("""{"""),format.raw/*66.29*/("""
            """),format.raw/*67.13*/("""color: #05728f;
            font-size: 21px;
            margin: auto;
        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/("""
        
        """),format.raw/*72.9*/(""".srch_bar input """),format.raw/*72.25*/("""{"""),format.raw/*72.26*/("""
            """),format.raw/*73.13*/("""border: 1px solid #cdcdcd;
            border-width: 0 0 1px 0;
            width: 80%;
            padding: 2px 0 4px 6px;
            background: none;
        """),format.raw/*78.9*/("""}"""),format.raw/*78.10*/("""
        
        """),format.raw/*80.9*/(""".srch_bar .input-group-addon button """),format.raw/*80.45*/("""{"""),format.raw/*80.46*/("""
            """),format.raw/*81.13*/("""background: rgba(0, 0, 0, 0) none repeat scroll 0 0;
            border: medium none;
            padding: 0;
            color: #707070;
            font-size: 18px;
        """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/("""
        
        """),format.raw/*88.9*/(""".srch_bar .input-group-addon """),format.raw/*88.38*/("""{"""),format.raw/*88.39*/("""
            """),format.raw/*89.13*/("""margin: 0 0 0 -27px;
        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/("""
        
        """),format.raw/*92.9*/(""".chat_ib h5 """),format.raw/*92.21*/("""{"""),format.raw/*92.22*/("""
            """),format.raw/*93.13*/("""font-size: 15px;
            color: #464646;
            margin: 0 0 8px 0;
        """),format.raw/*96.9*/("""}"""),format.raw/*96.10*/("""
        
        """),format.raw/*98.9*/(""".chat_ib h5 span """),format.raw/*98.26*/("""{"""),format.raw/*98.27*/("""
            """),format.raw/*99.13*/("""font-size: 13px;
            float: right;
        """),format.raw/*101.9*/("""}"""),format.raw/*101.10*/("""
        
        """),format.raw/*103.9*/(""".chat_ib p """),format.raw/*103.20*/("""{"""),format.raw/*103.21*/("""
            """),format.raw/*104.13*/("""font-size: 14px;
            color: #989898;
            margin: auto
        """),format.raw/*107.9*/("""}"""),format.raw/*107.10*/("""
        
        """),format.raw/*109.9*/(""".chat_img """),format.raw/*109.19*/("""{"""),format.raw/*109.20*/("""
            """),format.raw/*110.13*/("""float: left;
            width: 11%;
        """),format.raw/*112.9*/("""}"""),format.raw/*112.10*/("""
        
        """),format.raw/*114.9*/(""".chat_ib """),format.raw/*114.18*/("""{"""),format.raw/*114.19*/("""
            """),format.raw/*115.13*/("""float: left;
            padding: 0 0 0 15px;
            width: 88%;
        """),format.raw/*118.9*/("""}"""),format.raw/*118.10*/("""
        
        """),format.raw/*120.9*/(""".chat_people """),format.raw/*120.22*/("""{"""),format.raw/*120.23*/("""
            """),format.raw/*121.13*/("""overflow: hidden;
            clear: both;
        """),format.raw/*123.9*/("""}"""),format.raw/*123.10*/("""
        
        """),format.raw/*125.9*/(""".chat_list """),format.raw/*125.20*/("""{"""),format.raw/*125.21*/("""
            """),format.raw/*126.13*/("""border-bottom: 1px solid #c4c4c4;
            margin: 0;
            padding: 18px 16px 10px;
        """),format.raw/*129.9*/("""}"""),format.raw/*129.10*/("""
        
        """),format.raw/*131.9*/(""".inbox_chat """),format.raw/*131.21*/("""{"""),format.raw/*131.22*/("""
            """),format.raw/*132.13*/("""height: 550px;
            overflow-y: scroll;
        """),format.raw/*134.9*/("""}"""),format.raw/*134.10*/("""
        
        """),format.raw/*136.9*/(""".active_chat """),format.raw/*136.22*/("""{"""),format.raw/*136.23*/("""
            """),format.raw/*137.13*/("""background: #ebebeb;
        """),format.raw/*138.9*/("""}"""),format.raw/*138.10*/("""
        
        """),format.raw/*140.9*/(""".incoming_msg_img """),format.raw/*140.27*/("""{"""),format.raw/*140.28*/("""
            """),format.raw/*141.13*/("""display: inline-block;
            width: 6%;
        """),format.raw/*143.9*/("""}"""),format.raw/*143.10*/("""
        
        """),format.raw/*145.9*/(""".received_msg """),format.raw/*145.23*/("""{"""),format.raw/*145.24*/("""
            """),format.raw/*146.13*/("""display: inline-block;
            padding: 0 0 0 10px;
            vertical-align: top;
            width: 92%;
        """),format.raw/*150.9*/("""}"""),format.raw/*150.10*/("""
        
        """),format.raw/*152.9*/(""".received_withd_msg p """),format.raw/*152.31*/("""{"""),format.raw/*152.32*/("""
            """),format.raw/*153.13*/("""background: #ebebeb none repeat scroll 0 0;
            border-radius: 3px;
            color: #646464;
            font-size: 14px;
            margin: 0;
            padding: 5px 10px 5px 12px;
            width: 100%;
        """),format.raw/*160.9*/("""}"""),format.raw/*160.10*/("""
        
        """),format.raw/*162.9*/(""".time_date """),format.raw/*162.20*/("""{"""),format.raw/*162.21*/("""
            """),format.raw/*163.13*/("""color: #747474;
            display: block;
            font-size: 12px;
            margin: 8px 0 0;
        """),format.raw/*167.9*/("""}"""),format.raw/*167.10*/("""
        
        """),format.raw/*169.9*/(""".received_withd_msg """),format.raw/*169.29*/("""{"""),format.raw/*169.30*/("""
            """),format.raw/*170.13*/("""width: 57%;
        """),format.raw/*171.9*/("""}"""),format.raw/*171.10*/("""
        
        """),format.raw/*173.9*/(""".mesgs """),format.raw/*173.16*/("""{"""),format.raw/*173.17*/("""
            """),format.raw/*174.13*/("""float: left;
            padding: 30px 15px 0 25px;
            width: 100%;
        """),format.raw/*177.9*/("""}"""),format.raw/*177.10*/("""
        
        """),format.raw/*179.9*/(""".sent_msg p """),format.raw/*179.21*/("""{"""),format.raw/*179.22*/("""
            """),format.raw/*180.13*/("""background: #05728f none repeat scroll 0 0;
            border-radius: 3px;
            font-size: 14px;
            margin: 0;
            color: #fff;
            padding: 5px 10px 5px 12px;
            width: 100%;
        """),format.raw/*187.9*/("""}"""),format.raw/*187.10*/("""
        
        """),format.raw/*189.9*/(""".outgoing_msg """),format.raw/*189.23*/("""{"""),format.raw/*189.24*/("""
            """),format.raw/*190.13*/("""overflow: hidden;
            margin: 26px 0 26px;
        """),format.raw/*192.9*/("""}"""),format.raw/*192.10*/("""
        
        """),format.raw/*194.9*/(""".sent_msg """),format.raw/*194.19*/("""{"""),format.raw/*194.20*/("""
            """),format.raw/*195.13*/("""float: right;
            width: 46%;
        """),format.raw/*197.9*/("""}"""),format.raw/*197.10*/("""
        
        """),format.raw/*199.9*/(""".input_msg_write input """),format.raw/*199.32*/("""{"""),format.raw/*199.33*/("""
            """),format.raw/*200.13*/("""background: rgba(0, 0, 0, 0) none repeat scroll 0 0;
            border: medium none;
            color: #4c4c4c;
            font-size: 15px;
            min-height: 48px;
            width: 100%;
        """),format.raw/*206.9*/("""}"""),format.raw/*206.10*/("""
        
        """),format.raw/*208.9*/(""".type_msg """),format.raw/*208.19*/("""{"""),format.raw/*208.20*/("""
            """),format.raw/*209.13*/("""border-top: 1px solid #c4c4c4;
            position: relative;
        """),format.raw/*211.9*/("""}"""),format.raw/*211.10*/("""
        
        """),format.raw/*213.9*/(""".msg_send_btn """),format.raw/*213.23*/("""{"""),format.raw/*213.24*/("""
            """),format.raw/*214.13*/("""background: #05728f none repeat scroll 0 0;
            border: medium none;
            border-radius: 50%;
            color: #fff;
            cursor: pointer;
            font-size: 17px;
            height: 33px;
            position: absolute;
            right: 0;
            top: 11px;
            width: 33px;
        """),format.raw/*225.9*/("""}"""),format.raw/*225.10*/("""
        
        """),format.raw/*227.9*/(""".messaging """),format.raw/*227.20*/("""{"""),format.raw/*227.21*/("""
            """),format.raw/*228.13*/("""padding: 0 0 50px 0;
        """),format.raw/*229.9*/("""}"""),format.raw/*229.10*/("""
        
        """),format.raw/*231.9*/(""".msg_history """),format.raw/*231.22*/("""{"""),format.raw/*231.23*/("""
            """),format.raw/*232.13*/("""height: 516px;
            overflow-y: auto;
        """),format.raw/*234.9*/("""}"""),format.raw/*234.10*/("""
    """),format.raw/*235.5*/("""</style>
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
            <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
                <a class="navbar-brand" href="#">SCALA FINAL</a>
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="/">Client</a>
                    </li>
                    <!-- <li class="nav-item">
                        <a class="nav-link" href="/serverku">Server</a>
                    </li>-->
                </ul>
                <!--<form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>-->
            </div>
        </div>
    </nav>
    <div class="container-fluid">
        <hr> """),_display_(/*262.15*/content),format.raw/*262.22*/("""
    """),format.raw/*263.5*/("""</div>
</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-02T19:12:36.279
                  SOURCE: D:/Utama/Semester 7/Scala/scala_final/app/views/main.scala.html
                  HASH: 5b18408404d560466cc9569a044b7c879d5b1ea1
                  MATRIX: 983->256|1108->286|1138->290|1390->515|1405->521|1480->575|1654->722|1669->728|1749->787|2494->1504|2523->1505|2565->1519|2647->1574|2676->1575|2723->1595|2755->1599|2784->1600|2826->1614|2879->1640|2908->1641|2955->1661|2997->1675|3026->1676|3068->1690|3276->1871|3305->1872|3352->1892|3391->1903|3420->1904|3462->1918|3582->2011|3611->2012|3658->2032|3696->2042|3725->2043|3767->2057|3821->2084|3850->2085|3897->2105|3941->2121|3970->2122|4012->2136|4086->2183|4115->2184|4162->2204|4200->2214|4229->2215|4271->2229|4387->2318|4416->2319|4463->2339|4505->2353|4534->2354|4576->2368|4720->2485|4749->2486|4796->2506|4843->2525|4872->2526|4914->2540|5023->2622|5052->2623|5099->2643|5143->2659|5172->2660|5214->2674|5408->2841|5437->2842|5484->2862|5548->2898|5577->2899|5619->2913|5826->3093|5855->3094|5902->3114|5959->3143|5988->3144|6030->3158|6087->3188|6116->3189|6163->3209|6203->3221|6232->3222|6274->3236|6388->3323|6417->3324|6464->3344|6509->3361|6538->3362|6580->3376|6661->3429|6691->3430|6739->3450|6779->3461|6809->3462|6852->3476|6961->3557|6991->3558|7039->3578|7078->3588|7108->3589|7151->3603|7226->3650|7256->3651|7304->3671|7342->3680|7372->3681|7415->3695|7524->3776|7554->3777|7602->3797|7644->3810|7674->3811|7717->3825|7798->3878|7828->3879|7876->3899|7916->3910|7946->3911|7989->3925|8122->4030|8152->4031|8200->4051|8241->4063|8271->4064|8314->4078|8399->4135|8429->4136|8477->4156|8519->4169|8549->4170|8592->4184|8650->4214|8680->4215|8728->4235|8775->4253|8805->4254|8848->4268|8932->4324|8962->4325|9010->4345|9053->4359|9083->4360|9126->4374|9279->4499|9309->4500|9357->4520|9408->4542|9438->4543|9481->4557|9745->4793|9775->4794|9823->4814|9863->4825|9893->4826|9936->4840|10078->4954|10108->4955|10156->4975|10205->4995|10235->4996|10278->5010|10327->5031|10357->5032|10405->5052|10441->5059|10471->5060|10514->5074|10630->5162|10660->5163|10708->5183|10749->5195|10779->5196|10822->5210|11083->5443|11113->5444|11161->5464|11204->5478|11234->5479|11277->5493|11366->5554|11396->5555|11444->5575|11483->5585|11513->5586|11556->5600|11632->5648|11662->5649|11710->5669|11762->5692|11792->5693|11835->5707|12075->5919|12105->5920|12153->5940|12192->5950|12222->5951|12265->5965|12366->6038|12396->6039|12444->6059|12487->6073|12517->6074|12560->6088|12927->6427|12957->6428|13005->6448|13045->6459|13075->6460|13118->6474|13176->6504|13206->6505|13254->6525|13296->6538|13326->6539|13369->6553|13452->6608|13482->6609|13516->6615|14875->7946|14904->7953|14938->7959
                  LINES: 22->2|27->2|29->4|37->12|37->12|37->12|38->13|38->13|38->13|47->22|47->22|48->23|50->25|50->25|52->27|52->27|52->27|53->28|54->29|54->29|56->31|56->31|56->31|57->32|62->37|62->37|64->39|64->39|64->39|65->40|68->43|68->43|70->45|70->45|70->45|71->46|72->47|72->47|74->49|74->49|74->49|75->50|77->52|77->52|79->54|79->54|79->54|80->55|83->58|83->58|85->60|85->60|85->60|86->61|89->64|89->64|91->66|91->66|91->66|92->67|95->70|95->70|97->72|97->72|97->72|98->73|103->78|103->78|105->80|105->80|105->80|106->81|111->86|111->86|113->88|113->88|113->88|114->89|115->90|115->90|117->92|117->92|117->92|118->93|121->96|121->96|123->98|123->98|123->98|124->99|126->101|126->101|128->103|128->103|128->103|129->104|132->107|132->107|134->109|134->109|134->109|135->110|137->112|137->112|139->114|139->114|139->114|140->115|143->118|143->118|145->120|145->120|145->120|146->121|148->123|148->123|150->125|150->125|150->125|151->126|154->129|154->129|156->131|156->131|156->131|157->132|159->134|159->134|161->136|161->136|161->136|162->137|163->138|163->138|165->140|165->140|165->140|166->141|168->143|168->143|170->145|170->145|170->145|171->146|175->150|175->150|177->152|177->152|177->152|178->153|185->160|185->160|187->162|187->162|187->162|188->163|192->167|192->167|194->169|194->169|194->169|195->170|196->171|196->171|198->173|198->173|198->173|199->174|202->177|202->177|204->179|204->179|204->179|205->180|212->187|212->187|214->189|214->189|214->189|215->190|217->192|217->192|219->194|219->194|219->194|220->195|222->197|222->197|224->199|224->199|224->199|225->200|231->206|231->206|233->208|233->208|233->208|234->209|236->211|236->211|238->213|238->213|238->213|239->214|250->225|250->225|252->227|252->227|252->227|253->228|254->229|254->229|256->231|256->231|256->231|257->232|259->234|259->234|260->235|287->262|287->262|288->263
                  -- GENERATED --
              */
          