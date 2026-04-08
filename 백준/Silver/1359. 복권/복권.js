const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim();

const [N, M, K] = input.split(" ").map(Number);

let totalCase = combination(N, M);
let resultCase = 0;

let isComplementary = K <= M / 2;
let probability = 0;

if (isComplementary) {
  for (let i = 0; i < K; i++) {
    resultCase += combination(M, i) * combination(N - M, M - i);
  }
  probability = 1 - resultCase / totalCase;
} else {
  for (let i = K; i <= M; i++) {
    resultCase += combination(M, i) * combination(N - M, M - i);
  }
  probability = resultCase / totalCase;
}

console.log(probability);

function combination(n, k) {
  let denominator = 1;
  let numerator = 1;

  for (let i = k; i >= 1; i--) {
    denominator *= i;
  }

  for (let i = n; i > n - k; i--) {
    numerator *= i;
  }

  return numerator / denominator;
}
