class sumdigits {
 
    static int getSum(int n)
    {    
        int sum = 0;
         
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
     
    return sum;
    }
 
    public static void main(String[] args)
    {
        int n = 529;
 
        System.out.println(getSum(n));
    }
}

//n=529,sum=0
//while condition n!=0;it happens until the n becomes 0
//sum=0+529%10=0+9=9 : n=529/10=52
//sum=9+52%10=9+2=11 : n=52/10=5
//sum=11+5%10=11+5=16 : n=5/10=0