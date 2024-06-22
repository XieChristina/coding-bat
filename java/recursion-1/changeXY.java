public String changeXY(String str) {

  if(str.equals("")){
    return ("");
  }
  if(str.equals("x")){
    return ("y");
  }
  String sub = str.substring(1);
  String v = changeXY(sub);
  if(str.charAt(0)=='x'){
    return 'y'+v;
  }
  return str.charAt(0)+ v;
  
}


