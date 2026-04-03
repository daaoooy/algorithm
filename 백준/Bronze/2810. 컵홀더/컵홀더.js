const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

const N = Number(input[0]);
const seats = input[1];

let cupHolder = "*";

for (let i = 0; i < N; ) {
  if (seats[i] === "S") {
    cupHolder += "S*";
    i += 1;
  } else if (seats[i] === "L") {
    cupHolder += "LL*";
    i += 2;
  }
}

const count = cupHolder.split("*").length - 1;
console.log(Math.min(N, count));
