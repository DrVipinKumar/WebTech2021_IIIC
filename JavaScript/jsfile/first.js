
function add(){
let values=document.getElementById("numbers").value;
let num=values.split(",");
let sum=0;
for(let i=0;i<num.length;i++)
{
     sum=sum+parseInt(num[i]);
}
alert("Sum of all numbers are="+sum);
}
(function () {
     console.log("IIFE")
   })();