public int countHi(String str) {
  if(str.length() == 0){
    return 0;
  }
  if(str.equals("hi")){
    return 1;
  }
  if(str.length()<3){
    return 0;
  }
  int sub = countHi(str.substring(1));
  if(str.substring(0,2).equals("hi")){
    return sub+1;
  }
  return sub;
  
}

