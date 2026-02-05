const input = require("fs").readFileSync(0, "utf8").trim();

if (input === "") {
  console.log(0);
} else {
  const words = input.split(/\s+/);
  console.log(words.length);
}
