#include<stdio.h>

int main(void){
	int a;
	int *p =&a;
	printf("%d\n",p);
	p=p+1;
	printf("%d",p);
}
