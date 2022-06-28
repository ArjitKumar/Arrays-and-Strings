public class MajorityElement_II {
    public boolean isGreater( int[] arr, int ele) {
        int count = 0;
        for( int val : arr){
            if( val == ele) count++;
        }
        return count > arr.length / 3;
    } 
    public List<Integer> majorityElement(int[] arr) {
      int val1 = arr[0];
        int c1 = 1;
        int val2 = arr[0];
        int c2 = 0;
        int i = 1;
        while( i < arr.length) {
            if( val1 == arr[i]) {
                val1 = arr[i];
                c1++;
            }else if(val2 == arr[i]){
                 val2 = arr[i];
                c2++;
            }else{
                if( c1 == 0) {
                    val1 = arr[i];
                    c1 = 1;
                }else if( c2 == 0) {
                     val2 = arr[i];
                      c2 = 1;
                }else{
                     c2--;
                     c1--;
                }
            }
            i++;
        }
        // potential candidates are val1 and val2
        ArrayList<Integer> list = new ArrayList<>();
        if( isGreater( arr, val1) == true) {
            list.add( val1);
        }
        if( val1 != val2 && isGreater( arr, val2) == true) {
             list.add( val2);
        }
        return list;
      
    }
}
