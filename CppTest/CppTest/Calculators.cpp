#include "calcualtor.h"


Calculate::~Calculate() 
{
	cout << "�θ� �Ҹ�\n";
}
void Calculate::setValue(int x, int y)
{
	this->x = x;
	this->y = y;
}


int Add::calculate()
{
	return x + y;
}
 Add:: ~Add() {
	cout << "Add �Ҹ�\n";
}


 int Sub::calculate()
{

	 return x - y;
}
Sub:: ~Sub() {
	cout << "Sub �Ҹ�\n";
}


int Mul::calculate()
{
	return x * y;
}
Mul:: ~Mul() {
	cout << "Mul �Ҹ�\n";
}

int Div::calculate()
{
	if (y != 0) {

		return x / y;
	}
	else {
		throw exception("Error �и� 0�Դϴ�! \n");
	}
	
}
Div:: ~Div() {
	cout << "Div �Ҹ�\n";
}

