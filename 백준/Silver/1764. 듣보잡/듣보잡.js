const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split(/\r?\n/);

let idx = 0;
const [N, M] = input[idx++].split(" ").map(Number);

const notListen = new Set();

for (let i = 0; i < N; i++) {
  notListen.add(input[idx++]);
}

const notListenAndSee = [];

for (let i = 0; i < M; i++) {
  const notSeeName = input[idx++];
  if (notListen.has(notSeeName)) notListenAndSee.push(notSeeName);
}

notListenAndSee.sort();

console.log(notListenAndSee.length);
console.log(notListenAndSee.join("\n"));
