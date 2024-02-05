import java.util.List;
import java.util.ArrayList;

public class Solution {

    // A helper method that adds parentheses to a list of strings
    private void addParenthesis(List<String> list, String s, int left, int right) {
        // If there are no more parentheses left to add, add the string to the list
        if (left == 0 && right == 0) {
            list.add(s);
            return;
        }
        // If there are more left parentheses than right, we can add a right parenthesis
        if (left < right) {
            addParenthesis(list, s + ")", left, right - 1);
        }
        // If there are more left parentheses available, we can add a left parenthesis
        if (left > 0) {
            addParenthesis(list, s + "(", left - 1, right);
        }
    }

    // The main method that generates all combinations of well-formed parentheses
    public List<String> generateParenthesis(int n) {
        // Initialize an empty list of strings
        List<String> list = new ArrayList<>();
        // Call the helper method with an empty string and n pairs of parentheses
        addParenthesis(list, "", n, n);
        // Return the list of strings
        return list;
    }
}
