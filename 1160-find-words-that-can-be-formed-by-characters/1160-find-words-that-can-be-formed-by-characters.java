class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        for(Character c: chars.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        for(String s: words){
            boolean good = true;
            Map<Character, Integer> map2 = new HashMap<>();
            for(Character c: s.toCharArray())
                map2.put(c, map2.getOrDefault(c, 0)+1);
            for(Character c: s.toCharArray()){
                if(map.getOrDefault(c, 0) < map2.get(c)){
                    good = false;
                    break;
                }
            }
            res += good == true ? s.length() : 0;
        }
        return res;
    }
}