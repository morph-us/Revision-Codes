#include<iostream>
using namespace std;

#pragma pack(1);

struct player1{

	short name;
	int num;
	struct player *next;

};

struct player2{

	int num;	
	struct player *next;
	short name;


};

struct player3{
	int num;
	short name;
	struct player *next;

};





int main(){

	cout<<sizeof(player1)<<endl;
	cout<<sizeof(player2)<<endl;
	cout<<sizeof(player3)<<endl;

	return 0;





}
