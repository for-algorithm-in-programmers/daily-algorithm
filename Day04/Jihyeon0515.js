function solution(clothes) {
  var answer = 1;
  
  const map = new Map();

  //종류별로 몇개의 아이템이 있는지 저장
  for (let [item, kind] of clothes) {
      map.set(kind, (map.get(kind) || 0) + 1);
  }

  //안입는 경우를 각 종류별로 추가한 뒤 곱하기
  for (let [kind, count] of map) {
      answer *= (count + 1);
  }

  //아무것도 안 입는 경우 제외 
  answer -= 1;
  
  return answer;
}