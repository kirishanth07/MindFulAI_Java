class FactorialExample{  
 public static void main(String args[]){  
  int i,fact=1;  
  int number=3;   
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  


//fact=1,number=3
//i=1 then i post increment happens until the iteration
//fact=1*1=1
//fact=1*2=2
//fact=2*3=6
//The factorial of 3 is 6