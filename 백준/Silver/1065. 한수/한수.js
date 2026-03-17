const fs = require("fs");
const N = fs.readFileSync(0, "utf8").trim();

let hansuCount = 0;

for (let i = 1; i <= N; i++) {
  const arr = String(i).split("");

  if (arr.length === 1) {
    hansuCount++;
    continue;
  }

  let commonDifference = arr[1] - arr[0];
  let ishansu = true;

  for (let j = 1; j < arr.length - 1; j++) {
    if (arr[j + 1] - arr[j] === commonDifference) {
      continue;
    } else {
      ishansu = false;
      break;
    }
  }

  if (ishansu) {
    hansuCount++;
  }
}

console.log(hansuCount);
