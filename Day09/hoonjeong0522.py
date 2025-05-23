def solution(answers):
    p1 = [1, 2, 3, 4, 5]
    p2 = [2, 1, 2, 3, 2, 4, 2, 5]
    p3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    score1 = 0
    score2 = 0
    score3 = 0

    # 문제 하나씩 비교
    for i in range(len(answers)):
        if answers[i] == p1[i % len(p1)]:
            score1 += 1
        if answers[i] == p2[i % len(p2)]:
            score2 += 1
        if answers[i] == p3[i % len(p3)]:
            score3 += 1

    # 최고 점수
    max_score = max(score1, score2, score3)

    # 최고 점수받은 사람 번호 담기
    result = []
    if score1 == max_score:
        result.append(1)
    if score2 == max_score:
        result.append(2)
    if score3 == max_score:
        result.append(3)

    return result
