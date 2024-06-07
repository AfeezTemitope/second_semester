const listOfNumbers = [2,3,4,5,1]
const wale  = ["wale","afeez","demo"]

let result = listOfNumbers.map((detail) =>{
    return detail * detail
})
console.log(result)
let expectedresult = wale.map((detail) =>{
    return detail.length
})

console.log(expectedresult)