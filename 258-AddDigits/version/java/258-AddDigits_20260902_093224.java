// Last updated: 9/2/2026, 9:32:24 AM
1class Solution {
2    public List<String> removeInvalidParentheses(String s) {
3        List<String> result = new ArrayList<>();
4        remove(s, 0, 0, new char[]{'(', ')'}, result);
5        return result;
6    }
7
8    private void remove(String s, int start, int lastRemove,
9                         char[] pair, List<String> result) {
10        int balance = 0;
11
12        for (int i = start; i < s.length(); i++) {
13            if (s.charAt(i) == pair[0]) {
14                balance++;
15            } else if (s.charAt(i) == pair[1]) {
16                balance--;
17            }
18
19            if (balance >= 0) continue;
20
21            for (int j = lastRemove; j <= i; j++) {
22                if (s.charAt(j) == pair[1] &&
23                    (j == lastRemove || s.charAt(j - 1) != pair[1])) {
24                    remove(
25                        s.substring(0, j) + s.substring(j + 1),
26                        i,
27                        j,
28                        pair,
29                        result
30                    );
31                }
32            }
33
34            return;
35        }
36
37        String reversed = new StringBuilder(s).reverse().toString();
38
39        if (pair[0] == '(') {
40            remove(reversed, 0, 0, new char[]{')', '('}, result);
41        } else {
42            result.add(reversed);
43        }
44    }
45}