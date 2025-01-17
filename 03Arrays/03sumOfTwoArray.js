// const array1 = [2, 4, 6, 3, 5];
// const array2 = [5, 7, 3, 8, 8, 2, 5];
const array1 = [9, 9, 9];
const array2 = [1];

let b = array1.length - 1;
let a = array2.length - 1;

let carry = 0;

while (b >= 0 && a >= 0) {
  const val1 = array1[b];
  const val2 = array2[a];

  let sum = val1 + val2 + carry;

  carry = Number.parseInt(sum / 10);
  if (sum > 9) {
    sum = Number.parseInt(sum % 10);
  }

  console.log(sum);
  b--;
  a--;
}

while (a >= 0) {
  let sum = array2[a] + carry;
  carry = Number.parseInt(sum / 10);
  if (sum > 9) {
    sum = Number.parseInt(sum % 10);
  }
  console.log(sum);
  a--;
}

while (b >= 0) {
  let sum = array1[b] + carry;
  carry = Number.parseInt(sum / 10);
  if (sum > 9) {
    sum = Number.parseInt(sum % 10);
  }
  console.log(sum);
  b--;
}

console.log(carry);
