//   *
//  ***
// *****
//  ***
//   *
// "",*
// 2,1
// 1,3
// 0,5
// 1,3
// 2,1

let n = 5;
let space = Number.parseInt(n / 2);
let star = 1;

for (let i = 1; i <= n; i++) {
  let str = "";

  for (let j = 1; j <= space; j++) {
    str += " ";
  }

  for (let j = 1; j <= star; j++) {
    str += "*";
  }

  console.log(str);

  if (i <= n / 2) {
    space -= 1;
    star += 2;
  }

  if (i > n / 2) {
    space += 1;
    star -= 2;
  }
}
