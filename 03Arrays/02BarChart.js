const array = [6,5,8,3,4];

let largest = array[0]; 

for (let index = 0; index < array.length; index++) {
    if (array[index] > largest) {
        largest = array[index];
    }
}

for (let index = largest; index > 0; index--) {
    let str = ""
    for (let j = 0; j < array.length; j++) {
        const val = array[j];
        if (val < index) {
            str += "  "
        } else {
            str += " *"
        }
    }
    console.log(str);
}