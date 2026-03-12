const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim();

const [A, B] = input.split(" ");

const answer = Array.from({ length: B.length }, () =>
  Array(A.length).fill("."),
);

let crossCharRowIdx = -1;
let crossCharColIdx = -1;

for (let j = 0; j < A.length; j++) {
  for (let i = 0; i < B.length; i++) {
    if (A[j] === B[i]) {
      crossCharRowIdx = i;
      crossCharColIdx = j;
      break;
    }
  }
  if (crossCharRowIdx !== -1 && crossCharColIdx !== -1) break;
}
for (let i = 0; i < A.length; i++) {
  answer[crossCharRowIdx][i] = A[i];
}

for (let i = 0; i < B.length; i++) {
  answer[i][crossCharColIdx] = B[i];
}

console.log(answer.map((value) => value.join("")).join("\n"));
