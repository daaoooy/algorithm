const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split("\n");

let idx = 0;

while (true) {
  const n = Number(input[idx++]);
  if (n === 0) break;

  const words = input.slice(idx, idx + n);
  idx += n;

  words.sort((a, b) => {
    const lowerA = a.toLowerCase();
    const lowerB = b.toLowerCase();

    if (lowerA < lowerB) return -1;
    if (lowerA > lowerB) return 1;
    return 0;
  });

  console.log(words[0]);
}