public boolean groupSum6(int start, int[] nums, int target) {
  int len = nums.length;
  if(target == 0 && start>= len){
    return true;
  }
  if(start >= len){
    return false;
  }
  if(nums[start] != 6){
    if(groupSum6(start+1, nums, target) == true){
      return true;
    }
    else{
      return groupSum6(start+1, nums, target-nums[start]);
    }
  }
   return groupSum6(start+1, nums, target-nums[start]);
}
