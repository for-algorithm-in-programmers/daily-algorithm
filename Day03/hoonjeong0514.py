def solution(phone_book):
    # 효율적으로 찾기 위한 정렬
    phone_book.sort()

    # 비교 대상 1개를 빼고 반복
    for i in range(len(phone_book)-1):
        a = phone_book[i]
        b = phone_book[i+1]
        # 첫 번째 문자열의 길이 만큼 비교해서 같은 경우 False
        if a == b[:len(a)]:
            return False

    return True
