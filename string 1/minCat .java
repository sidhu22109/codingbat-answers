public String minCat(String a, String b) {
  int sidhu=a.length();
  int sidhu1=b.length();

  
  
  if(sidhu1>sidhu){
    
    String sidd=b.substring(sidhu1-sidhu,sidhu1);
    
    return a+sidd;
    
    
  }
  
  else if(sidhu>sidhu1){
    
    String ii=a.substring(sidhu-sidhu1,sidhu);
    
    return ii+b;
    
    
  }
  return "";
  
  
}
