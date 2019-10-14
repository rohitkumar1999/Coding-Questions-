#include <iostream>
using namespace std;

int main() {
	//code
	int t;
	cin >> t;
	while(t--){
	    string s;
	    cin >> s;
	    int i=0,j=s.length()-1;
	    while(i<=j){
	        if(s[i++]!=s[j--])
	        break;
	    }
	    if(i<j)
	    cout<<"Yes"<<endl;
	    else
	    cout<<"No"<<endl;
	}
	return 0;
}
	