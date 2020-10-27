#include"Circles.h"

CircleManager::CircleManager(int size) {
	p = NULL;
	this->size = size;
	p = new Circle[size];
	pointer = 0;

}
CircleManager::CircleManager() :CircleManager(20)
{

};

void CircleManager::addCircle(Circle circle) {

	if (pointer >= size) {
		reSize();

	}
	p[pointer] = circle;
	pointer++;
}
void CircleManager::addCircle(string name, int radious) {

	if (pointer >= size) {
		reSize();

	}
	p[pointer].setCircle(name, radious);
	pointer++;
}
void CircleManager::reSize()
{
	int size = this->size * 2;
	Circle* tmp = new Circle[size];
	for (int i = 0; i < this->size; i++) {
		tmp[i] = p[i];
	}
	delete[]p;
	p = tmp;
	tmp = NULL;
	this->size = size;
}

void CircleManager::searchByName()
{
	string name = "";
	cout << "�˻��ϰ��� �ϴ� ���� �̸�>> ";
	cin >> name;

	for (int i = 0; i < pointer; i++)
	{
		if (name._Equal(p[i].getName()))
		{
			cout << "\n" << name << "�� ������ " << p[i].getArea() << "\n";
		}

	}

}
void CircleManager::searchByArea()
{
	double area;
	cout << "�ּ� ����>> ";
	cin >> area;
	cout << "\n" << area << "���� ū ���� �˻��մϴ�." << endl;

	for (int i = 0; i < pointer; i++)
	{
		if (p[i].getArea() > area)
		{
			cout << "\n" << p[i].getName() << "�� ������ " << p[i].getArea() << "" << "\n";
		}

	}

}
CircleManager::~CircleManager()
{
	delete[]p;
}
