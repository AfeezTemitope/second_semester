const {add, subtract, multiply, divide} = require('./myCalculatorFunction.js');

test('add function', () => {
  expect(add(1, 2)).toBe(3);
  expect(add(-1, -2)).toBe(-3);
});

test('subtract function', () => {
  expect(subtract(2, 1)).toBe(1);
  expect(subtract(-2, -1)).toBe(-1);
});

test('multiply function', () => {
  expect(multiply(2, 3)).toBe(6);
  expect(multiply(-2, -3)).toBe(6);
});

test('divide function', () => {
  expect(divide(10, 3)).toBeCloseTo(3.33);
  expect(divide(-6, -3)).toBe(2);
  expect(divide(1, 0)).toBe("Error: Division by zero!");
});
