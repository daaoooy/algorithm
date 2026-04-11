const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim();

const N = Number(input);

let queue = [];

for (let i = 1; i <= N; i++) {
  queue.push(i);
}

let answer = [];

while (queue.length > 0) {
  answer.push(queue.shift());

  if (queue.length === 0) break;

  let temp = queue.shift();
  queue.push(temp);
}

console.log(answer.join(" "));
