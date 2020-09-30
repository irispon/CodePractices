#include<stdio.h>
#define MAX 5

void max_func(int*, int**, int size);

int main(void)
{
	int* max=NULL;

	int num[MAX] = {5,6,1,3,7};


	max_func(num, &max, MAX);

	printf("�ִ밪 %d",*max);

}

void max_func(int* p, int** pmax,int size)
{
	int max = p[0];
	int i = 0;
	for (int i = 0; i < size; i++)
	{
		if (max < p[i]) 
		{
			max = p[i];

		}

	}

	*pmax = &max;
}