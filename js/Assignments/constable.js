const prompt = require("prompt-sync")({siginit : true})

let sum = 0;
let average = 0;
for (let i = 0; i < 10; i++) {
const studentScore = parseInt(prompt("enter student score  " + (i+1) + " :"));
 sum += studentScore;
 average = sum / 10;
}
 console.log("total sum " + sum);
 console.log("average score is " + average.toFixed(2));
