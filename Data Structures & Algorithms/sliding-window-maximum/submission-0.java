class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<k; i++){
            pq.add(nums[i]);
        }
        ans[0] = pq.peek();
        for(int i = 1; i<= n-k; i++){
            pq.add(nums[i+k-1]);
            pq.remove(nums[i-1]);
            ans[i] = pq.peek();
        }
        return ans;
    }
}
