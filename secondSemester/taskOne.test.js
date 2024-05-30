const {calculateArea, convertToFarenheit, isEven, leapYear, countVowelSounds} = require('./taskOne');

//areaCalculation
test('calculates the perimeter of a rectangle', () => {

    expect(calculateArea(5,10)).toBe(50);
})
test('calculates the perimeter of a rectangle', () => {

    expect(calculateArea(-5,10)).toBe(0);
})

//ocnversion
test('test that conversion is accurate', () =>{
    expect(convertToFarenheit(5)).toBe(41)
})

//even
test('test to check if number is even', () => {
    expect(isEven(4)).toBe(true)
})
test('if number is not even', () => {
    expect(isEven(5)).toBe(false)
})
test('if number is negative ', () => {
    expect(isEven(-2)).toBe(false)
})

//
test('leap year checker', () => {
    expect(leapYear(4)).toBe(true)
})

//vowel
test('vowel checker', () => {
    
    expect(countVowelSounds("badAfeez")).toBe(4)
})