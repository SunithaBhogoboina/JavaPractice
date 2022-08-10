import java.util.Arrays;

public class PermutationInString {

    public boolean isInclusion(String s1, String s2) {

       //sliding window
        int[] s1map = new int[26];
        int[] s2map = new int[26];

        for(int i=0; i<s1.length(); i++) {
            s1map[s1.charAt(i)-'a']++;
        }
        int start = 0;
        for(int j=0; j<s2.length(); j++) {
            s2map[s2.charAt(j)-'a']++;

            if(j >= s1.length()) {
                s2map[s2.charAt(start)-'a']--;
                start++;
            }

            if(Arrays.equals(s1map, s2map))
                return true;
        }
        return false;
    }
}
