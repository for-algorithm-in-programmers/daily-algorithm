function solution(brown, yellow) {
  var total = brown + yellow;

  for (let h = 3; h < total; h++) {
      if (total % h !== 0)
          continue;
      
      let w = total / h;
      if ((h - 2) * (w - 2) === yellow)
          return [w, h];
  }
}