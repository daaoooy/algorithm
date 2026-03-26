const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

let idx = 0;

const computers = Number(input[idx++]);
const connects = Number(input[idx++]);

let networks = [];

for (let i = 0; i < connects; i++) {
  networks.push(input[idx++].split(" ").map(Number));
}

let graph = Array.from({ length: computers + 1 }, () => []);

for (let [c1, c2] of networks) {
  graph[c1].push(c2);
  graph[c2].push(c1);
}

let visited = Array(computers + 1).fill(false);

dfs(1);

function dfs(node) {
  visited[node] = true;

  for (let next of graph[node]) {
    if (!visited[next]) {
      dfs(next);
    }
  }
}

const worms = visited.filter((value) => value).length - 1;
console.log(worms);
