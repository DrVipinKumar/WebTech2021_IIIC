

let showalert=()=>{
   let name1=10;
   let name2="10";

   if(name1==name2)
   {
       alert("name1 and name2 are equal "+typeof name2 );
    
   }
   if(name1===name2)
   {
       alert("name1 and name2");
   }
}


function showconfirm()
{
    let value=window.confirm("Do you want to display message?");
    if(value==true)
    {
        alert("Welcome to confirm box");
    }
    else
    {
        window.alert("You are not welcome");
    }
}
function showprompt()
{
    let name=prompt("Enter your name","KIET");
    if(name!=null)
    {
        alert("Welcome "+name);
    }
    else
    {
        alert("We do not know your name");
    }
}