def solution(players, callings):
    rank = {}

    for i in range(len(players)):
        rank[players[i]] = i

    for name in callings:
        current = rank[name]
        front = players[current - 1]

        players[current - 1], players[current] = (
            players[current],
            players[current - 1]
        )

        rank[name] -= 1
        rank[front] += 1

    return players