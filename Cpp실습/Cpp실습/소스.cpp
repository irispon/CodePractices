#include<iostream>
#include<string>
#include<cstring>

using namespace std;

int main() {
	char cofee[100];
	int num;
	int income = 0;
	int cost;

	cout << "에스프레소 2000원 아메리카노 2300원 카푸치노 2500원입니다.\n";
	for (income = 0; income < 20000;) {
		cout << "주문>> ";
		cin >> cofee >> num;
		if (strcmp(cofee, "에스프레소") == 0) {
			cost = 2000 * num;

		}
		else if (strcmp(cofee, "아메리카노") == 0) {

			cost = 2300 * num;

		}
		else if (strcmp(cofee, "카푸치노") == 0) {

			cost = 2500 * num;

		}
		else {

			cost = 0;
		}

		if (cost == 0) {
			cout << "주문을 잘못하셨네요.\n";
		}
		else
		{
			cout << cost << "원 입니다. 맛있게 드세요\n";
			income += cost;
		}


	}

	cout << "오늘" << income << "원을 판매하여 카페 문을 닫습니다. 내일 봐요~~";

}