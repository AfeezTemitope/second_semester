const removeDuplicates = require('./sameShouldBeEliminated')

test('eliminate same numbers', () => {
    arr = [1, 1, 2, 3, 4, 4, 5]
    result = removeDuplicates(arr)
    expect(result).toEqual([1, 2, 3, 4, 5])
  })
  
  test('elimination', ()=>{
    arr = [6 ,7 ,6 ,8 ,7 ,9 ]
    result = removeDuplicates(arr)
    expect(result).toEqual([6,7,8,9])
  })