class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);

            while (!st.isEmpty() && k > 0 && digit < st.peek()) {
                st.pop();
                k--;
            }

            st.push(digit);
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();

        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        result.reverse();

        int index = 0;

        while (index < result.length() && result.charAt(index) == '0') {
            index++;
        }

        if (index == result.length()) return "0";

        return result.substring(index);
    }
}