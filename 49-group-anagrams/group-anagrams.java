class Solution {
    public List<List<String>> groupAnagrams(String[] words) {
        HashMap<String,List<String>> res=new HashMap<>();
        for(String word:words){
            int[]charArr=new int[26];
            for(int i=0;i<word.length();i++){
                charArr[word.charAt(i)-'a']++;
            }
            var key= Arrays.toString(charArr);
            res.putIfAbsent(key,new ArrayList<>());
            res.get(key).add(word);
    }
    return new ArrayList<>(res.values());
    }
}