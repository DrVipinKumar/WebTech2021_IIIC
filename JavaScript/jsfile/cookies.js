var name="KIET";
var value="MCA";
var d=new Date();
d.setTime(d.getTime()+2*24*60*60*1000);
var expires="expires="+d.toUTCString();
document.cookie=name+"="+value+";"+expires;
document.write("cookies are created");

var ca=document.cookie.split(";");
document.write("<br>"+ca);
for(var i=0;i<ca.length();i++)
{
    var cname=ca[i].split("=")[0];
    var cvalue=ca[i].split("=")[1];
    document.write("Cookie Name= "+cname+" and Cookie Value ="+cvalue);
}