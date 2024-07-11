// const sum = numbers.reduce((storedEvenNumbers, currentElement) => {
//   return storedEvenNumbers + currentElement
// }, 0)




// function getOddEven(nums) {
//     return {
//       odd: nums.filter(num => num % 2 == 1).reduce((acc, num) => acc + num),
//       even: nums.filter(num => num % 2 == 0).reduce((acc, num) => acc + num),
//     } 
//     return getOddEven
//   }




  function reverseArray(array) {
    let arr = array.split("")
    let reversed = []
    for (let i = 0; i < arr.length; i++) {
      reversed.unshift(arr[i]);
    }
    return reversed.join("")
  }
  const arr = "string"
  console.log(reverseArray(arr))
  
  function reverse(arr){
    if (typeof arr === 'string') {
      let reversed = []
      for (const num of arr){
        reversed.unshift(num)
      }
      return reversed.join("")
    } else {
      return arr.reverse()
    }
  }

  module.exports = {reverse}