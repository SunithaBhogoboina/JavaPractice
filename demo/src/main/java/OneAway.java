public class OneAway {

    public boolean isOneAway(String s, String b) {

        if(s.length() == b.length()) {
            return oneEditReplace(s, b);
        } else if(s.length() + 1 == b.length()) {
            return oneEditInsert(s, b);
        } else if(s.length() - 1 == b.length()) {
            return oneEditInsert(b, s);
        }

        return false;
    }

    boolean oneEditInsert(String s, String b) {
        int index1 = 0;
        int index2 = 0;
        while(index1 < s.length() && index2 < b.length()) {
            if(s.charAt(index1) != b.charAt(index2)) {
                if(index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    boolean oneEditReplace(String s, String b) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        if(count > 1)
            return false;

        return true;
    }
}
