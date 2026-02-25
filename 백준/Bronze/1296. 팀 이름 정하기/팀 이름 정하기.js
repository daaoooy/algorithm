const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split("\n");

const yeondoName = input[0];
const N = Number(input[1]);

let teams = [];

for (let i = 2; i < N + 2; i++) {
  teams.push(input[i]);
}

teams.sort();

let max = -1;
let answer = "";

for (let i = 0; i < N; i++) {
  const teamName = teams[i];

  let L = 0;
  let O = 0;
  let V = 0;
  let E = 0;

  for (let char of yeondoName) {
    if (char === "L") L++;
    if (char === "O") O++;
    if (char === "V") V++;
    if (char === "E") E++;
  }

  for (let char of teamName) {
    if (char === "L") L++;
    if (char === "O") O++;
    if (char === "V") V++;
    if (char === "E") E++;
  }

  let percent =
    ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;

  if (percent > max) {
    max = percent;
    answer = teamName;
  }
}

console.log(answer);
