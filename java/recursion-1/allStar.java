public String allStar(String str) {
  if(str.length()<2){
    return str;
  }
  String x = allStar(str.substring(1));
  return(str.charAt(0)+"*"+x);
 
}
