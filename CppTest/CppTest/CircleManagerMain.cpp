#include"Circles.h"

int main(void) 
{
	int size;
	cout << "���� ����>> ";
	cin >> size;
	CircleManager manager(size);

	int radious;
	string name;
	for (int i = 0; i < size; i++) {
		cout << "��" << i + 1 << "�� �̸��� ������ >>";
		cin >> name >> radious;
		manager.addCircle(name, radious);
		
	}
	manager.searchByName();
	manager.searchByArea();
}