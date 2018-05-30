public String without2(String str) {
  int sidhu=str.length();
  
  if(sidhu==2){
    
    return "";
  }
  
  else if(sidhu==1){
    return str;
    
  }
  
  
  
  
  else if(sidhu>2 && str.substring(0,2).equals(str.substring(sidhu-2,sidhu))){
    
    return str.substring(2,sidhu);
    
  }
  
  return str;
  
  
  
  
  
  
  
}
