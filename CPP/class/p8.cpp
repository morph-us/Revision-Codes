#include<iostream>
using namespace std;
class Test{

	const char* name;
	int num;

	public:
	Test(){

		cout<<sizeof(num)<<" test constructor";

	}

};



int main(){


	Test t;

	cout<<"hello";
	cout<<endl<<sizeof(t);


}




