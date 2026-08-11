class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        if(n<3) return "";
        int level = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (level > 0) result.append(ch);
                level++; 
            } 
            else if (ch == ')') {
                level--;
                if (level > 0) result.append(ch);
            }
        }
        return result.toString();
    }
}