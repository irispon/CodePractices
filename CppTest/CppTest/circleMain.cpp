#include "Circle.h"
#include <sstream>;
#include <iostream>

using namespace std;
int main(void)
{
	Circle* circles = new Circle[3];
	int radiouses[3];
	double result=0;
	cout << "3개의 원 반지름 값을 입력해주세요\n";
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
			cout << i+1 << "번째 원의 크기가 100이 넘습니다. 결과: " << result << "\n";
		}
	}

	delete[] circles;
	
}