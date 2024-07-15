// const sum = numbers.reduce((storedEvenNumbers, currentElement) => {
//   return storedEvenNumbers + currentElement
// }, 0)

const nums = [1, 2, 3, 4, 5];

function sumEven(numbers) {
    return numbers.reduce((acc, curr) => {
        if (curr % 2 === 0) {
            acc += curr;
        }
        return acc;
    }, 0);
}

const evenSum = sumEven(nums);
console.log(evenSum); // Output: 20










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

  function arrayToObject(arr) {
    return arr.reduce((obj, [key, value]) => {
        obj[key] = value;
        return obj;
    }, {});
}

const keyValuePairs = [['name', 'Alice'], ['age', 30], ['city', 'Seattle']];
const resultObject = arrayToObject(keyValuePairs);
console.log(resultObject);

  module.exports = {reverse}