package ivan.samoylov;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String example = new String("abcd");
        System.out.println("for string - " + example + ":");
        System.out.println(permutation(example));
    }

    public static ArrayList<String> permutation(String s) {
        ArrayList<String> res = new ArrayList<String>();
        if (s.length() == 1) {
            res.add(s);
        } else if (s.length() > 1) {
            int lastIndex = s.length() - 1;
            String last = s.substring(lastIndex);
            String rest = s.substring(0, lastIndex);
            res = merge(permutation(rest), last);
        }
        return res;
    }

    public static ArrayList<String> merge(ArrayList<String> list, String c) {
        ArrayList<String> res = new ArrayList<>();
        for (String s : list) {
            for (int i = 0; i <= s.length(); ++i) {
                String ps = new StringBuffer(s).insert(i, c).toString();
                res.add(ps);
            }
        }
        return res;
    }


}


