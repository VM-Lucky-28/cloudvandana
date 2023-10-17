function sortDescending(arr) {
    for (let i = 0; i < arr.length; i++) {
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[i] < arr[j]) {
                [arr[i], arr[j]] = [arr[j], arr[i]];
            }
        }
    }
    return arr;
}

const readline = require("readline").createInterface({
    input: process.stdin,
    output: process.stdout,
});

readline.question("Enter an array of numbers separated by spaces: ", (input) => {
    const arr = input.split(" ").map((num) => Number(num));
    const sortedArr = sortDescending(arr);
    console.log(sortedArr);
    readline.close();
});