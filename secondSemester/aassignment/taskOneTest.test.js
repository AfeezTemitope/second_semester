const {testScore,titan, square, assignBooks, filterAfternoonClasses, calculateTotalExpenses} = require ("./taskOneAssignment");

test('array has correct score', ()=>{
    studentScores  = [95,78,85,60,45,92,78,89,90,88]
    expectedResult = [95,78,85,92,78,89,90,88]
    expect(testScore(studentScores)).toEqual(expectedResult)
})

test('array has correct negative score', ()=>{
    studentScores  = [-95,78,-85,60,45,-92,78,89,-90,-88]
    expectedResult = [78,78,89]
    expect(testScore(studentScores)).toEqual(expectedResult)
})

test('array has correct score', ()=>{
    studentScores  = [95,78,85,60]
    expectedResult = [100,83,90,65]
    expect(titan(studentScores)).toEqual(expectedResult)
})

test('array has correct negative score', ()=>{
    studentScores  = [-95,-78,-85,-60]
    expectedResult = []
    expect(testScore(studentScores)).toEqual(expectedResult)
})

test('array has correct score',()=>{
    studentScores = [2,4,6,8,10]
    expectedresult = [4,16,36,64,100]
    expect(square(studentScores)).toEqual(expectedresult)
})

test('array has negative score',()=>{
    studentScores = [-2,-4,-6,-8,-10]
    expectedresult = [4,16,36,64,100]
    expect(square(studentScores)).toEqual(expectedresult)
})

test('test that book can be assigned properly',()=>{
    const members1 = ["Emily", "Jack", "Sophia", "Daniel"];
    const books1 = ["Book A", "Book B", "Book C", "Book D"];
    const result1 = assignBooks(members1, books1);
    console.assert(result1.Emily === 'Book A');
    console.assert(result1.Jack === 'Book B');
})

test('test that the timing can be filtered for afternoon', ()=>{
    const allClassTimings = ["9:00 AM", "11:00 AM", "1:00 PM", "3:00 PM", "5:00 PM"];
    const noonClasses = ["1:00 PM", "3:00 PM", "5:00 PM"]
    expect(filterAfternoonClasses(allClassTimings)).toEqual(noonClasses)
})

test('test for expense ',()=>{
    const davidExpenses = {
        "groceries": 150,
        "dining out": 100,
        "transportation": 50,
        "entertainment": 80
    }
    const totalExpense = calculateTotalExpenses(davidExpenses)
    expect(totalExpense).toBe(380)

})