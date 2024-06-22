public int sumDigits(int n) {
  if(n<10) return n;
  int left = sumDigits(n/10);
  int right = n%10;
  return left+right;
  
}
  
