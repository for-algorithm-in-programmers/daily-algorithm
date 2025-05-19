function solution(numbers) {
  var answer = '';
  let str = "";
  
  numbers.sort((a, b) => {
      let ab = '' + a + b;
      let ba = '' + b + a;
      
      return (parseInt(ba) - parseInt(ab))
  });
  for (let n of numbers)
      answer += String(n);

  //0으로 시작하는 값은 0
  if (answer[0] == 0)
      answer = '0';

  return answer;
}