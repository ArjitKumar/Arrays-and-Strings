class Solution {
    public boolean isLongPressedName(String n, String t) {
       if( n.length() > t.length()) return false;
        
        int i = 0 , j = 0;
        while( i < n.length()  && j < t.length() ) {
            if( n.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else if( i > 0 && n.charAt(i - 1) == t.charAt(j)){
                j++;
            }else{
                 return false;
            }
        }
        while( j < t.length() ){
             if(n.charAt(i - 1) != t.charAt(j)) return false;
            j++;
        }
        
        return i < n.length() ? false : true;
    }
}