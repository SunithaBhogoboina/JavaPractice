public class URLify {

    public String urlify(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
        }

        int index = s.length() + count * 2;
        char[] chars = new char[index];
        for(int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                chars[index-1] = '0';
                chars[index-2] = '2';
                chars[index-3] = '%';
                index = index - 3;
            } else {
                chars[index-1] = s.charAt(i);
                index = index-1;
            }
        }
        return new String(chars);
    }
}
