from collections import deque

INF = float('inf')

def solution(m, n, h, w, drops):
    rain_time_grid = [[INF for _ in range(n)] for _ in range(m)]
    
    for order, (x, y) in enumerate(drops):
        rain_time_grid[x][y] = order + 1

    row_window_min = []

    for i in range(m):
        dq = deque()
        temp = []
        
        for j in range(n):
            while dq and rain_time_grid[i][dq[-1]] > rain_time_grid[i][j]:
                dq.pop()
            dq.append(j)

            if dq[0] <= j - w:
                dq.popleft()

            if j >= w - 1:
                temp.append(rain_time_grid[i][dq[0]])
        row_window_min.append(temp)
    
    window_min_grid = [[0]*(n-w+1) for _ in range(m-h+1)]

    for j in range(n - w + 1):
        dq = deque()
        
        for i in range(m):
            while dq and row_window_min[dq[-1]][j] > row_window_min[i][j]:
                dq.pop()
            dq.append(i)

            if dq[0] <= i - h:
                dq.popleft()

            if i >= h - 1:
                window_min_grid[i - h + 1][j] = row_window_min[dq[0]][j]

    latest_rain_time = -1
    best_position = (0, 0)

    for i in range(m-h+1):
        for j in range(n-w+1):
            if window_min_grid[i][j] > latest_rain_time:
                latest_rain_time = window_min_grid[i][j]
                best_position = (i, j)

    return best_position
