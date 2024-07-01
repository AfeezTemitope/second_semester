const prompt = require("prompt-sync")({ sigint: true });

function findMin(numbers) {
    let minimum = numbers[0];
    for (let i = 1; i < numbers.length; i++) {
        if (numbers[i] < minimum) {
            minimum = numbers[i];
        }
    }
    return minimum;
}

const size = parseInt(prompt("Enter the size of the array: "));
const inputNumbers = [];

for (let i = 0; i < size; i++) {
    const userInput = parseFloat(prompt(`Enter number ${i + 1}:`));
    inputNumbers.push(userInput);
}

const minimum = findMin(inputNumbers);

console.log(`The minimum value is: ${minimum}`);
