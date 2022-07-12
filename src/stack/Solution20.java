package stack;

import java.util.Stack;

public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> strings = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                strings.push(s.charAt(i));
            }else {
                if (strings.empty()){
                    return false;
                }
                if (s.charAt(i) == ')'){
                    Character pop = strings.pop();
                    if (pop != '('){
                        return false;
                    }
                }
                if (s.charAt(i) == ']'){
                    Character pop = strings.pop();
                    if (pop != '['){
                        return false;
                    }
                }
                if (s.charAt(i) == '}'){
                    Character pop = strings.pop();
                    if (pop != '{'){
                        return false;
                    }
                }

            }
        }
        if (strings.empty()){
            return true;
        }else {
            return false;
        }
    }
}
