// CPP program to count 
// subarrays having sum 
// less than k. 
#include <bits/stdc++.h> 
using namespace std; 

// Function to find number 
// of subarrays having sum 
// less than k. 
int countSubarrays(int arr[], 
				int n, int k) 
{ 
	int start = 0, end = 0, 
		count = 0, sum = arr[0]; 

	while (start < n && end < n) { 

		// If sum is less than k, 
		// move end by one position. 
		// Update count and sum 
		// accordingly. 
		if (sum < k) { 
			end++; 

			if (end >= start) 
				count += end - start; 

			// For last element, 
			// end may become n 
			if (end < n) 
				sum += arr[end]; 
		} 

		// If sum is greater than or 
		// equal to k, subtract 
		// arr[start] from sum and 
		// decrease sliding window by 
		// moving start by one position 
		else { 
			sum -= arr[start]; 
			start++; 
		} 
	} 

	return count; 
} 

int main() 
{   
    int n; 
	long long int k ;  
	cin>>n>>k ; 
	int i =0 ;
	int arr[100000];
	while(n--)
	{
	    int a,b ; 
	    cin>>a>>b ;
	    arr[i]=b;
	    i++ ; 
	     
	}
 sort(arr,arr+n);
	cout << countSubarrays(arr, n, k); 
} 
