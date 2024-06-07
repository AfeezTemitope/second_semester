const {countOccurrences} = require("./testingYetAgain");
test('check my object', () => {
    let result = [2,3,4,4,3,2,4]
    let expected = {2:2, 3:2, 4:3} 

    expect(countOccurrences(result)).toEqual(expected)
})


