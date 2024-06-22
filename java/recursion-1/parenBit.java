public String parenBit(String str) {
  char ch = str.charAt(0);
  int len = str.length();
  char ch2 = str.charAt(len-1);
  
  if(ch == '('&& ch2 == ')'){
    return str;
  }
  if(ch == '('){
    return parenBit(str.substring(0,len-1));
  }
  if(ch2 == ')'){
    return parenBit(str.substring(1));
  }
  return parenBit(str.substring(1, len-1));
}
