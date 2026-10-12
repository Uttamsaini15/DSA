class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word: strs){
            int[] count = new int[26];

            //count frequnecy of each Letter in the string
            for(char c: word.toCharArray()) count[c-'a']++;

            StringBuilder sb = new StringBuilder();
            for(int num: count){
                sb.append(num).append('#');  //# makes the key unambiguous
            }
            String key=sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}