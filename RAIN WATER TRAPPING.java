package lec1 ;
import java.util.*;
public class Summ {
    public static void main(String args[]) {
      Scanner scn= new Scanner(System.in);
       int t =scn.nextInt(); 
       while(t>0)
       {
           int n=scn.nextInt() ; 
           int[] arr = new int[n] ; 
           int leftmax=0 ; 
           int rightmax=0 ; 
           int var1=0 ; 
           int sum=0 ;
           for(int i=0;i<n;i++)
           {
               arr[i]=scn.nextInt();
           }
           
           for(int i=0;i<n;i++)
           {   
              for(int j=i+1;j<n;j++)
              {
                  if(arr[j]>rightmax)
                  rightmax=arr[j]; 
              }
              for(int k=0;k<i;k++)
              {
                  if(arr[k]>leftmax)
                  leftmax=arr[k]; 
              }
              if(leftmax>=rightmax)
              var1=rightmax ; 
              else 
              var1=leftmax ; 
              if(leftmax!=0&&rightmax!=0&&var1>=arr[i])
               { sum=sum+ (var1-arr[i]) ;

               }
              leftmax=0 ; 
              rightmax=0 ; 
           }
           System.out.println(sum); 
           t--; 
           leftmax=0 ; 
           rightmax=0 ; 
           sum=0 ; 
           var1=0 ; 
       }
    }
}
