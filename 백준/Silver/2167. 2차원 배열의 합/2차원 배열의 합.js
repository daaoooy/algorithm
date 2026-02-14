const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split(/\s+/);

let idx = 0;

const N = Number(input[idx++]);
const M = Number(input[idx++]);

const arr = Array.from({ length: N }, () => {
  return Array.from({ length: M }, () => Number(input[idx++]));
});

const K = Number(input[idx++]);

const queries = Array.from({ length: K }, () => {
  const i = Number(input[idx++]) - 1;
  const j = Number(input[idx++]) - 1;
  const x = Number(input[idx++]) - 1;
  const y = Number(input[idx++]) - 1;
  return [i, j, x, y];
});

for (let i = 0; i < K; i++) {
  let sum = 0;

  for (let j = queries[i][0]; j <= queries[i][2]; j++) {
    for (let k = queries[i][1]; k <= queries[i][3]; k++) {
      sum += arr[j][k];
    }
  }

  console.log(sum);
}