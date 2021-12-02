let numbers=[12,35,67,89,45];
document.write("Numbers");
numbers.forEach(function(value){
      document.write("<br>"+value);
});
numbers.forEach(function(value,index){
    document.write("<br>"+index+"="+value);
});
// for(let i=0;i<numbers.length;i++)
// {
//     document.write("<br>"+numbers[i]);
// }
let number1=new Array(12,"23","kiet",67.89,89,45);
document.write("<br>Number1");
for(let i=0;i<number1.length;i++)
{
    document.write("<br>"+number1[i]);
}

let obj={name:"anil",address:"kiet"};
document.write("<br>Name="+obj.name+" and address="+obj.address);
let obj1=new Object();
obj1.name="Raju";
obj1.address="KIET";
document.write("<br>Name="+obj1.name+" and address="+obj1.address);