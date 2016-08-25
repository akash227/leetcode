/*
    3. Valid Parentheses
    Question: https://leetcode.com/problems/valid-parentheses/
*/

/*
    Easy and optimal
*/

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        int len = s.length();
        if(len % 2 != 0){
            return false;
        }
        for(int i = 0;i < len;i++){
            char ch = s.charAt(i);
            if( ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
                continue;
            }
            if(ch == ')' || ch == ']' || ch =='}'){
                if(st.empty()){
                    return false;
                }
            }
            char popped = st.pop();
            if(ch == ')'){
                if(popped != '('){
                    return false;
                }
            }
            if(ch == '}'){
                if(popped != '{'){
                    return false;
                }
            }
            if(ch == ']'){
                if(popped != '['){
                    return false;
                }
            }
        }
        if(st.empty()){
            return true;
        }
        return false;
    }
}