// Two pointer

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] arr) {
        int res[] = new int[arr.length];
        int i = 0, j = arr.length - 1, k = arr.length - 1;
          while( i <= j) {
              int val1 = arr[i] * arr[i];
              int val2 = arr[j] * arr[j];
              if(val1 > val2){
                  res[k] = val1;
                  i++;
              }else{
                  res[k] =val2;
                  j--;
              }
               k--;
        
          }
          return res;
      }
}
