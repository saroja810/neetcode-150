class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            String s = str.length()+"#"+str;
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i=0;
        while(i < str.length()){
            int num = 0;
            while(str.charAt(i) != '#'){
                num = num * 10 + (str.charAt(i)-'0');
                i++;
            }
            i++;
            StringBuilder sb = new StringBuilder();
            while(num > 0){
                sb.append(str.charAt(i));
                i++; num--;
            }
            list.add(sb.toString());
        }
        return list;
    }
}
