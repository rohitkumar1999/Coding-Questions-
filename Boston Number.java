package Condingblockscodes;

import java.util.Scanner;

public class bostonnumber {
	
	public static int primeFactors(long n) 
    {   int sum= 0 ;
        while (n%2==0) 
        { 
            sum+=2; 
            n /= 2; 
        } 
  
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            while (n%i == 0) 
            { 
            	sum+=i;
            	n /= i; 
            } 
        } 
   
        if (n > 2) 
            sum+=n ;  
        
        return sum ;
    } 

	public static void main(String[] args) {
       Scanner scn = new Scanner(System.in) ; 
       long N= scn.nextLong();

       
       int sod=0;
       long temp=N ;
       while(temp!=0)
       {
           sod+=temp%10;
           temp/=10;
       }
       for(int i=2;i*i<=N;i++)
           if(N%i==0)
           {
               int count=0;
               while(N%i==0)
               {
                   N/=i;
                   count++;
               }
               int sum=0;
                temp=i;
               while(temp!=0)
               {
                   sum+=temp%10;
                   temp/=10;
               }
               sod-=sum*count;
           }
       if(N!=1)
       {
           int sum=0;
               temp=N;
               while(temp!=0)
               {
                   sum+=temp%10;
                   temp/=10;
               }
           sod-=sum;
       }
       if(sod==0)
       System.out.println("1");
       else 
    	   System.out.println("0");
       }
	}


