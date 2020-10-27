#include"Circles.h"

int main(void) 
{
	int size;
	cout << "원의 개수>> ";
	cin >> size;
	CircleManager manager(size);

	int radious;
	string name;
	for (int i = 0; i < size; i++) {
		cout << "원" << i + 1 << "의 이름과 반지름 >>";
		cin >> name >> radious;
		manager.addCircle(name, radious);
		
	}
	manager.searchByName();
	manager.searchByArea();
}