// Last updated: 10/10/2026, 9:23:40 AM
1import java.util.*;
2
3class Solution {
4    public List<String> readBinaryWatch(int turnedOn) {
5        List<String> result = new ArrayList<>();
6
7        for (int hour = 0; hour < 12; hour++) {
8            for (int minute = 0; minute < 60; minute++) {
9                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {
10                    result.add(hour + ":" + (minute < 10 ? "0" : "") + minute);
11                }
12            }
13        }
14
15        return result;
16    }
17}