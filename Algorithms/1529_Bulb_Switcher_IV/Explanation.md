# Bulb Switcher IV
For this problem we are requested to return the minimum number of flips required to form target.
## Solution

### Algorithm
1. Store '0' as previousChecked character since we are starting with zeros string
2. loop through target and count how many times we flipped from **zero** to **one** or from **one** to **zero**


``` Java
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
```
## Complexity Analysis
### TimeComplexity
1. Looping through target string takes O(N) time complexity


### SpaceComplexity
1. we are only storing in 2 variables which takes constant space complexity O(1)
