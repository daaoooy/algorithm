const fs = require("fs");
const input = fs.readFileSync(0, "utf8").split(/\s*\n/).map(Number);

let present = 0;
let answer = 0;

for (let i = 0; i < input.length; i++) {
  let prev = present;
  present += input[i];

  const prevDistance = Math.abs(prev - 100);
  const presentDistance = Math.abs(present - 100);

  if (present >= 100) {
    if (prevDistance > presentDistance) {
      answer = present;
    } else if (prevDistance < presentDistance) {
      answer = prev;
    } else {
      answer = present > prev ? present : prev;
    }
    break;
  }
}

if (answer === 0) answer = present;

console.log(answer);
