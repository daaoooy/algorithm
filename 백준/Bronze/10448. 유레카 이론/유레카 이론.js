const fs = require('fs');
const input = fs.readFileSync(0, 'utf-8').trim().split('\n');

const T = Number(input[0]);

const triangle = [];
for (let i = 1; i <= 45; i++) {
  triangle.push((i * (i + 1)) / 2);
}

for (let t = 1; t <= T; t++) {
  const K = Number(input[t]);
  let found = 0;

  for (let i = 0; i < triangle.length; i++) {
    for (let j = 0; j < triangle.length; j++) {
      for (let k = 0; k < triangle.length; k++) {
        if (triangle[i] + triangle[j] + triangle[k] === K) {
          found = 1;
          break;
        }
      }
      if (found) break;
    }
    if (found) break;
  }

  console.log(found);
}