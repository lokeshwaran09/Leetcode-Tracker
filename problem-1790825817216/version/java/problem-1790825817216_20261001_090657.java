// Last updated: 10/1/2026, 9:06:57 AM
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int left = 1;
7        int right = n;
8
9        while (left < right) {
10            int mid = left + (right - left) / 2;
11
12            if (isBadVersion(mid)) {
13                right = mid;
14            } else {
15                left = mid + 1;
16            }
17        }
18
19        return left;
20    }
21}