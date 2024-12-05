// *   *
//  * *
//   *
//  * *
// *   *

// bs bst fs fst
// 0  1   3  1
// 1  1   1  1
// 2  1   0  0
// 1  1   1  1
// 0  1   3  1

//1234567
//*     *
// *   *
//  * *
//   *
//  * *
// *   *
//*     *

const n = 5;

for (let i = 1; i <= n; i++) {
  let str = "";
  for (let j = 1; j <= n; j++) {
    if (j + i === n + 1 || i === j) {
      str += "*";
    } else {
      str += " ";
    }
  }
  console.log(str);
}
