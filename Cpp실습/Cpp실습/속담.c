#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

#define true 1
#define false 0

void set_proverb(char**, int);

int main(void)
{
	char* s = NULL;
	int n;
	while (true) {
		printf("���° �Ӵ��� �Է��Ͻðڽ��ϱ�?\n");
		scanf("%d", &n);

		set_proverb(&s, n);

		printf("%s\n", s);
	}



}

void set_proverb(char** q, int n)
{
	n--;
	static char* charArray[10] = { "�θ��� ���� �θ����� �����","�ƴ� �� ���ҿ� ���⳪��","����� ���� ������� �ʴ´�","���� ������ ���ϴ� ������ ���� ���ϰ� �����.",
	"���д� ���� �ƴϴ�","�ູ�ϰ� ��������","�Ӵ��� �������� �ʴ´�","�������� ��� ��´�.","ģ�� ���� ��������.","������ �Ӵ�" };

	*q = charArray[n];

}