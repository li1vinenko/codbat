public int scoresAverage(int[] scores) {

  int begOfArr = 0;
  int halfOfArr = scores.length/2;
  int endOfArr = scores.length;
  int aver1 = average(scores, begOfArr, halfOfArr);
  int aver2 = average(scores, halfOfArr, endOfArr);

  if (aver1 - aver2 > 0) {
      return aver1;
      } else {
      return aver2;
      }
}

public int average(int[] scores, int start, int end) {
  int sum = 0;
  for (int i = start; i < end; i++) {
      sum = sum + scores[i];
      } 
  return sum/(scores.length/2);
}
