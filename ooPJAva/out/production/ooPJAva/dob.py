from datetime import datetime
def age_calculator(date_of_birth, format):
    current_date = datetime.today()
    birth_date = datetime.strptime(date_of_birth, format)
    full_year_passed = (current_date.month, current_date.day) >= (birth_date.month, birth_date.day)
    age = current_date.year - birth_date.year
    if not full_year_passed:
        age -= 1
    return age

def main():
    dob = "01-02-1998"
    age_in_numbers = age_calculator(dob, "%d-%m-%Y")
    print(age_in_numbers)



