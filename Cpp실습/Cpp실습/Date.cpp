#include <iostream>
#include<sstream>>

using namespace std;



	class Date
	{
	public:
		string ymd[3];

		Date(string, string, string);
		Date(string);
		void show();
		string getYear();
		string getMonth();
		string getDay();
	private:
		~Date();
	};

	Date::Date(string year, string month, string day) {

		ymd[0] = year;
		ymd[1] = month;
		ymd[2] = day;

	}

	Date::Date(string date) {

		istringstream split(date);
		string stringBuffer;

		for (int i = 0; getline(split, stringBuffer, '/') && i < 3; i++) {
			ymd[i] = stringBuffer;

		}


	}



	





