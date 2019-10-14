
#include <iostream>

using namespace std;

bool isReversible(string str) 
{ 
     int i = 0, j = str.length()-1; 
  
     // iterate from left and right 
     while (i < j) 
     { 
        if (str[i] != str[j]) 
            return false; 
        i++; 
        j--; 
     } 
     return true; 
} 

int main()
{
   int t  ; 
   cin>>t ; 
   char str[100000] ; 
   while(t--)
   {
      cin>>str  ; 
      if(isReversible(str)==true)
      cout<<"Yes" ; 
      else 
      cout<<"No" ; 
   }

    return 0;
}
