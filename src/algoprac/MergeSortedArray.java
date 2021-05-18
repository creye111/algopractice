package algoprac;

public class MergeSortedArray {
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int c1 =m-1;
	        int c2=n-1;
	        while(c1>0&&c2>0){
	            if(nums1[c1]>nums2[c2]){
	               nums1[c1+c2-1] = nums1[c1];
	                c1--;
	            }else{
	            	nums1[c1+c2-1] = nums2[c2];
	            	c2--;
	            }
	        }
	        
	        while(c2>0) {
	        	if(nums1)
	        }
}
