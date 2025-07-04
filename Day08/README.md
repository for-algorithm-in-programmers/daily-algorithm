# 🗓️ Day 8 - 2025-05-21

## 🧩 Problem

**문제 이름**: 최소직사각형  
**문제 링크**: https://school.programmers.co.kr/learn/courses/30/lessons/86491

---

## 📚 Summary

- **난이도**: lv1
- **주요 키워드**: 완전탐색, 정렬
- **핵심 아이디어**: 모든 명함을 수납할 수 있도록 각 명함을 긴 변 기준으로 회전시킨 후, 가로와 세로의 최대값을 곱하기

---

## ✍️ 팀원 풀이 요약

| 이름   | 언어   | 요약                                                                                           |
| ------ | ------ | ---------------------------------------------------------------------------------------------- |
| 권아영 | Java   | 각 배열 간 수를 비교하여 배열에 정렬하여 각 배열의 큰 수를 곱함                                |
| 김훈정 | Python | 가장 큰 가로 x 가장 큰 세로 = 최소 지갑 크기                                                   |
| 문지현 | JS     | 세로, 가로 길이를 비교해서 무조건 세로가 크도록 배열 순서 변경 후 맨 앞자리 값들 곱해주기      |
| 이혜지 | Java   | 두 변 중 상대적으로 큰 길이와 그렇지 않은 길이끼리 모으고 정렬한 뒤에, 각 숫자 중 큰 수를 곱함 |

---

## 🧠 리뷰 포인트

- 각 명함의 긴 변을 가로로 두도록 회전시킨 후, 가로와 세로 각각의 최댓값을 구함
- 모든 명함을 하나의 기준(긴 변 기준)으로 통일함으로써 최소 크기의 직사각형을 찾음

## 🗂️ 코드 보기

- [권아영](./Ahyeong0521.java)
- [김훈정](./hoonjeong0521.py)
- [문지현](./Jihyeon0521.js)
- [이혜지](./Hyeji0521.java)

---

## 💬 기타 메모

- ***
