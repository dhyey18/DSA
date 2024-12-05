// print all the digit of given number from left to right

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

function printDigit(number, div) {
  while (div > 0) {
    console.log(Number.parseInt(number / div));
    number = Number.parseInt(number % div);
    div = Number.parseInt(div / 10);
  }
}

printDigit(number, div);
