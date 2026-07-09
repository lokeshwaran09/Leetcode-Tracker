// Last updated: 7/9/2026, 3:09:34 PM
class Solution {
    public int scoreDifference(int[] nums) {
        
        int score1 = 0;
        int score2 = 0;
        
        boolean firstActive = true;  // initially first player is active
        
        for (int i = 0; i < nums.length; i++) {
            
            int gameNumber = i + 1;
            
            // Swap if number is odd
            if (nums[i] % 2 != 0) {
                firstActive = !firstActive;
            }
            
            // Swap if game number is multiple of 6
            if (gameNumber % 6 == 0) {
                firstActive = !firstActive;
            }
            
            // Active player gains points
            if (firstActive) {
                score1 += nums[i];
            } else {
                score2 += nums[i];
            }
        }
        
        return score1 - score2;
    }
}