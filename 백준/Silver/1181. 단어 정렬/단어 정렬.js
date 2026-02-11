const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split(/\s+/);

input.shift();

const set_arr = [...new Set(input)];
const sorted = set_arr.sort(
  (a, b) => a.length - b.length || a.localeCompare(b),
);

console.log(sorted.join("\n"));
