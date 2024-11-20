public class grpAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String str: strs) {
            int[] hash = new int[26];
            //generate hashmap
            for(char ch : str.toCharArray())
                hash[ch - 'a']++;
            //generate hashcode
            StringBuilder sb = new StringBuilder("");
            for(int i=0;i<26;i++) {
                sb.append("#");
                sb.append(hash[i]);
            }
            String key = sb.toString();
            //if the value contains hashcode add or create 'n add
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
