const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

const T = Number(input[0]);
let idx = 1;

for (let t = 0; t < T; t++) {
  const k = Number(input[idx++]);
  const n = Number(input[idx++]);

  const dp = Array.from({ length: k + 1 }, () => Array(n + 1).fill(0));

  for (let i = 1; i <= n; i++) {
    dp[0][i] = i;
  }

  for (let i = 1; i <= k; i++) {
    for (let j = 1; j <= n; j++) {
      dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
    }
  }

  console.log(dp[k][n]);
}
