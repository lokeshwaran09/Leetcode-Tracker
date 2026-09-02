// Last updated: 9/2/2026, 8:51:47 AM
1import java.util.*;
2
3class MyStack {
4    Queue<Integer> q = new LinkedList<>();
5
6    public MyStack() {
7    }
8
9    public void push(int x) {
10        q.offer(x);
11
12        int size = q.size();
13
14        for (int i = 1; i < size; i++) {
15            q.offer(q.poll());
16        }
17    }
18
19    public int pop() {
20        return q.poll();
21    }
22
23    public int top() {
24        return q.peek();
25    }
26
27    public boolean empty() {
28        return q.isEmpty();
29    }
30}
31
32/**
33 * Your MyStack object will be instantiated and called as such:
34 * MyStack obj = new MyStack();
35 * obj.push(x);
36 * int param_2 = obj.pop();
37 * int param_3 = obj.top();
38 * boolean param_4 = obj.empty();
39 */