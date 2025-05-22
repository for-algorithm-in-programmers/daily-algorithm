def solution(clothes):
    clst = {}

    for name, kind in clothes:
        if kind in clst:
            clst[kind] += 1
        else:
            clst[kind] = 1

    answer = 1

    for count in clst.values():  # 각 종류의 의상 개수를 하나씩
        answer *= (count + 1)  # "입는 경우 + 안 입는 경우"로 계산

    return answer - 1  # 모든 종류를 "안 입는 경우" 1가지를 빼줌
