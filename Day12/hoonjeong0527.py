from itertools import permutations

def solution(k, dungeons):
    max_cnt = 0

    for order in permutations(dungeons):
        c = k
        cnt = 0
        for need, cost in order:
            if c >= need:
                c -= cost
                cnt += 1
            else:
                break
        max_cnt = max(max_cnt, cnt)

    return max_cnt
