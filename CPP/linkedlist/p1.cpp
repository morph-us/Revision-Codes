#include<iostream>
using namespace std;

struct player{
	private:
	string name;
	public:
	int num;

	void set(string name){

	this->name = name;

	}	
	void fun(){
		cout<<name<<endl;
	}

	struct player *next;

};

int main(){
	player obj1;
	cout<<sizeof(player)<<endl;

	obj1.num = 132;
	obj1.set("zyx");

	cout<<obj1.num<<endl;

	obj1.fun();

	return 0;





}
