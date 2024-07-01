const {add,subtract,mutiply} = require ("./task3.js");


test("testing my functions ", () => {
let anss = add(2,5)
expect(anss) === 7;


let ans = subtract(5,2)
expect(ans)=== 3;

let ansss = subtract(5,2)
expect(ansss)!== 12;

});

test('doubleArray', () => {
const inputArray = [1, 2, 3, 4];
const expectedOutput = [2, 4, 6, 8];

const result = multiplyArrayByTwo(inputArray);

expect(result).toEqual(expectedOutput);
});

