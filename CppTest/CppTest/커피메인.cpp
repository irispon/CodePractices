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

	//재고 부족 테스트
	java.drinkSugarCoffee();
	java.show();
	java.drinkSugarCoffee();
	java.show();
	java.drinkSugarCoffee();
	//채워넣기
	java.fill();//기본값 10,10,10
	java.show();


}