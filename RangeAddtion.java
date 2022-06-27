public class RangeAddtion {
    public static int[] getModifiedArray(int length, int[][] queries) {
        
        int[] arr = new int[length];
        
        for( int i = 0; i < queries.length ; i++) {
            
            int from  = queries[i][0];
            int to = queries[i][1];
            int val = queries[i][2];
            
            
            // for( int j = from ; j <= to ;j++) {
            //     arr[j] += val;
            // }
            arr[from] += val;
            if( to + 1 < length ) {
                arr[to + 1] -= val;
            }
            
            
        }
        int sum = 0;
        for( int i = 0; i < length ; i++) {
            sum += arr[i];
            arr[i] = sum;
        }
        return arr;
        
    }
}
