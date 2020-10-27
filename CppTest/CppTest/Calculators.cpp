#include "calcualtor.h"


Calculate::~Calculate() 
{
	cout << "ºÎ¸ð ¼Ò¸ê\n";
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
	cout << "Add ¼Ò¸ê\n";
}


 int Sub::calculate()
{

	 return x - y;
}
Sub:: ~Sub() {
	cout << "Sub ¼Ò¸ê\n";
}


int Mul::calculate()
{
	return x * y;
}
Mul:: ~Mul() {
	cout << "Mul ¼Ò¸ê\n";
}

int Div::calculate()
{
	if (y != 0) {

		return x / y;
	}
	else {
		throw exception("Error ºÐ¸ð°¡ 0ÀÔ´Ï´Ù! \n");
	}
	
}
Div:: ~Div() {
	cout << "Div ¼Ò¸ê\n";
}

