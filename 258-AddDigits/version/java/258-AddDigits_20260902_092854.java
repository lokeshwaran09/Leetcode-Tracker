// Last updated: 9/2/2026, 9:28:54 AM
1import java.util.*;
2
3class Solution {
4    public List<String> addOperators(String num, int target) {
5        List<String> result = new ArrayList<>();
6        backtrack(num, target, 0, 0, 0, "", result);
7        return result;
8    }
9
10    private void backtrack(String num, int target, int index,
11                            long value, long prev,
12                            String expression, List<String> result) {
13
14        if (index == num.length()) {
15            if (value == target) {
16                result.add(expression);
17            }
18            return;
19        }
20
21        for (int i = index; i < num.length(); i++) {
22            if (i > index && num.charAt(index) == '0') {
23                break;
24            }
25
26            String part = num.substring(index, i + 1);
27            long current = Long.parseLong(part);
28
29            if (index == 0) {
30                backtrack(num, target, i + 1, current, current,
31                          part, result);
32            } else {
33                backtrack(num, target, i + 1,
34                          value + current, current,
35                          expression + "+" + part, result);
36
37                backtrack(num, target, i + 1,
38                          value - current, -current,
39                          expression + "-" + part, result);
40
41                backtrack(num, target, i + 1,
42                          value - prev + prev * current,
43                          prev * current,
44                          expression + "*" + part, result);
45            }
46        }
47    }
48}