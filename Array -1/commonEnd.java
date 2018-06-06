public boolean commonEnd(int[] a, int[] b) {
  int sidhu=a.length;
  
  int sid=b.length;
  
  
  if((sidhu>=1 && sid>=1) && a[0]==b[0]){
    
    return true;
    
  }
  
  else if((sidhu>=1 && sid>=1)&& a[sidhu-1]==b[sid-1]){
   return true; 
  
  }
  
  return false;
  
  
}
