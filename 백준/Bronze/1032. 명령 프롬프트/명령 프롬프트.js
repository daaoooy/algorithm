const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split(/\s+/);

const n = Number(input[0]);
const arr = input.slice(1);

const word_len = arr[0].length;
let result_word = "";

for (let i = 0; i < word_len; i++) {
  let all_same_char = true;
  for (let j = 1; j < n; j++) {
    if (arr[j][i] !== arr[0][i]) {
      all_same_char = false;
      break;
    }
  }

  result_word += all_same_char ? arr[0][i] : "?";
}

console.log(result_word);
