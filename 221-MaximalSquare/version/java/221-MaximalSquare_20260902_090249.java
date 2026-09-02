// Last updated: 9/2/2026, 9:02:49 AM
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
11class Solution {
12    public boolean isPalindrome(ListNode head) {
13        ListNode slow = head;
14        ListNode fast = head;
15
16        while (fast != null && fast.next != null) {
17            slow = slow.next;
18            fast = fast.next.next;
19        }
20
21        if (fast != null) {
22            slow = slow.next;
23        }
24
25        ListNode secondHalf = reverse(slow);
26        ListNode firstHalf = head;
27
28        while (secondHalf != null) {
29            if (firstHalf.val != secondHalf.val) {
30                return false;
31            }
32
33            firstHalf = firstHalf.next;
34            secondHalf = secondHalf.next;
35        }
36
37        return true;
38    }
39
40    private ListNode reverse(ListNode head) {
41        ListNode prev = null;
42
43        while (head != null) {
44            ListNode next = head.next;
45            head.next = prev;
46            prev = head;
47            head = next;
48        }
49
50        return prev;
51    }
52}