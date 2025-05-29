function solution(word) {
  const aeiou = ['A', 'E', 'I', 'O', 'U'];
  
  let count = 0;
  let found = false;
  
  function dfs(current) {
      if (found || current.length > 5) return;
      
      if (current == word) {
          found = true;
          return ;
      }
      
      count++;
      
      for (let i = 0; i < aeiou.length; i++) {
          dfs(current + aeiou[i]);
      }
  }
  
  dfs('');
  return count;
}