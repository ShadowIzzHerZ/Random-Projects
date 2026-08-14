import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger s = new BigInteger(num1);
        BigInteger s1 = new BigInteger(num2);
        BigInteger s3 = s.multiply(s1);
        return s3.toString();
    }
}