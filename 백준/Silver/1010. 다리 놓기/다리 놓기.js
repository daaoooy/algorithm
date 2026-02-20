const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split("\n");

const T = Number(input[0]);

for (let i = 0; i < T; i++) {
  const [N, M] = input[i + 1].split(" ").map(Number);
  let answer = 1n;

  for (let j = 0; j < N; j++) {
    answer = (answer * BigInt(M - j)) / BigInt(j + 1);
  }

  console.log(answer.toString());
}
