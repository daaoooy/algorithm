const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim();

let N = Number(input);

let dp = [];

dp[0] = -1;
dp[1] = 0;
dp[2] = 1;
dp[3] = 1;

f(N);

console.log(dp[N]);

function f(n) {
  for (let i = 4; i <= n; i++) {
    let divide2Case = 0;
    let divide3Case = 0;
    let subtraction1Case = 0;

    if (i % 3 === 0 && i % 2 === 0) {
      divide2Case = dp[i / 2];
      divide3Case = dp[i / 3];
      subtraction1Case = dp[i - 1];

      dp[i] = 1 + Math.min(divide2Case, divide3Case, subtraction1Case);
    } else if (i % 3 === 0) {
      divide3Case = dp[i / 3];
      subtraction1Case = dp[i - 1];

      dp[i] = 1 + Math.min(divide3Case, subtraction1Case);
    } else if (i % 2 === 0) {
      divide2Case = dp[i / 2];
      subtraction1Case = dp[i - 1];

      dp[i] = 1 + Math.min(divide2Case, subtraction1Case);
    } else {
      subtraction1Case = dp[i - 1];

      dp[i] = 1 + subtraction1Case;
    }
  }
}
