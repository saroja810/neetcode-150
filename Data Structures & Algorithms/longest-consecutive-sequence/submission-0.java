class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int max = 0;
        for(int x: nums){
            hs.add(x);
        }
        for(int curr : hs){
            if(!hs.contains(curr - 1)){
                int length = 1;
                while(hs.contains(curr + length)){
                    length ++;
                }
                max = Math.max(length, max);
            }
        }
        return max;
    }
}
