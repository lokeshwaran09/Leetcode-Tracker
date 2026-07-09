// Last updated: 7/9/2026, 3:09:36 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
      int n = arrivalTime + delayedTime;
      return n%24;  
    }
}