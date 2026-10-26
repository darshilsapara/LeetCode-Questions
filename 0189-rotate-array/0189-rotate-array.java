class Solution {
    public void rotate(int[] nums, int k) {
        int[] a=new int[k];
        int j=0;
        k=k%nums.length;
        for(int i=nums.length-k;i<nums.length;i++){
            a[j]=nums[i];
            j++;
        }
        for(int i=nums.length-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for(int i= 0;i<k;i++){
            nums[i]=a[i];
        }
    }
}