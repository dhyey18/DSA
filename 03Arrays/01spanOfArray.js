// span of array substraction of largest and smallest

const n = 6;
const array = [4,23,6,12,6,2]

let smallest = array[0];
let largest = array[0]; 

for (let index = 0; index < array.length; index++) {
    if (array[index] > largest) {
        largest = array[index];
    } else if (array[index] <= smallest) {
        smallest = array[index]
    }
}

console.log(largest-smallest);
