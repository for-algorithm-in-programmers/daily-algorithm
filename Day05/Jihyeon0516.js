function solution(array, commands) {
  var answer = [];

  //주어진 범위만큼 잘라서 숫자 찾은 후 배열에 담기
  for (let [i, j, k] of commands) {
    a = array.slice(i - 1, j);
    a.sort((a, b) => a - b);
    answer.push(a[k - 1]);
  }
  return answer;
}