
#include "PhonNumberList.h"


int main(void) 
{
	ArrayList* list = List_Create();
	NumElement number;
	char breakKey=' ';
	char trash[30];

	while (breakKey!='q')
	{

		printf("\n이름을 입력해주세요: ");
		fgets(number.name, sizeof(number.name), stdin);


		printf("\n집 전화번호를 입력해주세요: ");
		fgets(number.phonNumber, sizeof(number.phonNumber), stdin);

		printf("\n핸드폰 전화번호를 입력해주세요: ");
		fgets(number.homeNumber, sizeof(number.homeNumber), stdin);

		List_Add(list, number);//리스트에 데이터 추가.

		printf("\n계속 입력 하시나요? 아니라면 'q'를 입력해주세요: ");
		breakKey =getchar();
		fgets(trash, sizeof(trash), stdin);//쓰레기값 버리기(버퍼에 남아있는 쓰레기 값들)


		// 데이터 초기화
		number.name[0] = '\0';
		number.homeNumber[0] = '\0';
		number.phonNumber[0] = '\0';

	}
	

	printf("저장결과 확인\n");

	int i = 0;
	for (i = 0; i < list->cursor; i++)
	{

		printf("\n이름:%s", list->data[i].name);
		printf("\n집 번호:%s", list->data[i].homeNumber);
		printf("\n휴대폰 번호:%s",list->data[i].phonNumber);

	}
	
	printf("\n");
	Free_List(list);

}