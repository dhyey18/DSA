// prime factor

function primeFactor(number) {
  let divisor = 2;
  let factors = [];
  while (number > 1) {
    let rem = Number.parseInt(number % divisor);
    if (rem === 0) {
      number = Number.parseInt(number / divisor);
      factors.push(divisor);
    } else {
      divisor++;
    }
  }
  console.log(factors);
  return factors;
}

let number = 63;

primeFactor(number);
