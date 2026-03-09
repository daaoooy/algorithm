const fs = require("fs");
const S = fs.readFileSync(0, "utf8").trim();

let stack = [];
let answer = "";

for (let i = 0; i < S.length; ) {
  if (S[i] === "<") {
    while (stack.length) {
      answer += stack.pop();
    }

    let tmp = i + 1;
    while (S[tmp] !== ">") {
      tmp++;
    }

    answer += S.substring(i, tmp + 1);
    i = tmp + 1;
  } else if (S[i] === " ") {
    while (stack.length) {
      answer += stack.pop();
    }

    answer += " ";
    i++;
  } else {
    stack.push(S[i]);
    i++;
  }
}

while (stack.length) {
  answer += stack.pop();
}

console.log(answer);
