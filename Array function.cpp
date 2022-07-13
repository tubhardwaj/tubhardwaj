#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int arrfun(int i){
    int size,n;
	cin>>size;
	int arr[size];

	for (int i =0;i<size;i++){
		cin>>arr[i];
	}
	cout<<"the elements are "<<endl;
	for (int i =0;i<size;i++){
		cout<<arr[i]<<endl;
	}
	cout<<"type the index you want"<<endl;
	cin>>n;
	cout<<"the number is: "<<endl;
	cout<<arr[n]<<endl;
}

int arrout(int j){
	cout<<"happy"<<endl;
}

int main(){
	int l,u;
	cin>>l;
	cin>>u;
	for(int i=0;i<l;i++){
		arrfun(i);
	}
	for (int j=0;j<u;j++){
		arrout(j);
	}
}