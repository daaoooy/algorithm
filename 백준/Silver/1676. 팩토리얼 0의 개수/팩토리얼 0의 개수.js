const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim();

const N = Number(input);

let nFactorial = String(factorial(N)).split("");
let zeroCount = 0;
let initial = true;

for (let i = nFactorial.length - 1; i > 0; i--) {
  if (initial && nFactorial[i] !== "0") {
    initial = false;
    continue;
  } else if (initial && nFactorial[i] === "0") {
    initial = false;
    zeroCount++;
  } else if (!initial && nFactorial[i] !== "0") {
    break;
  } else if (!initial && nFactorial[i] === "0") {
    zeroCount++;
  }
}

console.log(zeroCount);

function factorial(n) {
  if (n === 0) return 1n;
  else {
    return BigInt(n) * factorial(n - 1);
  }
}
