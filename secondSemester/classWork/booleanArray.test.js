const { badBoyy } = require('./booleanArray')



test('test that array returns FALSE for even numbers', () => {
  const arr = [2, 4, 6, 8, 10]
  const result = badBoyy(arr)
  expect(result).toEqual([false, false, false, false, false])
})

test('test that array returns TRUE for odd numbers', () => {
  const arrOdd = [1, 3, 5, 7, 9]
  const resultOdd = badBoyy(arrOdd)
  expect(resultOdd).toEqual([true, true, true, true, true])
})

test('test that array returns correct values for mixed numbers', () => {
  const arrMixed = [2, 3, 4, 5, 6]
  const resultMixed = badBoyy(arrMixed)
  expect(resultMixed).toEqual([false, true, false, true, false])
})