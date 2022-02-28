#include<iostream>
using namespace std;


class Demo{

	public:
	int a =10;
	int b = 20;



	void fun(){
		cout<<a<<" "<<b<<endl;

	}

};

	void operator+(Demo &ref1,Demo &ref2){
		cout<<ref1.a+ref2.a<<endl;
		cout<<ref1.b+ref2.b<<endl;	
		
	}




int main(){
	Demo d1,d2;

	d1+d2;

}


