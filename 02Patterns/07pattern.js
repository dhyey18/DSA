// *
//  *
//   *
//    *
//     *

// "" *
// 0  1
// 1  1
// 2  1
// 3  1
// 4  1

const n = 5;
const star = 1;

for (let i = 1; i <= n; i++) {
  let str = "";
  for (let j = 1; j <= n; j++) {
    if (j === i) {
      str += "*";
    } else {
      str += " ";
    }
  }
  console.log(str);
}
