#include<iostream>
#include<vector>
using namespace std;

ostream& operator<<(ostream& out,vector<int>& v){

	vector<int>:: iterator itr;

//	v:: iterator itr;

	for(itr=v.begin(); itr!=v.end();itr++ ){
		cout<<*itr<<endl;
	}


	return out;
}


int main(){
	
	vector<int> v;

	v.push_back(10);
	v.push_back(11);
	v.push_back(12);
	v.push_back(13);



	cout<<v;

}
