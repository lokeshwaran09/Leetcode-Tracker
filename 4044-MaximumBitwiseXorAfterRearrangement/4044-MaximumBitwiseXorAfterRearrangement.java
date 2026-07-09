// Last updated: 7/9/2026, 3:09:31 PM
class Solution {
    public String maximumXor(String s, String t) {
        int n = s.length();
        int ones = 0;

        for (char c : t.toCharArray()) {
            if (c == '1') ones++;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                if (ones > 0) {
                    ans.append('1');
                    ones--;
                } else {
                    ans.append('0');
                }
            } else {
                if (ones < n - i) {
                    ans.append('1');
                } else {
                    ans.append('0');
                    ones--;
                }
            }
        }

        return ans.toString();
    }
}