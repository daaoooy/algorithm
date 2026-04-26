def solution(binary: str) -> str:
    while len(binary) % 3 != 0:
        binary = '0' + binary

    result = ''

    for i in range(0, len(binary), 3):
        chunk = binary[i:i+3]
        result += str(int(chunk, 2))

    return result

answer = solution(input())
print(answer)