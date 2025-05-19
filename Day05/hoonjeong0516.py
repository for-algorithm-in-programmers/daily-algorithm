def solution(array, commands):
    answer = []
    for i, j, k in commands:
        x = array[i-1:j]
        lst = sorted(x)
        answer.append(lst[k-1])
    return answer
