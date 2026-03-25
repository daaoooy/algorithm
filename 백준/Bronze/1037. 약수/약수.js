const fs = require('fs');
const input = fs.readFileSync(0, 'utf-8').trim().split('\n');

const count = Number(input[0]);
const divisors = input[1].split(' ').map(Number);

divisors.sort((a, b) => a - b);

const result = divisors[0] * divisors[divisors.length - 1];

console.log(result);