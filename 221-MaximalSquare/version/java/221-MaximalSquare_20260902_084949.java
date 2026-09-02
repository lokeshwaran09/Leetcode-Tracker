// Last updated: 9/2/2026, 8:49:49 AM
1class Solution {
2    public int computeArea(int ax1, int ay1, int ax2, int ay2,
3                           int bx1, int by1, int bx2, int by2) {
4
5        long area1 = (long) (ax2 - ax1) * (ay2 - ay1);
6        long area2 = (long) (bx2 - bx1) * (by2 - by1);
7
8        long overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
9        long overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
10
11        long overlap = overlapWidth * overlapHeight;
12
13        return (int) (area1 + area2 - overlap);
14    }
15}