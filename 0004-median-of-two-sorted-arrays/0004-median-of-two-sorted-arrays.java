class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] result =new int [n+m];

        int i=0;
        int j=0;
        int k=0;

        while (i<n && j<m){
            if(nums1[i] <= nums2[j]){
                result[k]=nums1[i];
                i++;
            }else{
                result[k]=nums2[j];
                j++;
            }
            k++;
        }
        while (i<n){
            result[k] =nums1[i];
            i++;
            k++;
        }
        while(j<m){
            result[k]=nums2[j];
            j++;
            k++;
        }
        //System.out.println(results);
        int y=result.length;
        if(y % 2 !=0){
            return result[y/2];

        }else{
            return (result[y/2-1] + result[y/2])/2.0;
        }
    }
}