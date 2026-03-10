const fs = require("fs");
const S = fs.readFileSync(0, "utf8").trim();

const arr = S.split("");
const map = new Map();

for (let i = 0; i < S.length; i++) {
  map.set(arr[i], 0);
}

for (let i = 0; i < S.length; i++) {
  map.set(S[i], map.get(S[i]) + 1);
}

const mapToArr = [...map.entries()].sort((a, b) => a[0].localeCompare(b[0]));

let oddCount = 0;
let oddChar = "";

for (let i = 0; i < mapToArr.length; i++) {
  if (mapToArr[i][1] % 2 !== 0) {
    oddCount++;
    oddChar = mapToArr[i][0];
  }
}

if (oddCount > 1) {
  console.log("I'm Sorry Hansoo");
} else {
  let halfWord = "";

  for (let i = 0; i < mapToArr.length; i++) {
    const char = mapToArr[i][0];
    const count = mapToArr[i][1];

    halfWord += char.repeat(Math.floor(count / 2));
  }

  const reverseWord = halfWord.split("").reverse().join("");
  console.log(halfWord + oddChar + reverseWord);
}
