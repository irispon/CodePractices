#include"Person.h"

int main(void)
{
	Person person[3];

	cout << "이름과 전화 번호를 입력해주세요 \n";
	string name, tel;

	for (int i = 0; i < 3; i++) 
	{
		name = "";
		tel = "";
		cout << "사람"<<i+1<<">> ";
		cin >> name >> tel;	
		person[i].set(name, tel);
	}
	cout << "모든 사람의 이름은" ;
	for (int i = 0; i < 3; i++) 
	{
		cout << " " << person[i].getName();

	}
	cout << "\n전화번호를 검색합니다.이름을 입력하세요." ;
	name = "";
	cin >> name;
	for (int i = 0; i < 3; i++) 
	{
		if (person[i].getName()._Equal(name)) 
		{
			cout << "\n"<<person[i].getTel() ;
		}
	}
	
}