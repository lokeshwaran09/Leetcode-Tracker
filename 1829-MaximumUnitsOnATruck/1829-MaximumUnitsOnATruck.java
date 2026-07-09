// Last updated: 7/9/2026, 3:09:57 PM
import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int totalUnits = 0;

        for (int[] box : boxTypes) {
            int boxes = Math.min(box[0], truckSize);

            totalUnits += boxes * box[1];
            truckSize -= boxes;

            if (truckSize == 0) {
                break;
            }
        }

        return totalUnits;
    }
}