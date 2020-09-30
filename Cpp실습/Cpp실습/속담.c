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
		printf("몇번째 속담을 입력하시겠습니까?\n");
		scanf("%d", &n);

		set_proverb(&s, n);

		printf("%s\n", s);
	}



}

void set_proverb(char** q, int n)
{
	n--;
	static char* charArray[10] = { "로마에 가면 로마법을 따라라","아니 땐 굴뚝에 연기나랴","노력은 나를 배반하지 않는다","나를 죽이지 못하는 고통은 나를 강하게 만든다.",
	"실패는 끝이 아니다","행복하게 생각하자","속담이 생각나지 않는다","선무당이 사람 잡는다.","친구 따라 강남간다.","마지막 속담" };

	*q = charArray[n];

}