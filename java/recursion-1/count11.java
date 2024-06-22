public int count11(String str) {
  if(str.length()<2){
    return 0;
  }
  String left;
	left = str.substring(0, 2);
	if(left.equals("11")){
		return 1 + count11(str.substring(2));
	}
	return count11(str.substring(1));

}
