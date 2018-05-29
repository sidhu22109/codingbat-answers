public boolean frontAgain(String str) {
  int sidhu=str.length();
  if(sidhu<=1){

    return false;
  }

  if(sidhu==2){


    return true;
  }
  else if(str.substring(0,2).equals(str.substring(sidhu-2,sidhu))){

  return true;
  }

  return false;





}
