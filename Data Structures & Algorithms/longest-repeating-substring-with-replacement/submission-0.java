class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxlen = 0, maxfreq = 0;
        int l = 0;
        for(int r = l; r < s.length(); r ++){
            char ch = s.charAt(r);
            freq[ch - 'A'] ++;
            maxfreq = Math.max(maxfreq, freq[ch-'A']);
            if((r-l+1)-maxfreq <= k){
                maxlen = Math.max(maxlen, r-l+1);
            }else{
                freq[s.charAt(l)-'A'] --;
                l++;
            }
        }
        return maxlen;
    }
}
