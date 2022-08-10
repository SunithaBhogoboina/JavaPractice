public class StringRotation {

    public boolean isStringRotation(String s1, String s2) {
        //s2 always in s1s1
        return (s1.length() == s2.length()) && (s1+s1).contains(s2);
    }
}
