#include<iostream>
using namespace std;

class SingleTonObj {
private:
	static SingleTonObj* obj;
	SingleTonObj() {

	}
public:

	static SingleTonObj* getInstance() {
		if (obj == NULL)
		{
			obj = new SingleTonObj;
		}

		return obj;
	
	}

	int count=0;
	int counting() 
	{
		count++;
		return count;
	}

};

SingleTonObj* SingleTonObj::obj = NULL;

int main(void) 
{
	SingleTonObj* test1 = SingleTonObj::getInstance();
	SingleTonObj* test2 = SingleTonObj::getInstance();

	cout<<"test1: "<<test1->counting()<<endl;
	cout <<"test2: " << test2->counting() << endl;
	cout << "test1: " << test1->counting() << endl;
	cout << "test2: " << test2->counting() << endl;
	cout << "test1: " << test1->counting() << endl;
	cout << "test2: " << test2->counting() << endl;
}