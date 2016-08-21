class Solution {
    func twoSum(nums: [Int], _ target: Int) -> [Int] {
        let len:Int = nums.count - 1
        for i in 0...len {
            for j in i+1...len {
                if nums[i] + nums[j] == target {
                    let arr:[Int] = [i,j]
                    return arr
                    
                }
            }
        }
        return [0]
    }
    
}