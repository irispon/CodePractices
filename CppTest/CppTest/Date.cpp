
#include"date.h"
namespace date {

	Date::Date(int year, int month, int day) {

		ymd[0] = year;
		ymd[1] = month;
		ymd[2] = day;

	}
	Date::Date(string date) {

		istringstream split(date);
		string stringBuffer;
		int i = 0;
		try {
			for (i = 0; getline(split, stringBuffer, '/') && i < 3; i++) {
				ymd[i] = stoi(stringBuffer);

			}
		}
		catch (exception e) {
			cout << "에러 발생!";
				ymd[0] = -1;
				ymd[1] = -1;
				ymd[2] = -1;
			

		}

	}

	void Date:: show() {
		if (ymd[0] != -1) {
			cout << ymd[0] << "년" << ymd[1] << "월" << ymd[2] << "일\n";
		}
		else {
			cout << "생일을 잘 못 입력하셨습니다.";
		}
		
	}

	int Date::getYear() {

		return ymd[0];
	}
	int Date::getMonth() {
		return ymd[1];
	}
	int Date::getDay() {
		return ymd[2];

	}
}
