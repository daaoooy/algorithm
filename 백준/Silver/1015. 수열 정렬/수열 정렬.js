const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split("\n");

const N = Number(input[0]);
const A = input[1].split(" ").map(Number);
const arr = A.map((value, index) => [value, index]);

arr.sort((a, b) => a[0] - b[0]);
const P = new Array(N);

for (let i = 0; i < N; i++) {
  const idx = arr[i][1];
  P[idx] = i;
}

console.log(P.join(" "));
