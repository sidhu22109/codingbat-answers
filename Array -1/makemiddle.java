public int[] makeMiddle(int[] nums) {
  int sidhu=nums.length;
  
  int sid=sidhu/2;
  
  if(sidhu>=4){
    
    return new int[] {nums[sid-1],nums[sid]};
    
    
  }
  
  return new int[] {nums[0],nums[1]};
  
  
  
  
}
