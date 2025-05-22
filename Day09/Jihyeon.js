function solution(answers) {
  var answer = [];
  
  //찍는 스타일 배열로 담기
  var a = [1, 2, 3, 4, 5];
  var b = [2, 1, 2, 3, 2, 4, 2, 5];
  var c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
  
  //정답일 때 점수 올려주기
  var score = [0, 0, 0];
  for(let i = 0; i < answers.length; i++){
      if (a[i % a.length] == answers[i]){
          score[0]++;
      }
      if (b[i % b.length] == answers[i]){
          score[1]++;
      }
      if (c[i % c.length] == answers[i]){
          score[2]++;
      }
  }

  //최대 점수 찾기
  var max = Math.max(...score);
  
  //최대 점수와 같은 번호 구하기
  for (let i = 0; i < 3; i++){
      if (max == score[i])
          answer.push(i + 1);
  }
  
  return answer;
}