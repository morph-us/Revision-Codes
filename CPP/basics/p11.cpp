#include<iostream>

using namespace std;

struct Demo{
	string x;


};


struct Demo &fun()
{
	cout<<"hello there";


	return obj;
}
int main()
{
	fun() = 30;
	cout << fun();
	return 0;
}

