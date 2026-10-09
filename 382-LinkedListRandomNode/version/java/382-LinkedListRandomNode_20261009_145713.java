// Last updated: 10/9/2026, 2:57:13 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11import java.util.*;
12
13class Solution {
14    private ListNode head;
15    private Random random;
16
17    public Solution(ListNode head) {
18        this.head = head;
19        this.random = new Random();
20    }
21
22    public int getRandom() {
23        int result = 0;
24        int count = 0;
25        ListNode current = head;
26
27        while (current != null) {
28            count++;
29
30            if (random.nextInt(count) == 0) {
31                result = current.val;
32            }
33
34            current = current.next;
35        }
36
37        return result;
38    }
39}
40
41/**
42 * Your Solution object will be instantiated and called as such:
43 * Solution obj = new Solution(head);
44 * int param_1 = obj.getRandom();
45 */