const phone = () => {
    const prompt = require('prompt-sync')();

    myPhonebook = []


    const mainMenu = ()=>{
    const displayMenu = `
    1-> Add contact
    2-> Delete Contact
    3-> search Contact
    4-> view All contact
    `;
    print(displayMenu)
    let userChoice = prompt("Enter an option: ")
    switch(userChoice){
        case "1":
            addContact()
            break;
        case "2":
            deleteContact()
            break;
        case "3":
            searchContact()
            break;
        case "4":
            viewContact()
            break;
        case "5":
            exit()
            return;
        default:
            print("invalid input ")
            mainMenu()
    }



    }
    const addContact = ()=> {
    let firstName = prompt("Enter first name ")
    let lastName = prompt("Enter last name ")
    let phoneNumber = prompt("Enter phone number ")
    myPhonebook.push({firstName, lastName, phoneNumber})
    print("contact has been saved successfully! ")
    mainMenu()
    }

    const deleteContact = () => {
        if(myPhonebook.length === 0){
            print("No contact found in the phonebook")
            mainMenu()
        }
        let deleteContact = prompt("Enter the first name, last name, or phone number to remove contact: ")
        let found = false;
        for(let i = 0; i < myPhonebook.length; i++){
            let contact = myPhonebook[i];
            if(contact[0].toLowerCase() === deleteContact.toLowerCase() || contact[1].toLowerCase() === deleteContact.toLowerCase() || contact[2] === deleteContact){
                myPhonebook.splice(i, 1);
                print("Contact " + JSON.stringify(contact) + " removed successfully")
                found = true;
                
            }
        } 
        if(!found){
            print("No contact found with the term: " + deleteContact)
        } 
        mainMenu()
        
    }
    
    const viewContact = () => {
    if (myPhonebook.length != 0){
    for(let phoneBook of myPhonebook){
    print(phoneBook)
    }
    }
    }
    const print = (message) => {
    console.log(message)
    }
    mainMenu()
    } 
phone()