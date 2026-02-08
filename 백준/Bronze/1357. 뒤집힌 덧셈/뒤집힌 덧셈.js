const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split(/\s+/);

const reverse_x = Number(input[0].split("").reverse().join(""));
const reverse_y = Number(input[1].split("").reverse().join(""));

const result = Number(String(reverse_x + reverse_y)
  .split("")
  .reverse()
  .join(""));

console.log(result);
