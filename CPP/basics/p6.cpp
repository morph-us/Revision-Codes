#include<iostream>
using namespace std;

int main(){
	int n;
	cout<<"enter a num\n";

	cin>>n;
	char ch;

	do{

	switch(n){
		case 1:
			cout<<"case 1";
			break;
		case 'a':
			cout<<"case a";
			break;
		case 'A':
			cout<<"case A";
			break;

		case 2:
			cout<<"case 2";
			break;

		case 9:
			cout<<"case 9";
			break;	
	
		default:
			cout<<"default";
			break;
	}
	cout<<"\nDo you want to continue\n";
	cin>>ch;

	}while( ch=='y'|| ch=='Y');




}
