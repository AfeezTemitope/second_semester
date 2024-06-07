const multiplesOfArray = require('./arrayProduct');

test('multiplesOfArray', () => {
    const arr = [2, 3, 5, 2, 5, 3]  
    const expected = [4, 6, 10, 4, 10, 6]
    expect(multiplesOfArray(arr)).toEqual(expected)
  })
  