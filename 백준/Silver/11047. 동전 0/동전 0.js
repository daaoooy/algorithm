const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

let idx = 0;
let [N, K] = input[idx++].split(" ").map(Number);
let coinValues = [];

for (let i = 0; i < N; i++) {
  coinValues.push(Number(input[idx++]));
}

let minCoins = 0;

for (let i = N - 1; i >= 0; i--) {
  minCoins += Math.floor(K / coinValues[i]);
  K %= coinValues[i];
}

console.log(minCoins);
