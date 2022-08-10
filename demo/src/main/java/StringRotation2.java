public class StringRotation2 {

    public String getLeftRotation(String s, int num) {
        //find number of times to rotate
        int count = s.length() < num ? num % s.length() : num;

        if(count != s.length()) {
            s = s.substring(count,  s.length()) + s.substring(0, count);
        }
        return s;
    }

    public String getRightRotation(String s, int num) {
        //find number of times to rotate
        int count = s.length() < num ? num % s.length() : num;

        if(count != s.length()) {
            s = s.substring(s.length()-count, s.length()) + s.substring(0, s.length()-count);
        }
        return s;
    }

}
