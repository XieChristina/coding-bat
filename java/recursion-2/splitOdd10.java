public boolean splitOdd10(int[] nums) {
  if(nums.length == 0){return false;}
  if(nums.length<2){return true;}
  return groupSum(0,nums, 0, 0);
}
public boolean groupSum(int start, int[] n, int a, int b) {
    if(start>=n.length){
      return a%10 == 0 && b%2 == 1;
    }
    if(groupSum(start+1, n, a+n[start], b)){
      return true;
    }
     if(groupSum(start+1, n, a, b+n[start])){
      return true;
    }
    
   return false;
}
