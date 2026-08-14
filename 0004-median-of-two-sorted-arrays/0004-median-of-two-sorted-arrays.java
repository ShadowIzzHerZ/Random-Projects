import java.util.*;
class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the Length of array: m and n respectivly");
    int m = nums1.length;
    int n = nums2.length;   
    int merged[] = new int[m+n];
    for(int i = 0;i<m;i++){
        merged[i]=nums1[i];
        }
    for(int i = 0;i<n;i++){
        merged[i+m]=nums2[i];
        }
        int mer = merged.length;
    for(int i = 0;i<mer-1;i++){
        for(int j = 0;j<mer-1-i;j++){
            if(merged[j]>merged[j+1]){
                int temp = merged[j];
                merged[j] = merged[j+1];
                merged[j+1]=temp;
            }
        }
    }
    double median = 0;
    if(mer%2==0){
        median = (merged[(mer/2)-1] + merged[mer/2])/2.0;
    }else{
        median = merged[mer/2];
        }
    return median;
    }
    public static void main(String []args){
        Solution ob = new Solution();
        double result = ob.findMedianSortedArrays(null, null);
        System.out.println("Median is: " + result);
    } 
}