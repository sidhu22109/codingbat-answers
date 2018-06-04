public String withoutX2(String str) {
  String sidhu="";
  
  for(int i=0;i<str.length();i++){
    
    if(i==0 && str.charAt(i) !='x')
    
    sidhu+=str.charAt(i);
    
    else if(i==1 && str.charAt(i) !='x')
    
    sidhu+=str.charAt(i);
    
    else if(i>1)
    
    sidhu+=str.charAt(i);
    
    
    
    
    
    
    
  }
  
  return sidhu;
  
}
