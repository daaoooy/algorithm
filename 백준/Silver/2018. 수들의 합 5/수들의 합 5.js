const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim();

const N = Number(input);

let count = 0;
let rangeSum = 1;

let left = 1;
let right = 1;

while (left <= N) {
  if (rangeSum < N) {
    right++;
    rangeSum += right;
  } else if (rangeSum > N) {
    rangeSum -= left;
    left++;
  } else {
    rangeSum -= left;
    count++;
    left++;
  }
}

console.log(count);
