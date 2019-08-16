
package javaapplication1;
import java.util.Scanner ; 

public class JavaApplication1 {
  
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in) ; 
        int n  = scn.nextInt() ;
       System.out.println(factorial(n)) ; 
      System.out.println(pallindrome(n));
        System.out.println(sumofdigit(n));
        System.out.println(sumofprimedigit(n));
       checkprimeinrange(1,50);
        
    }
    
    public static int factorial(int n)
    {   return (n==1||n==0)?1 : n*factorial(n-1) ;  }
    public static boolean pallindrome(int n)
    {
        int num =  n ; 
       int rev  = 0  ;
       int rem  = 0 ; 
       while(n!=0)
       {
           rem = n%10 ; 
           rev = rev*10+rem ; 
           n=n/10 ; 
       }
       
       return rev==num ; 
    }
    public static int sumofdigit(int n )
    {
        if(n==0)
            return  0 ; 
        return ((n%9==0)?9:(n%9)) ; 
    }
    public static boolean checkprimedigit(int n )
    { 
        if(n==2||n==3||n==5||n==7) return true ; 
        return  false ; 
    }   
    public static int sumofprimedigit(int n)
    {   
        int sum=0 ; 
        while(n!=0)
        {
            if(checkprimedigit(n%10))
                sum+=n%10 ; 
            n/=10 ; 
        }
        return sum ; 
    }
    public static boolean checkprime(int n  )
     {   
         if(n<=1)
             return false ; 
         if(n<=3)
             return true ; 
         if(n%2==0||n%3==0)
             return false  ; 
         for(int i=5 ;i<n;i+=2 )
         {    if(n%i==0)
                 return false ; 
         return true ; 
         }
         return false ; 
     }
    public static void checkprimeinrange(int a , int b)
    {
        for(int i=a ; i <=b;i++)
        {
            if(checkprime(i))
                System.out.print(i+" ");
        }
  }
}
