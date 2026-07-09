// Last updated: 7/9/2026, 3:10:03 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for(int n : position){
            if(n%2==0) {
                even++;
            }
            else {
                odd++;
            }
        }
        return even>odd?odd:even;
        
    }
}