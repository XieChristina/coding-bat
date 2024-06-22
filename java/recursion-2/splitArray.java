public boolean splitArray(int[] nums) {
  if(nums.length == 0){return true;}
  if(nums.length<2){return false;}
  return groupSum(0,nums,target(nums), 0, 0);
}
public int target(int[] n){
  int sum = 0;
  for(int i=0;i<n.length;i++){
    sum = sum+n[i];
  }
  sum = sum/2;
  return sum;
}
public boolean groupSum(int start, int[] n, int target, int a, int b) {
    if(target == 0){
      return true;
    }
    if(start>=n.length){
      return a==b;
    }
    if(groupSum(start+1, n, target, a+n[start], b) == true){
      return true;
    }
     if(groupSum(start+1, n, target, a, b+n[start]) == true){
      return true;
    }
    
   return false;
}

