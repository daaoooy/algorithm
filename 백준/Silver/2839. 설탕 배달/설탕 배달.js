const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim();

let N = Number(input);
let packet = 0;
let possible = true;

while (true) {
  if (N % 5 === 0 && packet === 0) {
    packet = parseInt(N / 5);
    break;
  } else if (N % 5 === 0 && packet !== 0) {
    packet += parseInt(N / 5);
    break;
  } else if (N < 3) {
    possible = false;
  }

  N -= 3;
  packet++;
}

if (possible) console.log(packet);
else console.log(-1);
