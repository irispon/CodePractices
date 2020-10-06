#include "coffeeMachine.h"


CoffeeMachin::CoffeeMachin(int coffeeBean,int water,int sugar) {
	this->coffeeBean = coffeeBean;
	this->sugar = sugar;
	this->water = water;
}
void CoffeeMachin::dirinkEspressor() {

	MakeCoffee(1, 1);//����������
}
void CoffeeMachin::drinkAmericano() {

	MakeCoffee(1, 2);//�Ƹ޸�ī��
}
void CoffeeMachin::drinkSugarCoffee() {

	MakeCoffee(1, 2, 1);//����Ŀ��
}
void CoffeeMachin::show() {
	cout << "Ŀ�� �ӽ� ����, " << "Ŀ��:" << coffeeBean << " ��:" << water << " ����:" << sugar<<"\n";
}
void CoffeeMachin:: fill(int coffeeBean,int water, int sugar) {
	this->coffeeBean = coffeeBean;
	this->sugar = sugar;
	this->water = water;
}

bool CoffeeMachin::MakeCoffee(int coffeeBean, int water, int sugar) {

	// ��� ������ true. ��� �����ϸ� false;
	if (this->coffeeBean < coffeeBean || this->water < water || this->sugar<sugar) 
	{
		cout << "��� �����մϴ�.\n";
		return false;
	}
	else {
		this->coffeeBean -= coffeeBean;
		this->water -= water;
		this->sugar -= sugar;

		return true;
	}

}