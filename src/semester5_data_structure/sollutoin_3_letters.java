package semester5_data_structure;

import java.util.Stack;

class sollutoin_3_letters {
    public String removeThree(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // does the top group have the same letter?
            if (!stack.isEmpty() && stack.peek().charAt(0) == c) {
                String group = stack.pop() + c;   // make the group bigger
                if (group.length() < 3) {
                    stack.push(group);            // less than 3: keep it
                }
                // length 3: we don't push, so the group disappears
            } else {
                stack.push("" + c);               // new letter: start a new group
            }
        }

        String result = "";
        for (String group : stack) {
            result = result + group;
        }
        return result;
    }
}