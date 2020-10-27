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
	cout << "검색하고자 하는 원의 이름>> ";
	cin >> name;

	for (int i = 0; i < pointer; i++)
	{
		if (name._Equal(p[i].getName()))
		{
			cout << "\n" << name << "의 면적은 " << p[i].getArea() << "\n";
		}

	}

}
void CircleManager::searchByArea()
{
	double area;
	cout << "최소 면적>> ";
	cin >> area;
	cout << "\n" << area << "보다 큰 원을 검색합니다." << endl;

	for (int i = 0; i < pointer; i++)
	{
		if (p[i].getArea() > area)
		{
			cout << "\n" << p[i].getName() << "의 면적은 " << p[i].getArea() << "" << "\n";
		}

	}

}
CircleManager::~CircleManager()
{
	delete[]p;
}
