const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split(/\s+/);

const A = Number(input[0]);
const B = Number(input[1]);

let sum = 0;
let arr = [];

for (let i = 1; i <= 1000; i++) {
  let cnt = i;
  while (cnt != 0) {
    arr.push(i);
    cnt--;
  }
}

for (let i = A - 1; i <= B - 1; i++) {
  sum += arr[i];
}

console.log(sum);
