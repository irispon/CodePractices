#include "coffeeMachine.h"

int main() 
{

	CoffeeMachin java(5, 10, 3);
	java.dirinkEspressor();
	java.show();
	java.drinkAmericano();
	java.show();
	java.drinkSugarCoffee();
	java.show();

	//��� ���� �׽�Ʈ
	java.drinkSugarCoffee();
	java.show();
	java.drinkSugarCoffee();
	java.show();
	java.drinkSugarCoffee();
	//ä���ֱ�
	java.fill();//�⺻�� 10,10,10
	java.show();


}