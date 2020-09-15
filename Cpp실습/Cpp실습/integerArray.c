
#include<stdio.h>

void array_print(int*, int );

int main(void) {
	int A[] = { 1,2,3,4,5 };

	array_print(A, sizeof(A) / sizeof(int));
	return 0;
}
void array_print(int *A, int size) {
	int i = 0;
	printf("A[] ={ ");
	for (i = 0; i < size; i++) {
		printf("%d ", A[i]);

	}
	printf("} \n");

}