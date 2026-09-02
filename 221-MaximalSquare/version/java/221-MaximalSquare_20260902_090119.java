// Last updated: 9/2/2026, 9:01:19 AM
1import java.util.*;
2
3class MyQueue {
4    Stack<Integer> input;
5    Stack<Integer> output;
6
7    public MyQueue() {
8        input = new Stack<>();
9        output = new Stack<>();
10    }
11
12    public void push(int x) {
13        input.push(x);
14    }
15
16    public int pop() {
17        move();
18        return output.pop();
19    }
20
21    public int peek() {
22        move();
23        return output.peek();
24    }
25
26    public boolean empty() {
27        return input.isEmpty() && output.isEmpty();
28    }
29
30    private void move() {
31        if (output.isEmpty()) {
32            while (!input.isEmpty()) {
33                output.push(input.pop());
34            }
35        }
36    }
37}
38
39/**
40 * Your MyQueue object will be instantiated and called as such:
41 * MyQueue obj = new MyQueue();
42 * obj.push(x);
43 * int param_2 = obj.pop();
44 * int param_3 = obj.peek();
45 * boolean param_4 = obj.empty();
46 */