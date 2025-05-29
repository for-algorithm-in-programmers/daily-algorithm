from itertools import permutations
# 순열 조합 만들기 위한 모듈

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True

def solution(numbers):
    num_set = set()

    for i in range(1, len(numbers)+1):
        for perm in permutations(numbers, i):
            # 숫자 조합 만들기
            num = int(''.join(perm))
            num_set.add(num)
            # 중복 제거 위해 set 사용

    # 소수 개수 세기
    count = 0
    for n in num_set:
        if is_prime(n):
            count += 1

    return count
