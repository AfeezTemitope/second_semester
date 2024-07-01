const prompt = require("prompt-sync")({sigint: true});

console.log("Welcome, new user.");
console.log(" ");
console.log("Nokia Phone Menu");

const phoneMenu = {
  1 : "Phonebook",
  2 : "Messages",
  3 : "Chat",
  4 : "Call Register",
  5 : "Tones",
  6 : "Settings"
};

const messagesSubMenu = {
  1 : "Inbox",
  2 : "Outbox",
  3 : "Drafts",
  4 : "Send a message"
};

const phoneBookSubMenu = {
  1 : "Search",
  2 : "Service Nos.",
  3 : "Add name",
  4 : "Erase",
  5 : "Edit",
  6 : "Assign tone",
  7 : "Send b'card",
  8 : "Options",
  9 : "Speed dials",
  10 : "Voice tags"
};

for (let option in phoneMenu) {
  console.log(`${option} : ${phoneMenu[option]}`);
}

let userOption = prompt("Enter an option: ");

if(userOption === '2') {
  console.log("Messages Menu");
  for (let option in messagesSubMenu) {
    console.log(`${option} : ${messagesSubMenu[option]}`);
  }
  let userSubOption = prompt("Enter an option: ");
  console.log(`You selected: ${messagesSubMenu[userSubOption]}`);
} else if(userOption === '1') {
  console.log("Phonebook Menu");
  for (let option in phoneBookSubMenu) {
    console.log(`${option} : ${phoneBookSubMenu[option]}`);
  }
  let userSubOption = prompt("Enter an option: ");
  console.log(`You selected: ${phoneBookSubMenu[userSubOption]}`);
} else {
  console.log(`You selected: ${phoneMenu[userOption]}`);
}
