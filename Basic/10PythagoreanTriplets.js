const n1 = 3;
const n2 = 4;
const n3 = 5;

function pythagoreanTriplets(a, b, c) {
  let max = a;

  if (b > max) {
    max = b;
  }

  if (c > max) {
    max = c;
  }

  if (max === c) {
    return a * a + b * b === c * c;
  } else if (max === b) {
    return a * a + c * c === b * b;
  } else {
    return b * b + c * c === a * a;
  }
}

console.log(pythagoreanTriplets(n1, n2, n3));
