import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
      int original = x;int rev = 0;int digit = 0;
      if(x<0) return false;
      while(x>0){
        digit = x%10;
        rev = rev*10+ digit;
        x = x/10;
      }
      return original==rev ;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("Enter number:");
        int x = sc.nextInt();
        ob.isPalindrome(x);
    } 
}