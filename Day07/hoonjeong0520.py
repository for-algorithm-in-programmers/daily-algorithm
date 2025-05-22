def solution(citations):
    citations.sort(reverse=True)  # 내림차순 정렬
    for i, c in enumerate(citations):
        if i >= c:
            return i
    return len(citations)
