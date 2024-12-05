const number = 30;

function isPrime(number) {
  let isPrime = true;

  for (let i = 2; i < number; i++) {
    if (number % i === 0) {
      isPrime = false;
      break;
    }
  }

  return isPrime;
}

for (let index = 0; index < number; index++) {
  if (isPrime(index)) {
    console.log(index);
  }
}
