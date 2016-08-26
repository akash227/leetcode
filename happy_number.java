/*

202. Happy Number

Question: https://leetcode.com/problems/happy-number/

Hint: We have to detect for a cycle and terminate if one occurs

*/

/*

Easy to understand solution

*/

public class Solution {

    static int squareSum(int num){

        int sum = 0;
        while(num > 0){
            sum += (int) Math.pow(num%10,2);
            num /= 10;
        }
        return sum;

    }

    public boolean isHappy(int n) {
        
        HashSet<Integer> st = new HashSet<Integer>();
        int t = squareSum(n);

        if( n == 1){
            return true;
        }

        while(!st.contains(t)){
            if(t == 1){
                return true;
            }
            st.add(t);
            t = squareSum(t);
        }
        return false;

    }

}

/*

Optimal solution

*/


public class Solution {

    static int squareSum(int num){

        int sum = 0;

        while(num > 0){
            int r = num % 10;
            sum += r * r;
            num /= 10;
        }

        return sum;

    }

    public boolean isHappy(int n) {
        
        int slow = n, fast = squareSum(n);
        
        if(n == 1){
            return true;
        }
        
        while(slow != fast){
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
            if(fast == 1){
                return true;
            }
        }
        return slow == 1;

    }

}