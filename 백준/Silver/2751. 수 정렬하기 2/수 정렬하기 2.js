const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split("\n");

const N = Number(input[0]);

const arr = input
  .slice(1, N + 1)
  .map(Number)
  .sort((a, b) => a - b);

console.log(arr.join("\n"));
