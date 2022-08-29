package algorithms.general;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParantheses {

    public boolean isBalancedParantheses(String txt) {
        //should return true since parantheses are balanced
        Deque<Character> deque = new ArrayDeque<>();
        String openers = "{([";

        if (txt.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < txt.length(); i++) {
            //add to deque if opening parantheses
            if (openers.indexOf(txt.charAt(i)) != -1) {
                deque.push(txt.charAt(i));
            } else {
                if (deque.isEmpty()) {
                    deque.push(txt.charAt(i));
                } else {
                    char check = deque.pop();
                    switch (txt.charAt(i)) {
                        case ')':
                            if (check != '(') {
                                return false;
                            }
                            break;
                        case '}':
                            if (check != '{') {
                                return false;
                            }
                            break;
                        case ']':
                            if (check != '[') {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
        }
        return deque.isEmpty();
    }
}
