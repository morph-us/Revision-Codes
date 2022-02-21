#include<iostream>
using namespace std;

int main(){
	int n;
	cout<<"enter a num\n";
	cin>>n;

	int &x = n;

	cout<<"&n "<<&n<<endl;
	cout<<"x "<<x<<endl;
	cout<<"&x "<<&x<<endl;



}
