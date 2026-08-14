import java.util.*;
class Solution {
    public boolean isFascinating(int n) {
        if(n<100) return false;

        String str = "" + n + (n*2) + (n*3);

        for(int ch = '1';ch <='9';ch++){
            if(str.indexOf(ch) == -1||str.indexOf(ch) !=str.lastIndexOf(ch)){
                return false;
            }
            }
            return true;
        }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution ob = new Solution();
        boolean result = ob.isFascinating(n);
        System.out.println(result);
    }
}