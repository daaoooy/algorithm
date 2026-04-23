def solution(wallet, bill):
    min_fold = 0

    wallet.sort(reverse=True)
    bill.sort(reverse=True)

    while True:
        if wallet[0] >= bill[0] and wallet[1] >= bill[1]:
            return min_fold

        bill[0] //= 2
        min_fold += 1

        bill.sort(reverse=True)