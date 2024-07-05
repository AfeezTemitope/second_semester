// function that filter the score that equals or greater than 70 using
function testScore(result){
    return result.filter(detail => detail >= 70)
}

//functions that increase the score by 5 using map
function titan(result){
    return result.map(detail => detail +5)
}k

//function that return the square of numbers in a list
function square(result){
    return result.map(detail=> detail ** 2)
}

//function to distribute books with people
function assignBooks(members, books) {
    const assignedBooks = [];io8
    for (const member of members) {
      const bookIndex = members.indexOf(member);
      const book = books[bookIndex]
      assignedBooks.push(`${member} gets "${book}"`);
    }
    return assignedBooks
  }

  // Filter afternoon classes (starting from 1:00 PM)
  function filterAfternoonClasses(classTimings) {
    return classTimings.filter((timing) => {
        const hour = parseInt(timing.split(":")[0]);
        return hour >= 1 && hour <= 5
    });
}

function calculateTotalExpenses(expenses) {
    let total = 0;
    for (let category in expenses) {
        total += expenses[category]
    }
    return total
}


module.exports = {testScore, titan, square, assignBooks, filterAfternoonClasses, calculateTotalExpenses}

