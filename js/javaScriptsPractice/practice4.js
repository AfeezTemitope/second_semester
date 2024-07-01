const prompt =require("prompt-sync")({sigint:true})

const size = parseInt(prompt("Enter size of array element: "));
const userInput = [];
for ( let i = 0; i < size; i++){
	const inputNumbers = parseFloat(prompt(`enter number ${i + 1}: `));
	userInput.push(inputNumbers);
}
let result = Math.min(...userInput);
console.log(`the minimum value is : ${result}`);


