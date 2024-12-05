const number = 10;

let a = 0;
let b = 1;
let c = 0;

for (let index = 0; index < number; index++) {
  console.log(c);
  a = b;
  b = c;
  c = a + b;
}
