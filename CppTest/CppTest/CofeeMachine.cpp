#include "coffeeMachine.h"


CoffeeMachin::CoffeeMachin(int coffeeBean,int water,int sugar) {
	this->coffeeBean = coffeeBean;
	this->sugar = sugar;
	this->water = water;
}
void CoffeeMachin::dirinkEspressor() {

	MakeCoffee(1, 1);//에스프레소
}
void CoffeeMachin::drinkAmericano() {

	MakeCoffee(1, 2);//아메리카노
}
void CoffeeMachin::drinkSugarCoffee() {

	MakeCoffee(1, 2, 1);//설탕커피
}
void CoffeeMachin::show() {
	cout << "커피 머신 상태, " << "커피:" << coffeeBean << " 물:" << water << " 설탕:" << sugar<<"\n";
}
void CoffeeMachin:: fill(int coffeeBean,int water, int sugar) {
	this->coffeeBean = coffeeBean;
	this->sugar = sugar;
	this->water = water;
}

bool CoffeeMachin::MakeCoffee(int coffeeBean, int water, int sugar) {

	// 재고가 있으면 true. 재고가 부족하면 false;
	if (this->coffeeBean < coffeeBean || this->water < water || this->sugar<sugar) 
	{
		cout << "재고가 부족합니다.\n";
		return false;
	}
	else {
		this->coffeeBean -= coffeeBean;
		this->water -= water;
		this->sugar -= sugar;

		return true;
	}

}