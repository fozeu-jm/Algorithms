package algorithms.general;

/**
 * Simple compression algorithm that should compress
 * WWWBBWB to 3S2B1C
 */
public class RunLengthEncoding {
    private String txt = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW";

    public void execute(){
        StringBuilder result = new StringBuilder();
        StringBuilder buffer = new StringBuilder("");
        for (int i = 0; i < txt.length(); i++) {
            if ("".equals(buffer.toString())) {
                buffer.append(txt.charAt(i));
            } else {
                if (txt.charAt(i) == buffer.charAt(buffer.length() - 1)) {
                    buffer.append(txt.charAt(i));
                } else {
                    result.append(buffer.length())
                            .append(buffer.charAt(0));
                    //empty buffer
                    buffer.setLength(0);
                    buffer.append(txt.charAt(i));
                }
            }
        }
        result.append(buffer.length()).append(buffer.charAt(0));
        System.out.println(result.toString());
    }
}
