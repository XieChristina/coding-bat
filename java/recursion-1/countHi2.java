public int countHi2(String str) {
if(str.length()<3){
  if(str.equals("hi")){
    return 1;
  }
  return 0;
}
  
  if(str.charAt(0) == 'x'){
		if(str.substring(1, 3).equals("hi")){
			return countHi2(str.substring(3));
		}
		return countHi2(str.substring(1));
	}
	if(str.substring(0, 2).equals("hi")){
		return 1 + countHi2(str.substring(2));
	}
	if(str.substring(1, 3).equals("hi")){
		return 1 + countHi2(str.substring(3));
	}
	return countHi2(str.substring(2));
  
  
}
