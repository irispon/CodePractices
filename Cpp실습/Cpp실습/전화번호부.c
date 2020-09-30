
#include "PhonNumberList.h"


int main(void) 
{
	ArrayList* list = List_Create();
	NumElement number;
	char breakKey=' ';
	char trash[30];

	while (breakKey!='q')
	{

		printf("\n�̸��� �Է����ּ���: ");
		fgets(number.name, sizeof(number.name), stdin);


		printf("\n�� ��ȭ��ȣ�� �Է����ּ���: ");
		fgets(number.phonNumber, sizeof(number.phonNumber), stdin);

		printf("\n�ڵ��� ��ȭ��ȣ�� �Է����ּ���: ");
		fgets(number.homeNumber, sizeof(number.homeNumber), stdin);

		List_Add(list, number);//����Ʈ�� ������ �߰�.

		printf("\n��� �Է� �Ͻó���? �ƴ϶�� 'q'�� �Է����ּ���: ");
		breakKey =getchar();
		fgets(trash, sizeof(trash), stdin);//�����Ⱚ ������(���ۿ� �����ִ� ������ ����)


		// ������ �ʱ�ȭ
		number.name[0] = '\0';
		number.homeNumber[0] = '\0';
		number.phonNumber[0] = '\0';

	}
	

	printf("������ Ȯ��\n");

	int i = 0;
	for (i = 0; i < list->cursor; i++)
	{

		printf("\n�̸�:%s", list->data[i].name);
		printf("\n�� ��ȣ:%s", list->data[i].homeNumber);
		printf("\n�޴��� ��ȣ:%s",list->data[i].phonNumber);

	}
	
	printf("\n");
	Free_List(list);

}