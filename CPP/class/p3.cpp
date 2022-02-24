#include<iostream>
using namespace std;

struct value{
	int x;
	float y;

};

class Child{
	int a =10;
	float b = 20;


	public:

	struct value fun(){
		struct value obj;
		obj.x = a;
		obj.y = b;


		return obj;
	}	

};


int main(){
	Child c;
	
	struct value x = c.fun();

	
	cout<<x.x<<endl<<x.y;


}
