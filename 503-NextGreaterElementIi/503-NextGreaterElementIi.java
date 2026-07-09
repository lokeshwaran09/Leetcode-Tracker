// Last updated: 7/9/2026, 3:10:24 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<2*n; i++){
            int index = i % n;
            while(!stack.isEmpty() && nums[stack.peek()] < nums[index]){
                int top = stack.pop();
                result[top] = nums[index];
            }
            if(i < n){
                stack.push(index);
            }
        }
        return result;
    }
}