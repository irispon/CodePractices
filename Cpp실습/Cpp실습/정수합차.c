#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include <stdlib.h>

int main(void) {
	int amount;
	int* integers;
	int value=0;
	printf("정수의 개수 : ");
	scanf("%d", &amount);

	integers = (int*)malloc(sizeof(int) * amount);
	
	int i = 0;
	for (i = 0; i < amount; i++) {
	
		printf("양의 정수를 입력하시오: ");
		scanf("%d", &integers[i]);
	}

	for (i = 0; i < amount; i++) {
		value += integers[i];
		
	}

	printf("합은 %d 입니다.", value);

}