// Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

// The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

function GCD(n1, n2) {
  while (n2 !== 0) {
    let temp = n2;
    n2 = n1 % n2;
    n1 = temp;
  }
  return Math.abs(n1);
}

let n1 = 10;
let n2 = 18;

const gcd = GCD(n1, n2);

const lcm = (n1 * n2) / gcd;

console.log(gcd, lcm);
