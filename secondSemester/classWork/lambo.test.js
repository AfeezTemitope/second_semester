const { addFive } = require('./lambo'); 

  test('addFives', () => {
  const grades = [34, 56, 78, 40, 47];
  const expectedResult = [39, 61, 83, 45, 52];
  const actualResult = addFive(grades);


  
  expect(actualResult).toEqual(expectedResult);
});