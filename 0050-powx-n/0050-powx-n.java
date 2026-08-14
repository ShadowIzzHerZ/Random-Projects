
import java.util.Scanner;
class Solution {
    public double myPow(double x, double n) {
        double yoyo = Math.pow(x,n);
        return yoyo;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base (x): ");
        double x = sc.nextDouble();
        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();
        Solution solution = new Solution();
        double result = solution.myPow(x, n);
        System.out.println("Result: " + result);
        sc.close();
        
    }
}