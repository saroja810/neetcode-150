class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;
        int[] freq = new int[26];
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
        }
        int freq1[] = new int[26];
        int l=0, count = 0;
        for(int r = 0; r < s1.length(); r++){
            freq1[s2.charAt(r) - 'a'] ++;
        }
        for(int i=0; i<26; i++){
            if(freq[i] == freq1[i]){
                count++;
            }
        }
        if(count == 26){
            return true;
        }
        for(int r=s1.length(); r < s2.length(); r++){
            count = 0;
            freq1[s2.charAt(l) - 'a'] --;
            l++;
            freq1[s2.charAt(r) - 'a'] ++;
            for(int i=0; i<26; i++){
                if(freq[i] == freq1[i]){
                    count++;
                }
            }
            if(count == 26){
                return true;
            }
        }
        return false;
    }
}
