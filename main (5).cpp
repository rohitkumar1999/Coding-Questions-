
#include<bits/stdc++.h>
using namespace std;
#define MAX 1000
int maxArea(int M[MAX][MAX],int n,int m);
int main()
{
    int T;
    cin>>T;
int M[MAX][MAX];
    while(T--)
    {
        int n,m;
        cin>>n>>m;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                cin>>M[i][j];
            }
        }
        cout<<maxArea(M,n,m)<<endl;
    }
}


/*This is a function problem.You only need to complete the function given below*/
/*You are required to complete this method*/

int getAreaForARow(int row[], int n)
{
    stack<int> s;
    int max_area= INT_MIN;
    int area_from_top;
    int tp;
    int i =0;
    while(i<n)
    {
        if(s.empty() || row[s.top()]<=row[i])
            s.push(i++);
        else
        {
            tp = s.top();
            s.pop();
            area_from_top = row[tp]*(s.empty() ? i : i-s.top()-1);
            if(area_from_top>max_area)
                max_area = area_from_top;
        }
    }
    while(!s.empty())
    {
        tp = s.top();
        s.pop();
        area_from_top = row[tp]*(s.empty() ? i : i-s.top()-1);
        if(area_from_top>max_area)
            max_area = area_from_top;
    }
    return max_area;
}

int maxArea(int arr[MAX][MAX],int n,int m)
{
    //Your code here
    int row[m];
    int max_area = INT_MIN;
    for(int i =0;i<m;i++)
        row[i] = 0;
    for(int i =0;i<n;i++)
    {
        for(int j =0;j<m;j++)
        {
            if(arr[i][j] == 0)
                row[j] =0;
            else
                row[j]+=1;
            
        }
        
        max_area = max(getAreaForARow(row, m), max_area);
        
        
    }
    return max_area;
}