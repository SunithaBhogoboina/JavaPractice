import java.util.Arrays;

public class StringCompression {

    public String getStringCompression(String s) {
     StringBuilder sb = new StringBuilder();
     int count = 1;
     for(int i=0; i<s.length(); i++) {
         if(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)) {
             count++;
         } else {
             sb = sb.append(s.charAt(i)).append(count);
             count = 1;
         }
     }
     if(sb.length() > s.length())
         return s;

     return sb.toString();
    }
}
