function solution(n, wires) {
  var answer = -1;
  
  //현재 노드, 현재 지나온 노드 개수
  function dfs(i, count) {
 
      console.log(i);
      if (wires2[i] == undefined)
          return count;
      if (!visited[i]) {
          visited[i] = true;
          count++;
      console.log("fff" + count);
          i = wires2[i][0];
          dfs(i, count)
      }
      else return count;
      
  }
  
  var wires2;
  var visited;
  for (let i = 0; i < n - 1; i++) {
      wires2 = wires; //이건 얕은 복사라 원본 주소를 가져와버림!! 않되!!
      wires2 = [...wires]; //이렇게 써야함
      wires2.splice(i, 1)
      console.log(wires2);
      visited = new Array(wires2.length).fill(false);
      dfs(0, 0);
  }
  
  return answer;
}