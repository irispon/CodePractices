
#include <iostream>
#include<sstream>
#include"date.h"
using namespace std;

namespace date {

	Date::Date(int year, int month, int day) {

		ymd[0] = year;
		ymd[1] = month;
		ymd[2] = day;

	}

	Date::Date(string date) {

		istringstream split(date);
		string stringBuffer;

		for (int i = 0; getline(split, stringBuffer, '/') && i < 3; i++) {
			ymd[i] = stoi(stringBuffer);

		}


	}

}

