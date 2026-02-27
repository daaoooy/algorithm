const fs = require("fs");
const N = fs.readFileSync(0, "utf8").trim();

const regex = /^[47]+$/;

for (let i = N; i >= 4; i--) {
  const find = regex.test(String(i));

  if (find) {
    console.log(i);
    break;
  }
}
