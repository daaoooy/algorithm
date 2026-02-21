const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim();

const arr = input.split(/\s+/).map(Number);

let answer = 1;

while (true) {
  let count = 0;

  for (const num of arr) {
    if (answer % num === 0) count++;
  }

  if (count >= 3) {
    console.log(answer);
    break;
  }

  answer++;
}
