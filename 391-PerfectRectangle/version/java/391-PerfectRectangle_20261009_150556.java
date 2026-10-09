// Last updated: 10/9/2026, 3:05:56 PM
1import java.util.*;
2
3class Solution {
4    public boolean isRectangleCover(int[][] rectangles) {
5        if (rectangles.length == 0) {
6            return false;
7        }
8
9        int minX = Integer.MAX_VALUE;
10        int minY = Integer.MAX_VALUE;
11        int maxX = Integer.MIN_VALUE;
12        int maxY = Integer.MIN_VALUE;
13
14        long area = 0;
15        Set<String> set = new HashSet<>();
16
17        for (int[] r : rectangles) {
18            minX = Math.min(minX, r[0]);
19            minY = Math.min(minY, r[1]);
20            maxX = Math.max(maxX, r[2]);
21            maxY = Math.max(maxY, r[3]);
22
23            area += (long) (r[2] - r[0]) * (r[3] - r[1]);
24
25            String[] corners = {
26                r[0] + "," + r[1],
27                r[0] + "," + r[3],
28                r[2] + "," + r[1],
29                r[2] + "," + r[3]
30            };
31
32            for (String corner : corners) {
33                if (!set.add(corner)) {
34                    set.remove(corner);
35                }
36            }
37        }
38
39        long boundingArea = (long) (maxX - minX) * (maxY - minY);
40
41        if (area != boundingArea) {
42            return false;
43        }
44
45        Set<String> expected = new HashSet<>();
46        expected.add(minX + "," + minY);
47        expected.add(minX + "," + maxY);
48        expected.add(maxX + "," + minY);
49        expected.add(maxX + "," + maxY);
50
51        return set.equals(expected);
52    }
53}