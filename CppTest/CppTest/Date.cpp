
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
			cout << "���� �߻�!";
				ymd[0] = -1;
				ymd[1] = -1;
				ymd[2] = -1;
			

		}

	}

	void Date:: show() {
		if (ymd[0] != -1) {
			cout << ymd[0] << "��" << ymd[1] << "��" << ymd[2] << "��\n";
		}
		else {
			cout << "������ �� �� �Է��ϼ̽��ϴ�.";
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
