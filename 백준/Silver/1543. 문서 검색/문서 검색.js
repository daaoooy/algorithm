const fs = require("fs");
const input = fs.readFileSync(0, "utf8").split("\n");

const document = input[0].replace(/\r$/, "");
const word = input[1].replace(/\r$/, "");

const wordLen = word.length;
const documentLen = document.length;

let count = 0;

for (let i = 0; i <= documentLen - wordLen; ) {
  let isSame = true;

  for (let j = 0; j < wordLen; j++) {
    if (word[j] !== document[i + j]) {
      isSame = false;
      break;
    }
  }

  if (isSame) {
    count++;
    i += wordLen;
  } else {
    i++;
  }
}

console.log(count);
