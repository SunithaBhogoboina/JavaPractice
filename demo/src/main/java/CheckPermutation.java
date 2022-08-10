import java.util.*;
public class CheckPermutation {

    public boolean checkPermutation(String s1, String s2) {
        /*if(s1.length() != s2.length())
            return false;

        //System.out.println(s1.charAt(0)-'b');
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<s1.length(); i++) {
            sum1 += s1.charAt(i) - 'a';
        }

        for(int j=0; j<s2.length(); j++) {
            sum2 += s1.charAt(j) - 'a';
        }

        if(sum1 != sum2)
            return false;

        return true;*/

        if(s1.length() != s2.length())
            return false;

        int[] letters = new int[128];
        char[] chars = s1.toCharArray();
        for(char c: chars) {
            letters[c]++;
        }

        for(int j=0; j<s2.length(); j++) {
            //System.out.println((int)s2.charAt(j));
            int c = (int)s2.charAt(j);
            letters[c]--;
            if(letters[c] < 0) {
                return false;
            }
        }

//        for(int i=0; i<letters.length; i++)
//            System.out.print(letters[i]);

        return true;
    }

}
