def solution(sizes):
    maxw = 0
    maxh = 0

    for w, h in sizes:
        # 더 큰 쪽이 가로, 작은 쪽이 세로
        big = max(w, h)
        small = min(w, h)
        maxw = max(maxw, big)
        maxh = max(maxh, small)

    return maxw * maxh

