#include "Circle.h"
#include <sstream>;
#include <iostream>

using namespace std;
int main(void)
{
	Circle* circles = new Circle[3];
	int radiouses[3];
	double result=0;
	cout << "3���� �� ������ ���� �Է����ּ���\n";
	cin >> radiouses[0] >> radiouses[1] >> radiouses[2];
	for (int i = 0; i < 3; i++) 
	{
		circles[i].setRadius(radiouses[i]);
	}

	for (int i = 0; i < 3; i++)
	{
		result = circles[i].getArea();

		if (result > 100) 
		{
			cout << i+1 << "��° ���� ũ�Ⱑ 100�� �ѽ��ϴ�. ���: " << result << "\n";
		}
	}

	delete[] circles;
	
}