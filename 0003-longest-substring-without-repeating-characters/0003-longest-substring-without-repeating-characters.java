class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashSet<Character> set=new HashSet<>();
    int low=0;
    int high=0;
    int result=0;
    while(high<s.length()){
        if(!set.contains(s.charAt(high))){
            set.add(s.charAt(high));
            result=Math.max(result,high-low+1);
            high++;
        }
        else{
            set.remove(s.charAt(low));
            low++;
        }
    }return result; 
    }
}