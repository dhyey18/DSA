// rotate a number by k
// 123456 , k = 2  => 651234

let number = 12345;
let k = 3;

function countDigitOfNumber(number) {
  let counter = 1;
  while (number > 1) {
    counter++;
    number = Number.parseInt(number / 10);
  }
  return counter;
}

let numberOfDigit = countDigitOfNumber(number);

let div = Math.pow(10, numberOfDigit - 1);

function rotateANumber(number, div, k) {
  while (k > 0) {
    let lastDigitToAdd = Number.parseInt(number % 10) * div;
    number = Number.parseInt(number / 10) + lastDigitToAdd;
    k--;
  }
  return number;
}

if (k < 0) {
  k = k + numberOfDigit;
}

console.log(rotateANumber(number, div, k));
