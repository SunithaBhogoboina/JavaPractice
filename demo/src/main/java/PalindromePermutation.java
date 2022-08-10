import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PalindromePermutation {

    public boolean isPalindromePermutation(String s) {
        //count of each character
        //check if all characters have same length or same length with 1 odd number of character count
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<chars.length; i++) {
            if(map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i])+1);
            } else {
                map.put(chars[i], 1);
            }
        }

        int count = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
            if(entry.getKey() != ' ' && entry.getValue()%2 != 0)
                count++;
        }
        System.out.println(count);

        if(count>1)
            return false;

        return true;
    }
}
