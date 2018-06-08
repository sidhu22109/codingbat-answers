public int[] biggerTwo(int[] a, int[] b) {
  
  
  if(a[0]+a[1] > b[0]+b[1]){
    
   return new int[] {a[0],a[1]}; 
  }
  
else if( a[0]+a[1] <b[0]+b[1]){
  
 return new int[] {b[0],b[1]}; 
}

return new int[] {a[0],a[1]};
  
  
  
  
  
}
