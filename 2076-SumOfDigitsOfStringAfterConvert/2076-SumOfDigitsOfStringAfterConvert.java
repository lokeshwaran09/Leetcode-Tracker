// Last updated: 7/9/2026, 3:09:52 PM
class Solution {
    public int getLucky(String s, int k) {
        String alp = "abcdefghijklmnopqrstuvwxyz";
        String str = "";
        for(char ch : s.toCharArray()){
            str += alp.indexOf(ch) + 1;
        }
        return value(str,k);
    }
    public int value(String s1,int k){
        int sum = 0;
        while(k --> 0){
            sum = 0;
            for(char ch: s1.toCharArray()){
                sum += ch - '0';
            }
            s1 = String.valueOf(sum);
        }
        return sum;
    }
}