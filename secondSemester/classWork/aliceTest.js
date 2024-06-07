// const studentScores  = [95,78,85,60,45,92]
function anyName(result){
let expected = result.map((detail) =>{
    return detail >= 90 ? "A" :
    detail >= 80 ? "B" :
    detail >= 70 ? "C" :
    detail >= 60 ? "D" :
    "F";    
})
return expected;
}

module.exports = {anyName}
// console.log(result)

