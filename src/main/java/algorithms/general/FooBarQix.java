package algorithms.general;

public class FooBarQix {

    public String compute(String txt) {
        StringBuilder result = new StringBuilder();
        int numerical = Integer.parseInt(txt);
        if (numerical % 3 == 0) {
            result.append("Foo");
        }
        if (numerical % 5 == 0) {
            result.append("Bar");
        }
        if (numerical % 7 == 0) {
            result.append("Qix");
        }
        for (int i = 0; i < txt.length(); i++) {
            int numeric = Character.getNumericValue(txt.charAt(i));
            if (numeric == 3) {
                result.append("Foo");
            }
            if (numeric == 5) {
                result.append("Bar");
            }
            if (numeric == 7) {
                result.append("Qix");
            }
        }
        return result.toString().isEmpty() ? txt : result.toString();
    }
}
