const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

let T = Number(input[0]);
let idx = 1;

let result = [];

for (let t = 0; t < T; t++) {
  while (input[idx] === "") idx++;

  idx++;

  const J = input[idx++].split(" ").map(Number);
  const S = input[idx++].split(" ").map(Number);

  const maxJ = Math.max(...J);
  const maxS = Math.max(...S);

  if (maxJ >= maxS) {
    result.push("S");
  } else {
    result.push("B");
  }
}

console.log(result.join("\n"));