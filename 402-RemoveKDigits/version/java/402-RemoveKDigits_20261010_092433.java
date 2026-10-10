// Last updated: 10/10/2026, 9:24:33 AM
1class Solution {
2    public String removeKdigits(String num, int k) {
3        StringBuilder stack = new StringBuilder();
4
5        for (char c : num.toCharArray()) {
6            while (k > 0 && stack.length() > 0 &&
7                   stack.charAt(stack.length() - 1) > c) {
8                stack.deleteCharAt(stack.length() - 1);
9                k--;
10            }
11            stack.append(c);
12        }
13
14        while (k > 0) {
15            stack.deleteCharAt(stack.length() - 1);
16            k--;
17        }
18
19        int i = 0;
20        while (i < stack.length() && stack.charAt(i) == '0') {
21            i++;
22        }
23
24        String result = stack.substring(i);
25        return result.isEmpty() ? "0" : result;
26    }
27}