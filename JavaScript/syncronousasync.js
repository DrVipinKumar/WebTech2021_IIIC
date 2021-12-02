console.log("Message 1....")
function message(num1, num2,result)
{
    let n1=num1
    let n2=num2
    let res=result
    setTimeout(function call(n1, n2,res){
        let s=num1+num2
        res(s)
    }, 2000);
    
}

function dissum(info)
{
    console.log(info)
}
message(12,45,dissum)
console.log("Message 3...") 