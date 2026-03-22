const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

const N = Number(input[0]);
const arr = input[1].split(" ").map(Number);

arr.sort((a, b) => a - b);

let totalWaitingTime = 0;
let prefixSum = 0;

for (let i = 0; i < N; i++) {
  prefixSum += arr[i];
  totalWaitingTime += prefixSum;
}

console.log(totalWaitingTime);
