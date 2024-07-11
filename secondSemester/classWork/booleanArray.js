function badBoy(arr) {
 const result = [];
   for (const num of arr) {
       result.push(num % 2 !== 0)
   }
   return result;
}


function badBoyy(arr) {
   return arr.map(num => num % 2 !== 0)
}



module.exports = {badBoy, badBoyy}