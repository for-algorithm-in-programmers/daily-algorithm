def solution(numbers):
    # 문자열 리스트로 변환
    snum = list(map(str, numbers))
    # 각 문자열을 3번 반복한 값을 기준으로 내림차순 정렬
    # lambda : 함수를 간단하게 한 줄로 만들 수 있게 해주는 이름 없는 함수
    answer = sorted(snum, key=lambda x: x*3, reverse=1)
    # 정렬된 문자열들을 하나로 합치고
    # int로 바꿔서 0000 반례 삭제
    return str(int("".join(answer)))
