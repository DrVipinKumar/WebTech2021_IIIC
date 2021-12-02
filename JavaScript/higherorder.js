function sum(num1, num2,dissum)
{
    let r= num1+num2
    dissum(`Sum of two number =${r}`)
}
function result(msg)
{
    console.log(msg)
}
let msginfo=function msg(info)
{
    console.log("New callback="+info)
}
sum(23,56,result)
sum(23,56,msginfo)
//let r=sum(34,50)
//result(`Sum of two number =${r}`)