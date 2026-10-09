// Last updated: 10/9/2026, 2:59:25 PM
1/**
2 * // This is the interface that allows for creating nested lists.
3 * // You should not implement it, or speculate about its implementation
4 * public interface NestedInteger {
5 *     // Constructor initializes an empty nested list.
6 *     public NestedInteger();
7 *
8 *     // Constructor initializes a single integer.
9 *     public NestedInteger(int value);
10 *
11 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
12 *     public boolean isInteger();
13 *
14 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
15 *     // Return null if this NestedInteger holds a nested list
16 *     public Integer getInteger();
17 *
18 *     // Set this NestedInteger to hold a single integer.
19 *     public void setInteger(int value);
20 *
21 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
22 *     public void add(NestedInteger ni);
23 *
24 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
25 *     // Return empty list if this NestedInteger holds a single integer
26 *     public List<NestedInteger> getList();
27 * }
28 */
29class Solution {
30    public NestedInteger deserialize(String s) {
31        if (s.charAt(0) != '[') {
32            return new NestedInteger(Integer.parseInt(s));
33        }
34
35        Stack<NestedInteger> stack = new Stack<>();
36        NestedInteger current = null;
37        int numStart = 0;
38
39        for (int i = 0; i < s.length(); i++) {
40            char c = s.charAt(i);
41
42            if (c == '[') {
43                NestedInteger ni = new NestedInteger();
44
45                if (current != null) {
46                    current.add(ni);
47                }
48
49                stack.push(ni);
50                current = ni;
51            } else if (c == ']') {
52                current = stack.pop();
53
54                if (!stack.isEmpty()) {
55                    current = stack.peek();
56                }
57            } else if (c == ',') {
58                numStart = i + 1;
59            } else if (c == '-' || Character.isDigit(c)) {
60                if (i == 0 || s.charAt(i - 1) == '[' || s.charAt(i - 1) == ',') {
61                    numStart = i;
62                }
63
64                if (i + 1 == s.length() || s.charAt(i + 1) == ',' || s.charAt(i + 1) == ']') {
65                    int num = Integer.parseInt(s.substring(numStart, i + 1));
66                    stack.peek().add(new NestedInteger(num));
67                }
68            }
69        }
70
71        return current;
72    }
73}