const prompt = require("prompt-sync")({sigint:true})
console.log ("WELCOME TO STUDENT GRADE");

const grade = parseInt(prompt("HOW MANY GRADES WOULD U LIKE TO CALCULATE : "));

let i = 1;
for (; i <= grade; i++){

const studentName = prompt ("ENTER STUDENT NAME  ");
const firstScore = parseInt(prompt("enter score one  "));
const secondScore = parseInt(prompt("enter score two  "));
const thirdScore = parseInt(prompt("enter score three  "));

let sum = 0;
sum = firstScore + secondScore + thirdScore;

if (sum <= 50){
console.log(`${studentName} bloody failure you got D and your score is ${sum}`);
} else if  ( sum  > 50 && sum <= 70 ) { 
console.log(`${studentName} bloody failure you got c and your score is ${sum}`);
}
}