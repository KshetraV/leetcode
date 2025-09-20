class Solution {
    public List<List<String>> groupAnagrams(String[] words) {
        HashMap<String,List<String>> hs=new HashMap<>();
        for(String word:words){
            int[]count=new int[26];
            for(int i=0;i<word.length();i++){
                count[word.charAt(i)-'a']++;
            }
            String key=Arrays.toString(count);
            hs.computeIfAbsent(key,val->new ArrayList<>()).add(word);
        }
        return new ArrayList<>(hs.values());
    }
}