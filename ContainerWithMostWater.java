public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0 , j = height.length - 1;
        int max = Integer.MIN_VALUE;
        while(  i < j) {
            int width = j - i;
            int area = width * Math.min(height[i],height[j]);
            max = Math.max( max, area);
            
            if(height[i] <= height[j]) i++;
            else j--;
        }
        
        return max;
    }
}
