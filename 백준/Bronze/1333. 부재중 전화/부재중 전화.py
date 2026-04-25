def solution():
    N, L, D = map(int, input().split())
    
    total_time = N * L + (N - 1) * 5
    
    t = D
    
    while True:
        if t > total_time:
            print(t)
            return
        
        cycle = L + 5
        time_in_cycle = t % cycle
        
        if time_in_cycle < L:
            t += D
            continue
        
        print(t)
        return


solution()