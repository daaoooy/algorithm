const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim();

const arr = input.split(".");

let answer = [];
let possible = true;

for (let i = 0; i < arr.length; i++) {
  let len = arr[i].length;

  if (len % 2 !== 0) {
    possible = false;
    break;
  }

  let tmp = "";

  tmp += "AAAA".repeat(Math.floor(len / 4));
  len %= 4;

  if (len === 2) tmp += "BB";

  answer.push(tmp);
}

console.log(possible ? answer.join(".") : "-1");
