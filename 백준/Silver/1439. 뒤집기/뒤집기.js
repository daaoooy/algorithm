const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim();

const S = input.split("");
let count = 0;

for (let i = 1; i < S.length; i++) {
  if (S[i - 1] !== S[i]) count++;
}

let answer = Math.round(count / 2);

console.log(answer);
