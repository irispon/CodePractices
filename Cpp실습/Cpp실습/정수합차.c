#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include <stdlib.h>

int main(void) {
	int amount;
	int* integers;
	int value=0;
	printf("������ ���� : ");
	scanf("%d", &amount);

	integers = (int*)malloc(sizeof(int) * amount);
	
	int i = 0;
	for (i = 0; i < amount; i++) {
	
		printf("���� ������ �Է��Ͻÿ�: ");
		scanf("%d", &integers[i]);
	}

	for (i = 0; i < amount; i++) {
		value += integers[i];
		
	}

	printf("���� %d �Դϴ�.", value);

}