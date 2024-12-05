// *** ***
// **   **
// *     *
// **   **
// *** ***

// * "" *
// 3,1,3
// 2,3,2
// 1,5,1
// 2,3,2
// 3,1,3

let n = 7;
let starBefore = Number.parseInt(n / 2) + 1;
let space = 1;
let starAfter = Number.parseInt(n / 2) + 1;

for (let i = 1; i <= n; i++) {
  let str = "";

  for (let j = 1; j <= starBefore; j++) {
    str += "*";
  }

  for (let j = 1; j <= space; j++) {
    str += " ";
  }

  for (let j = 1; j <= starAfter; j++) {
    str += "*";
  }

  console.log(str);

  if (i <= n / 2) {
    space += 2;
    starBefore -= 1;
    starAfter -= 1;
  }

  if (i > n / 2) {
    space -= 2;
    starBefore += 1;
    starAfter += 1;
  }
}
