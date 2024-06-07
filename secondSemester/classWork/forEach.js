// for each loop
let sum = 0;
const number = [65, 44, 12, 4];
number.forEach(function(item) {
    sum += item;
});
console.log("Sum:", sum);

const numbers = [65, 44, 12, 4];
numbers.forEach(function(item, index, arr) {
    arr[index] = item * 10;
});
console.log("Modified array:", numbers);

let arrayOfNumbers = [1,8,9,9,5,6,7]
arrayOfNumbers.forEach((number) =>{
let answer = number * 2
console.log(answer)

})

// filter

let numberss = [1, 2, 3, 4, 5, 6];
function isEven(number) {
  return number % 2 === 0 && number > 3;
}

let evenNumbers = numberss.filter(isEven)

console.log(evenNumbers); 



