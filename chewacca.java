
package assignment;

import java.util.Scanner;

public class chewbacca {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in); 
		
		long num=scn.nextLong(); 
		long num1=0,rem=0,ans=0,t=0,c=0,f=1,num2=num,s=0,v=0 ; 
		while(num2!=0)
		{
			num2=num2/10 ;
			s++ ; 
			
		}
		 while(num!=0)
		 {
			 rem=num%10 ; 
			 if(rem>=5)
			 {
				 rem=9-rem; 
			 }
			 if(rem==0&&f==1&&v!=s-1)
			 {
			     c++ ; 
			 }
			 if(v==s-1&&rem==0)
			 {
				 rem=num%10 ; 
			 }
			 if(rem!=0)
			 {f=0; }
			 num1=num1*10+rem ; 
			 num=num/10 ; 
			 v++; 
			 
		 }
		 while(num1!=0)
		 {
			 rem=num1%10 ;
			 if(t==1||rem!=0)
			 {ans=ans*10+rem ;t=1; } 
			 num1=num1/10 ; 
		 }
		 System.out.println(ans*(int)Math.pow(10,c));

	}

}



