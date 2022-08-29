package algorithms.leetcode;

public class AddBinary {
    public String addBinary(String a, String b) {
        int diff = 0;
        if (a.length() < b.length()) {
            diff = b.length() - a.length();
            for (int i = 0; i < diff; i++) {
                a = "0".concat(a);
            }
        } else if (a.length() > b.length()) {
            diff = a.length() - b.length();
            for (int i = 0; i < diff; i++) {
                b = "0".concat(b);
            }
        }

        int k = 0;
        String res = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            int left = Character.getNumericValue(a.charAt(i));
            int right = Character.getNumericValue(b.charAt(i));
            if ((left + right + k) >= 2) {
                String add = (left + right + k) == 2 ? "0" : "1";
                res = add.concat(res);
                k = 1;
            } else {
                res = String.valueOf(left + right + k).concat(res);
                k = 0;
            }
        }

        if (k == 0) return res;

        return String.valueOf(k).concat(res);

    }
}
