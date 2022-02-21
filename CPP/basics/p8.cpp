#include<iostream>
using namespace std;
void fun(int &x,int &y);


int main(){
	int x,y;
	cout<<"enter a and b\n";
	cin>>x>>y;

	cout<<&x<<" "<<&y<<endl;

	fun(x,y);


}

void fun(int &a,int &b){

	cout<<a<<endl<<endl<<b<<endl;


}
