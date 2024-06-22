public boolean groupNoAdj(int start, int[] nums, int target) {
  int len = nums.length;
  if(target == 0 && start>= len){
    return true;
  }
  if(start >= len){
    return false;
  }
  if(groupNoAdj(start+1, nums, target) == true){
      return true;
  }
  else{
    return groupNoAdj(start+2, nums, target-nums[start]);
  }
 
}

  

 

