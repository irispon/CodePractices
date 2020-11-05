#include <iostream>
using namespace std;

char& find(char a[], char c, bool& success);

int main() 
{
	char s[] = "Mike";
	bool b = false;
	char& loc = find(s, 'M', b);
	if (b == false) {
		cout << "M을 발견할 수 없다" << endl;
		return 0;
	}

	loc = 'm';
	cout << s << endl;
}

char& find(char a[], char c, bool& success)
{
	success = false;


	for (int i = 0; a[i] != '\0'; i++) {
		
		if (a[i] == c) {
			success = true;
		}
	}

	return a[0];
}
