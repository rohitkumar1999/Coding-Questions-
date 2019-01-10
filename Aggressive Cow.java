package lec1 ;
import java.util.*;
public class Summ {
    public static void main(String args[]) {
     
     Scanner scn = new Scanner(System.in) ; 
     
        
         int n =scn.nextInt(); 
         int m = scn.nextInt();
         int[] arr = new int[n] ;   
         for(int i=0;i<m  ;i++)
         {
             arr[i]=scn.nextInt(); 
         }
        Arrays.sort(arr);          
        int low=arr[0]; 
        int high=arr[n-1] ; 
        int mid=0 ; 
        while(low<=high)
        {
        	mid = (low+high)/2 ;
        	if(ispossible(arr,mid,m))
        	{
        		low=mid+1 ; 
        	}
        	else
        		high=mid-1 ; 
        }
        System.out.println(mid);
    }

	private static boolean ispossible(int[] arr,int mid,int m) {
		int p=arr[0] ; 
		int l=1 ;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]-p>=mid)
				l++ ;
			
		
		if(m==l)
			return true ; 
		}
		return false ; 
	}
		
		
	
}
