import java.util.HashSet;
import java.util.Set;



public class Solution {
    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();

        Set<Character> vowelSet = new HashSet<Character>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        for(int i =0; i<s.length();i++){
            if(!vowelSet.contains(s.charAt(i)))
            {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.removeVowels("leetcodeisacommunityforcoders"));
    }
}