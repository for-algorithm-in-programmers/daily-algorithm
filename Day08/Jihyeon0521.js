function solution(sizes) {
  var answer = 0;
  
  var ws = [];
  var hs = [];
  
  for (let [w, h] of sizes) {
    if (w < h) [w, h] = [h, w];
    ws.push(w);
    hs.push(h);
  }
  
  ws.sort((a, b) => b - a);
  hs.sort((a, b) => b - a);
  
  answer = ws[0] * hs[0];

  return answer;
}