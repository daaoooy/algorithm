x, y = map(int, input().split())
z = (100 * y) // x

l = 1
r = 10 ** 9
c = -1

if z >= 99:
    print(c)
    exit()


while l <= r:
    m = (l + r) // 2
    p = (100 * (y + m)) // (x + m)

    if p > z:
        c = m
        r = m - 1
    else: 
        l = m + 1

print(c)