public boolean double23(int[] nums) {
int sidhu=nums.length;

if(sidhu<=1)
{
 return false; 
  
}


else if(nums[0]==2 && nums[1]==2){
 return true; 
  
}


else if(nums[0]==3 && nums[1]==3){
  
 
 return true;
  
}

return false;




}
