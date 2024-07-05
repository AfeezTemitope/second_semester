my_phonebook = []

print("=======================\nDO YOU WANT TO ADD A CONTACT\nON MY PHONEBOOK\n=======================")
user_input = input("YES or NO ").lower()
if user_input == "yes" :
    print("AVAILABLE OPTIONS\n1. Add Contact\n2. Remove contact\n3. Search contact\n4. Edit contact")
    while True:
     available_option = int(input("Enter an available option number: "))
     if available_option == 1:
        add_contact = input("enter name you want to save ")
        my_phonebook.append(add_contact)
        print(f"contact saved successfully {my_phonebook} in phonebook")
     elif available_option == 2:
        if my_phonebook:
            remove_contact = input("Enter the name of the contact to remove: ")
            if remove_contact in my_phonebook:
                my_phonebook.remove(remove_contact)
                print(f"Contact '{remove_contact}' removed from the phonebook.")
            else:
                print(f"Contact '{remove_contact}' not found in the phonebook.")
        else:
            print("Phonebook is empty. No contacts to remove.")
     elif available_option == 3:
        search_contact = input("Enter the name to search: ")
        if search_contact in my_phonebook:
            print(f"Contact '{search_contact}' found in the phonebook.")
        else:
            print(f"Contact '{search_contact}' not found in the phonebook.")
     elif available_option == 4:
        old_name = input("Enter the current name of the contact: ")
        if old_name in my_phonebook:
            new_name = input("Enter the correct name for the contact: ")
            my_phonebook[my_phonebook.index(old_name)] = new_name
            print(f"Contact '{old_name}' updated to '{new_name}'.")
        else:
            print(f"Contact '{old_name}' not found in the phonebook.")
     else:
        print("Invalid option. Please choose a valid option (1, 2, 3, or 4).")
else:
    print("NO conTacT AvaiLablE")
