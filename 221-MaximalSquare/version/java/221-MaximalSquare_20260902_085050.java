// Last updated: 9/2/2026, 8:50:50 AM
1class Solution {
2    public int calculate(String s) {
3        int result = 0;
4        int number = 0;
5        int sign = 1;
6        int[] stack = new int[s.length()];
7        int top = -1;
8
9        for (int i = 0; i < s.length(); i++) {
10            char c = s.charAt(i);
11
12            if (Character.isDigit(c)) {
13                number = number * 10 + (c - '0');
14            } 
15            else if (c == '+') {
16                result += sign * number;
17                number = 0;
18                sign = 1;
19            } 
20            else if (c == '-') {
21                result += sign * number;
22                number = 0;
23                sign = -1;
24            } 
25            else if (c == '(') {
26                stack[++top] = result;
27                stack[++top] = sign;
28                result = 0;
29                sign = 1;
30            } 
31            else if (c == ')') {
32                result += sign * number;
33                number = 0;
34
35                int prevSign = stack[top--];
36                int prevResult = stack[top--];
37
38                result = prevResult + prevSign * result;
39            }
40        }
41
42        result += sign * number;
43
44        return result;
45    }
46}