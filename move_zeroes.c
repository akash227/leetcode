/*

283. Move Zeroes

Question: https://leetcode.com/problems/move-zeroes/

*/

/*
	Easy to understand solution
*/

void moveZeroes(int* nums, int numsSize) {
    int i,j;
    
    for(i = 0; i < numsSize; i++){
        
        if( nums[i] == 0 ){
            
            for(j = i+1; j < numsSize; j++){
                
                if(nums[j] != 0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                    break;
                }

            }

        }

    }
}



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