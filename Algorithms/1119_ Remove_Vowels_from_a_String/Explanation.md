# Remove Vowels from a String
For this problem we are requested to remove the vowels from the input.
## Solution

### Algorithm
1. create a Set (we are building a set because we need a fast lookup for the vowels)
2. add all the vowels to the set
3. create a StringBuilder(better than creating a string because appending a character here takes O(1) instead of O(N))
4. loop through all the characters in the input
    *  check for vowels using the set
    *  if the character is not in the set then add it to the StringBuilder we created earlier
    
5. build a String from the StringBuilder

``` Java
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
```
## Complexity Analysis
### TimeComplexity
1. As you can see above we are looping only one time at the input **O(N)**
   * Set lookup takes constant time **O(1)**
   * Adding Character to StringBuilder takes constant time  **O(1)**
2. calling the toString method takes **O(N)**
**In total we have O(N + N) = O(2N) = O(N)**


### SpaceComplexity
1. Stringbuilder in worst case will contain all the String **O(N)**
2. since we are only adding vowels (5 characters in total) then the splace complexity of the set is **O(1)**
3. toString Method will create a new String **O(N)**
**In total we have O(N + N) = O(2N) = O(N)**

