#include"Person.h"

int main(void)
{
	Person person[3];

	cout << "�̸��� ��ȭ ��ȣ�� �Է����ּ��� \n";
	string name, tel;

	for (int i = 0; i < 3; i++) 
	{
		name = "";
		tel = "";
		cout << "���"<<i+1<<">> ";
		cin >> name >> tel;	
		person[i].set(name, tel);
	}
	cout << "��� ����� �̸���" ;
	for (int i = 0; i < 3; i++) 
	{
		cout << " " << person[i].getName();

	}
	cout << "\n��ȭ��ȣ�� �˻��մϴ�.�̸��� �Է��ϼ���." ;
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