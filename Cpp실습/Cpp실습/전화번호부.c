
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
		gets(number.name);


		printf("\n�� ��ȭ��ȣ�� �Է����ּ���: ");
		gets(number.homeNumber);

		printf("\n�ڵ��� ��ȭ��ȣ�� �Է����ּ���: ");
		gets(number.phonNumber);

		List_Add(list, number);//����Ʈ�� ������ �߰�.

		printf("\n��� �Է� �Ͻó���? �ƴ϶�� 'q'�� �Է����ּ���: ");
		breakKey =getchar();
		gets(trash);//�����Ⱚ ������(���ۿ� �����ִ� ������ ����)


		// ������ �ʱ�ȭ
		number.name[0] = '\0';
		number.homeNumber[0] = '\0';
		number.phonNumber[0] = '\0';

	}
	

	printf("������ Ȯ��\n");

	printf("\n �˻� �� �̸��� �Է����ּ���: ");
	char search[10];
	gets(search);
	NumElement result;
	result = List_Search(list, search);
	

		printf("\n�̸�:%s", result.name);
		printf("\n�� ��ȣ:%s", result.homeNumber);
		printf("\n�޴��� ��ȣ:%s", result.phonNumber);


	
	printf("\n");
	Free_List(list);

}