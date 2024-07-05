const prompt = require('prompt-sync')();

const username = prompt("enter user name ");

if (username.length > 10 ){
	console.log("invalid username!!!");
} else {
	const password = prompt("enter password ");
	const secondPassword = prompt("verify password ");

	if (password === secondPassword && password.length > 6){
		console.log(`_________________\nyour username is == ${username}\nand the password is == ${password} `);
	} else {
		console.log("pasword mismatch or password is less than 6!!!");
}
}