// There are n bulbs that are initially off.
//  You first turn on all the bulbs, then you turn off every second bulb.
// On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on).
//  For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb.
// Return the number of bulbs that are on after n rounds.

const bulbs = [
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
  false,
];

const n = 10;

for (let i = 1; i <= n; i++) {
  for (let j = 1; j <= n; j++) {
    const multiple = i * j;
    if (multiple <= n) {
      bulbs[multiple - 1] = !bulbs[multiple - 1];
    }
  }
}

// soluction 2 : perfect square

// for (let i = 1; i * i <= n; i++) {
//   let bulbId = i * i;
//   bulbs[bulbId - 1] = !bulbs[bulbId - 1];
// }

console.log(bulbs);
