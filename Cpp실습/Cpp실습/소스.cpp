#include<iostream>
#include<string>
#include<cstring>

using namespace std;

int main() {
	char cofee[100];
	int num;
	int income = 0;
	int cost;

	cout << "���������� 2000�� �Ƹ޸�ī�� 2300�� īǪġ�� 2500���Դϴ�.\n";
	for (income = 0; income < 20000;) {
		cout << "�ֹ�>> ";
		cin >> cofee >> num;
		if (strcmp(cofee, "����������") == 0) {
			cost = 2000 * num;

		}
		else if (strcmp(cofee, "�Ƹ޸�ī��") == 0) {

			cost = 2300 * num;

		}
		else if (strcmp(cofee, "īǪġ��") == 0) {

			cost = 2500 * num;

		}
		else {

			cost = 0;
		}

		if (cost == 0) {
			cout << "�ֹ��� �߸��ϼ̳׿�.\n";
		}
		else
		{
			cout << cost << "�� �Դϴ�. ���ְ� �弼��\n";
			income += cost;
		}


	}

	cout << "����" << income << "���� �Ǹ��Ͽ� ī�� ���� �ݽ��ϴ�. ���� ����~~";

}