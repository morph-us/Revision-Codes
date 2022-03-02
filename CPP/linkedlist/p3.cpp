#include<iostream>
using namespace std;



struct player{

	string name;
	int num;
	struct player *next;

};

struct player* head;

void createNode(int num,string name){
	
	player *temp = (player*)malloc(sizeof(player));
	temp->num = num;
	temp->name = name;

	head = temp;

}


int main(){

//	player *head = NULL;
	createNode(4,"xyz");

	cout<<"first node"<<endl;
	cout<<"[ "<<head->num<<" , "<<head->name<<" ] "<<endl;

	

	return 0;





}
