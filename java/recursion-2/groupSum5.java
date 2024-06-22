public boolean groupSum5(int start, int[] nums, int target) {
  int len = nums.length;
  if(target == 0 && start>= len){
    return true;
  }
  if(start >= len){
    return false;
  }
  if(nums[start] % 5 != 0){
    if(groupSum5(start+1, nums, target) == true){
      return true;
    }
    else{
      return groupSum5(start+1, nums, target-nums[start]);
    }
  }
  else{
    if(start != len-1 && nums[start+1] == 1){
      return groupSum5(start+2, nums, target-nums[start]);
    }
    else{
      return groupSum5(start+1, nums, target-nums[start]);
    }
  }

}
