//OPTIMISED APPROACH ================  MOORE'S VOOTING ALGORITHM =====================

// TC -> O(N), SC-> O(1)
public class MajorityElement1 {
    public static int potential(int[] arr){
        int val = arr[0];
        int count = 1;
        for( int i = 1; i < arr.length ; i++) {
            if( val == arr[i]) {
                count++;
            }else{
                count--;
            }
            
            if( count == 0) {
                val = arr[i];
                count = 1;
            }
        }
        return val;
   }
    public static void printMajorityElement(int[] arr) {
        // write your code here
       
       int val = potential(arr);
       int count = 0;
       for( int i = 0 ; i < arr.length ; i++) {
           if( val == arr[i]) count++;
       }
       
       if( count > arr.length / 2){
           System.out.println(val);
       }else{
            System.out.println("No Majority Element exist");
       }
        
    }
}
