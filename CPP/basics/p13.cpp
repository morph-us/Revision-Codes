#include<iostream>
using namespace std;

void swap(int * &str1, int * &str2)
{
	int *temp = str1;
	str1 = str2;
	str2 = temp;
}

int main()
{
	int a =3;
	int b = 4;

	int *str1 = &a;
	int *str2 = &b;
	swap(str1, str2);
	cout<<"str1 is "<<*str1<<endl;
	cout<<"str2 is "<<*str2<<endl;
	return 0;
}

