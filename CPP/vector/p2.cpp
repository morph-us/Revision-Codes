#include<iostream>
#include<vector>
using namespace std;
struct player{
	int jersy;
	string name;

};

ostream& operator<<(ostream& out,struct player& obj){

	cout<<"name : "<<obj.name<<" jersy : "<<obj.jersy;

	return out;
}




ostream& operator<<(ostream& out,vector<struct player>& v){

	vector<struct player>:: iterator itr;

//	v:: iterator itr;

	for(itr=v.begin(); itr!=v.end();itr++ ){
		cout<<*itr<<endl;
	}


	return out;
}

istream& operator>>(istream& cin,struct player& obj){
	cout<<"enter name of player"<<endl;
	cin>>obj.name;
	cout<<"enter jersy number"<<endl;
	cin>>obj.jersy;
	return cin;

}

int main(){
	
	struct player obj[5];


	vector<struct player> v;

	for(int i=0;i<5;i++){
		cin>>obj[i];
		v.push_back(obj[i]);
	}

	
	cout<<v;

}
