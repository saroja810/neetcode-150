class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0, n = heights.length;
        Stack<Integer> st  = new Stack<>();
        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while (!st.isEmpty() && currHeight < heights[st.peek()]) {
                int height = heights[st.pop()];
                int left = st.isEmpty() ? -1 : st.peek();
                int area = height * (i - left - 1);
                maxArea = Math.max(maxArea, area);
            }

            st.push(i);
        }
        return maxArea;
    }
}