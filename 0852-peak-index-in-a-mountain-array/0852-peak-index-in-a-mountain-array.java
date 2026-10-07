class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int maxindex=0;
       for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxindex]){
                maxindex=i;
            }
       }
       return maxindex;

    }
}