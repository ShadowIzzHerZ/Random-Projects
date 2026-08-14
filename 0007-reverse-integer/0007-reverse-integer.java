import java.util.*;

class Solution {
    public int reverse(int x) {
        long rev = 0;
        while( x!= 0){
            rev = rev * 10 + x%10;
            x = x/10;
        }
        return (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) ? 0 :(int) rev;
    }
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        Solution ob = new Solution();
        System.out.println(ob.reverse(x));
    }
}
