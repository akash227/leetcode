/*

283. Move Zeroes

Question: https://leetcode.com/problems/move-zeroes/

*/



/*
	Optimal Solution
*/

void moveZeroes(int* nums, int numsSize) {
    int i, numZeroes = 0;
    for(i = 0; i < numsSize; i++){
        if( nums[i] == 0 ){
            numZeroes++;
        }else{
            nums[i - numZeroes] = nums[i];
        }
    }
    while(numZeroes > 0){
        nums[numsSize - numZeroes] = 0;
        numZeroes--;
    }
}