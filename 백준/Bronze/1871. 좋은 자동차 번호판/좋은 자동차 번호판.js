const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split("\n");

const N = Number(input[0]);

for (let i = 1; i <= N; i++) {
  const [letters, numbers] = input[i].split("-");

  const letterValue =
    (letters.charCodeAt(0) - 65) * 26 * 26 +
    (letters.charCodeAt(1) - 65) * 26 +
    (letters.charCodeAt(2) - 65);

  const numberValue = Number(numbers);

  if (Math.abs(letterValue - numberValue) <= 100) {
    console.log("nice");
  } else {
    console.log("not nice");
  }
}
