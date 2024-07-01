const prompt = require("prompt-sync")({sigint:true})
function maximum(numbers) {
    if (numbers.length === 0) {
        return null;
    }
    let max = numbers[0];
    for (let i = 1; i < numbers.length; i++) { 
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }
    return max;
}


const input = prompt('Enter a list of numbers separated by commas:');
const numberArray = input.split(',').map(Number);
const maxNumber = maximum(numberArray);

console.log('The maximum number is:', maxNumber);

