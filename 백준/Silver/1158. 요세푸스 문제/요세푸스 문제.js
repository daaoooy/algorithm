const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim();

const [N, K] = input.split(" ").map(Number);

let queue = [];

for (let i = 1; i <= N; i++) {
  queue.push(i);
}

let josephus = [];
let idx = 0;

while (queue.length > 0) {
  idx = (idx + K - 1) % queue.length;
  josephus.push(queue.splice(idx, 1));
}

console.log("<" + josephus.join(", ") + ">");
