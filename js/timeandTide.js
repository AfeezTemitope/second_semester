const print = require("prompt-sync")();


let day = print("what day is today? ");
switch(day.toLowerCase()){
	case "monday" :
		console.log("Today is monday");
		break;

	case "tuesday" : 
		console.log("Today is tuesday");
		break;

	case "wednesday" :
		console.log("Today is wednesday");
		break;

	default:
		console.log("Any Other Day");
}



