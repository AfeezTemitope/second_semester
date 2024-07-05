username = input("Enter username: ")

if len(username) > 10:
    print("Invalid username! Username must be 10 characters or less.")
else:
    password = input("Enter password: ")
    secondPassword = input("Verify password: ")

    if password == secondPassword and len(password) > 6:
        print(f"Your username is {username} and the password is {password}.")
    else:
        print("Password mismatch or password length is less than 6 characters.")
