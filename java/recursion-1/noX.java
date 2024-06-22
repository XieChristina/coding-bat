public String noX(String str) {
  if(str.equals("x")){
    return ("");
  }
   if(str.equals("")){
    return ("");
  }    

  if(str.charAt(0) =='x'){
    return noX(str.substring(1));
  }
  return str.charAt(0)+ noX(str.substring(1));
  
}

          
  
