import java.util.*;
class Solution {
    public boolean isHappy(int n) { int k = n;
        while(k !=1 && k !=4){
            int sum = 0;
            while(k>0){
                int digit = k%10;
                sum  += digit*digit;
                k = k/10;
            }
            k = sum;
        }
        if(k==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Solution ob = new Solution();
        boolean result = ob.isHappy(n);
        System.out.println(result);
    }
}