/*

202. Happy Number

Question:

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

