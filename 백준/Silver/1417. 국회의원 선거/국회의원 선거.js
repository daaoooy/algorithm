const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

let idx = 0;
const N = Number(input[idx++]);

let votes = [];

for (let i = 0; i < N; i++) {
  votes.push(Number(input[idx++]));
}

let dasomPickVotes = votes[0];
let bribes = 0;

while (true) {
  let maxOther = Math.max(...votes.slice(1));

  if (dasomPickVotes > maxOther) break;

  let maxIndex = votes.indexOf(maxOther);

  votes[maxIndex] -= 1;
  dasomPickVotes += 1;
  bribes += 1;
}

console.log(bribes);
