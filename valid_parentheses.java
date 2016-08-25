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
            // Odd length is an indication of imbalance
            return false;
        }

        for(int i = 0;i < len;i++){

            char ch = s.charAt(i);

            if( ch == '(' || ch == '[' || ch == '{'){
                // Opening ones can be pushed
                st.push(ch);
                continue;
            }
            if(ch == ')' || ch == ']' || ch =='}'){
                // If the stack is empty when a closing one is encountered, imbalance!
                if(st.empty()){
                    return false;
                }
            }

            //The below conditions check the balance
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