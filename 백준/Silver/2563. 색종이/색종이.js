const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split(/\s*\n/);

const N = Number(input[0]);
const colorPapers = input.slice(1, N + 1).map((v) => v.split(" ").map(Number));

const board = Array.from({ length: 100 }, () => Array(100).fill(0));

for (const [x, y] of colorPapers) {
  for (let i = x; i < x + 10; i++) {
    for (let j = y; j < y + 10; j++) {
      board[i][j] = 1;
    }
  }
}

let answer = 0;

for (let i = 0; i < 100; i++) {
  for (let j = 0; j < 100; j++) {
    if (board[i][j] === 1) answer++;
  }
}

console.log(answer);
