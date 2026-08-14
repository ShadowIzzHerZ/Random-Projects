class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num ==0)return true;
        int n = num;long reversed1 = 0;long reversed2 = 0;
        while(n!=0){
            reversed1 = reversed1*10 + n%10;
            n = n/10;
        }
        
        int rev = (int)reversed1;
        while(rev!=0){
            reversed2 = reversed2*10 + rev%10;
            rev = rev/10;
        }
        return (reversed2==num);
    }
}