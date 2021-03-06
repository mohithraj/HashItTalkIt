
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object chat_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object chat_Scope1 {
import play.api.mvc.RequestHeader

class chat extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(uid: String)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.48*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>


<html>
    <head>
        <title>HashItTalkIt</title>

        <link rel='stylesheet' href='"""),_display_(/*12.39*/routes/*12.45*/.Assets.at("stylesheets/flatly-bootstrap.min.css")),format.raw/*12.95*/("""' >
        <link rel='stylesheet' href='"""),_display_(/*13.39*/routes/*13.45*/.Assets.at("stylesheets/bootstrap-theme.css")),format.raw/*13.90*/("""' >
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.at("stylesheets/main.css")),format.raw/*14.79*/("""" >
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.at("images/chat.png")),format.raw/*15.94*/("""" >

        <script type='text/javascript' src='"""),_display_(/*17.46*/routes/*17.52*/.Assets.at("javascripts/jquery.min.js")),format.raw/*17.91*/("""'> </script>
        <script type='text/javascript' src='"""),_display_(/*18.46*/routes/*18.52*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*18.94*/("""'> </script>
        <script type='text/javascript' src='"""),_display_(/*19.46*/routes/*19.52*/.Assets.at("javascripts/aes.js")),format.raw/*19.84*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*20.46*/routes/*20.52*/.Assets.at("javascripts/index.js")),format.raw/*20.86*/("""'></script>

        <script>

    </script>
    </head>

    <body data-ws-url=""""),_display_(/*27.25*/routes/*27.31*/.Application.ws().webSocketURL()),format.raw/*27.63*/("""" class="bg-primary" >
        <div class="container-fluid navbar navbar-primary navbar-fixed-top">
            <div class="row">
                <ul class="nav text-center ">
                    <li class="col-md-6 col-sm-6 col-xs-6 nav active" ><a href="/"><h4>HashTalk</h4></a></li>
                    <li class="col-md-6 col-sm-6 col-xs-6 nav"><a href="/about"> <h4>About</h4></a></li>
                </ul>
            </div>
        </div>

        <input id="uid" style="display: none" value=""""),_display_(/*37.55*/uid),format.raw/*37.58*/("""" />
            <!--            <div id="passworddiv" >


                <p> Password : <input id="password" type=password placeholder="password" value=""/> </p>
                <p> <input type="submit" id="encryptbutton"  value="Encrypt" onclick="EnableChat()" class="btn btn-primary"> </p>
            </div> -->
        <div class="container-fluid"></div>
        <div class="row">
            <div id="rooms" class="col-md-4 col-lg-4 col-xs-4">
                <div class="table-responsive">
                    <table id="roomList" data-click-to-select="true" class="table table-hover " data-search="true">
                        <thead>
                            <th class="text-center" >
                                <a href="#" rel="popover" data-toggle="popover"
                                data-content='<form id="addroom" action=""""),_display_(/*52.75*/routes/*52.81*/.Application.addRoomDetails()),format.raw/*52.110*/("""" method="post" class="form-horizontal">
                                               <input type="text" name="name" class="form-control" placeholder="Room Name"/>
                                               <input type="text" name="password" class="form-control" placeholder="Passwd" />
                                               <button type="submit" class="form-control btn btn-primary"><span class="glyphicon glyphicon-ok"></span></button>
                                            </form>'
                                data-placement="bottom" data-html="true" >Add Rooms </a>

                            </th>
                        </thead>
                        <tbody class="text-center">

                    </tbody>
                    </table>
                </div>
            </div>

            <div class=" col-md-7 col-lg-7 col-xs-6">
                <div class="table-responsive">
                    <table id="board" class="table table-hover table-condensed ">
                        <thead>
                            <tr>
                                <th class="text-center">Message</th>
                            </tr>
                        </thead>
                        <tbody>
                            </tbody>
                    </table>
                </div>
            </div>
        </div>

        <div id="chatform" class="row" >
            <form id="msgform" class="form-horizontal" >
                <div class="col-md-7 col-lg-7 col-xs-6 col-xs-offset-3 col-md-offset-4 col-lg-offset-4" >
                    <input id="msgtext" type="text" class="form-control" placeholder="Type your secret message " />
                </div>
                    <button type="submit" style="display: none">Send</button>
            </form>
        </div>

    </body>
</html>"""))
      }
    }
  }

  def render(uid:String,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(uid)(request)

  def f:((String) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (uid) => (request) => apply(uid)(request)

  def ref: this.type = this

}


}
}

/**/
object chat extends chat_Scope0.chat_Scope1.chat
              /*
                  -- GENERATED --
                  DATE: Sat Jun 20 17:53:18 PDT 2015
                  SOURCE: /Users/MAC/Documents/PlayExperiment/HashItTalkIt/app/views/chat.scala.html
                  HASH: 9ec0eea9441b165b2a6f38f7aca94c3496da4f6a
                  MATRIX: 600->37|741->83|769->85|907->196|922->202|993->252|1062->294|1077->300|1143->345|1212->387|1227->393|1282->427|1371->489|1386->495|1436->524|1513->574|1528->580|1588->619|1673->677|1688->683|1751->725|1836->783|1851->789|1904->821|1988->878|2003->884|2058->918|2167->1000|2182->1006|2235->1038|2764->1540|2788->1543|3669->2397|3684->2403|3735->2432
                  LINES: 23->3|28->3|30->5|37->12|37->12|37->12|38->13|38->13|38->13|39->14|39->14|39->14|40->15|40->15|40->15|42->17|42->17|42->17|43->18|43->18|43->18|44->19|44->19|44->19|45->20|45->20|45->20|52->27|52->27|52->27|62->37|62->37|77->52|77->52|77->52
                  -- GENERATED --
              */
          