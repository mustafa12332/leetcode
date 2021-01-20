class Solution {
    public int minFlips(String target) {
        int counter = 0;
        char prevChar = '0';
        for(int i =0;i<target.length();i++)
        {
            char ch = target.charAt(i);
            if(ch != prevChar){
                counter++;
                prevChar = ch;
            }

        }
        return counter;
    }
}