let left_operand = 100;
let right_operand = 300;
let ans;
let operator = '*';

if (operator == '+') {
    ans = left_operand + right_operand;
} else if (operator == '-') {
    ans = left_operand - right_operand;
} else if (operator == '*') {
    ans = left_operand * right_operand;
} else if (operator == '/') {
    ans = left_operand / right_operand;
} else {
    ans = NaN;
}

console.log(ans);
