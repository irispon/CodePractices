#include"date.h"

using namespace date;

int main()
{
	Date birth(2014,1,2);
	Date independenceDay("1995/12/07");
	independenceDay.show();
	cout << birth.getYear() << "," << birth.getMonth() << "," << birth.getDay() << ",\n";
}