import java.util.Scanner;
class Solution {
    public int divide(int dividend, int divisor) {
       double result = 0;
       result = (double)dividend / divisor;
       int resultInt = (int)result;
        return resultInt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();
        
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }
        
        Solution obj = new Solution();
        int result = obj.divide(dividend, divisor);
        
        System.out.println("Result of division: " + result);
    }
}
    
