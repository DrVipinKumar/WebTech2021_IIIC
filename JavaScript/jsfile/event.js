function checktext(obj)
{
    let data=obj.value;
    var checkname=/^[a-zA-Z ]+$/;
    if(checkname.test(data)===false)
    {
    alert("Please enter correct name");
    obj.value="";
    obj.setFocus=true;
    }

}

function checknumber(obj)
{
    let data=obj.value;
    data=parseInt(data);
    if(!Number.isInteger(data))
    {
    alert("Please enter correct age");
    obj.value="";
    obj.setFocus=true;
    }
}