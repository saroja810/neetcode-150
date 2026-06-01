class TimeMap {

    HashMap<String, ArrayList<Pair>> hm;

    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key)){
            hm.put(key, new ArrayList<>());
        }
        hm.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if(!hm.containsKey(key)){
            return "";
        }
        ArrayList<Pair> list = hm.get(key);
        int low = 0, high = list.size()-1;
        String ans = "";

        while(low <= high){
            int mid = low + (high - low)/2;
            if(list.get(mid).timestamp <= timestamp){
                ans = list.get(mid).value;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
}

class Pair{
    int timestamp; 
    String value;
    Pair(int timestamp, String value){
        this.timestamp = timestamp;
        this.value = value;
    }
}
