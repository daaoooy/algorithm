const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split(/\s+/);

const n = Number(input[0]);
const m = Number(input[1]);

const arr = [];

for (let i = 0; i < m; i++) {
  arr.push(Number(input[i + 2]));
}

arr.sort((a, b) => a - b);

let maxIncome = 0;
let bestPrice = 0;

for (let i = 0; i < m; i++) {
  const price = arr[i];
  const buyers = m - i;
  const sold = Math.min(n, buyers);
  const income = price * sold;

  if (income > maxIncome) {
    maxIncome = income;
    bestPrice = price;
  }
}

console.log(bestPrice, maxIncome);
