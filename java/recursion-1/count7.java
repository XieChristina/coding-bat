public int count7(int n) {
  if(n<10){
    if(n == 7){
      return 1;
    }
    else{
      return 0;
    }
  }
  
  int left = count7(n/10);
  if(n%10 == 7){
    return left+1;
  }
  return left;
}
