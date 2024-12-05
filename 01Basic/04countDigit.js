// count digit of a number

let number = 1234567;

function countDigitOfNumber(number) {
  let counter = 1;
  while (number > 1) {
    counter++;
    number = Number.parseInt(number / 10);
  }
  return counter;
}

console.log(countDigitOfNumber(number));
