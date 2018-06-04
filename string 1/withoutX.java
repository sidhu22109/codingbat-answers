public String withoutX(String str) {
int sidhu=str.length();


if(sidhu<=1){
 return ""; 
}





 else if(str.substring(0,1).equals("x") && str.substring(sidhu-1,sidhu).equals("x")){
  
  return str.substring(1,sidhu-1);
  
  
}

else if(str.substring(0,1).equals("x")){
  
  return str.substring(1,sidhu);
  
}

else if(str.substring(sidhu-1,sidhu).equals("x")){
  
  return str.substring(0,sidhu-1);
  
}

return str;


  
  
  
}
