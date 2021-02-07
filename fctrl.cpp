#include <bits/stdc++.h>
using namespace std;
//program to print trailing zeroes in the factorial of n

int zFunc(int n){
    cin >> n;
    int sum = 0;
    for(int i = 1; i < 10; i++){
        sum = sum + n / pow(5, i);    
    } 
    cout << sum << endl;
    return 0;
}

int main() {
    int t;
    int n;
    cin >> t;
    while(t--){
         zFunc(n);
    }
	return 0;
}
