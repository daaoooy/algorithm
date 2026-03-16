const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split(/\s*\n/);

const N = Number(input[0]);

const A = input[1].split(" ").map(Number);
const B = input[2].split(" ").map(Number);

let rearrangeA = new Map();
let tmpB = Array.from(B);

let answer = 0;

while (rearrangeA.size !== N) {
  let minA, minAidx;
  let maxB, maxBidx;

  for (let i = 0; i < N; i++) {
    if (A[i] === -1) {
      continue;
    } else {
      minA = A[i];
      minAidx = i;
      break;
    }
  }

  for (let i = 0; i < N; i++) {
    if (tmpB[i] === -1) {
      continue;
    } else {
      maxB = tmpB[i];
      maxBidx = i;
      break;
    }
  }

  for (let i = 1; i < N; i++) {
    if (tmpB[i] === -1) continue;

    if (maxB < tmpB[i]) {
      maxB = tmpB[i];
      maxBidx = i;
    }
  }

  for (let i = 1; i < N; i++) {
    if (A[i] === -1) continue;

    if (minA > A[i]) {
      minA = A[i];
      minAidx = i;
    }
  }

  rearrangeA.set(maxBidx, minA);

  A[minAidx] = -1;
  tmpB[maxBidx] = -1;
}

for (let i = 0; i < N; i++) {
  answer += B[i] * rearrangeA.get(i);
}

console.log(answer);
