const fs = require("fs");
const N = fs.readFileSync(0, "utf8").trim().split("").map(Number);

N.sort(function (a, b) {
  return b - a;
});

console.log(N.join(""));
