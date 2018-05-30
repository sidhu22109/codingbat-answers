public String extraFront(String str) {
  int sidhu=str.length();
  
  if(sidhu>=2){
    
   String sid=str.substring(0,2);
   
   
   return sid+sid+sid;
    
  }
  
  else if(sidhu==1){
    
    return str+str+str;
  }
  
  return "";
  
  
}
