public int countX(String str) {
  if(str.length()==1){
    if(str.equals("x")){
      return 1;
    }
    else{
      return 0;
    }
}
  if(str.equals("")  ){
    return 0;
  }
  String sub7  = str.substring(1);
  int k = countX(sub7);
  if(str.charAt(0)=='x'){
    return k+1;}
  return k;
  
  
}
