#include <iostream>
using namespace std;

class node{
	public:
		int data;
		node* link;
};

int main(){
	node* head= NULL;
	node* ptr = new node();
	ptr->data = 2;
	ptr->link= NULL;
	head = ptr;
	node* ptr2= new node();
	ptr2->data = 3;
	ptr2->link= NULL;
	ptr->link= ptr2;
	while (head!= NULL){
		cout<<head->data;
		head= head->link;
	}
}