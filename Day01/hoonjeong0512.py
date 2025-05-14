def solution(participant, completion):
    participant.sort()
    completion.sort()

    # 정렬된 리스트에서 하나씩 비교
    for i in range(len(completion)):
        # 두개가 다르면 완주 못한 사람으로 반환
        if participant[i] != completion[i]:
            return participant[i]

    # 차이가 없으면 마지막 사람이 완주 못한 사람
    return participant[-1]
