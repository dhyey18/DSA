// reverse a number

let number = 12345;

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

function reverseANumber(number, div) {
  let reversedNumber = 0;
  while (div > 0) {
    const lastDigit = Number.parseInt(number % 10);
    reversedNumber += lastDigit * div;
    number = Number.parseInt(number / 10);
    div = Number.parseInt(div / 10);
  }
  return reversedNumber;
}

console.log(reverseANumber(number, div));
