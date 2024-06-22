public int countAbc(String str) {
  if(str.length()<3){
    return 0;
  }

String left;
	left = str.substring(0, 3);
	if(left.equals("abc")){
		return 1 + countAbc(str.substring(3));
	}
	if(left.equals("aba")){
		return 1 + countAbc(str.substring(2));
	}
	return countAbc(str.substring(1));
}
