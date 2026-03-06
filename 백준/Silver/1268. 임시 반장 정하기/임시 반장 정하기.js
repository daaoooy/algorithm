const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split("\n");

const N = Number(input[0]);
const students = input.slice(1).map((value) => value.split(" ").map(Number));

const sameClassStudents = [];

for (let i = 0; i < N; i++) {
  let count = 0;

  for (let j = 0; j < N; j++) {
    if (i === j) continue;

    for (let k = 0; k < 5; k++) {
      if (students[i][k] === students[j][k]) {
        count++;
        break;
      }
    }
  }

  sameClassStudents.push(count);
}

let maxStudentIdx = 0;

for (let i = 1; i < N; i++) {
  if (sameClassStudents[i] > sameClassStudents[maxStudentIdx]) {
    maxStudentIdx = i;
  }
}

console.log(maxStudentIdx + 1);
