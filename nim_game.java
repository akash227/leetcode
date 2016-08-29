/*

292. Nim Game

Question: https://leetcode.com/problems/nim-game/

*/



/*

	Easy to understand and optimal solution

*/



public class Solution {
    public boolean canWinNim(int n) {
        if( n % 4 == 0 ){
            return false;
        }
        return true;
    }
}

