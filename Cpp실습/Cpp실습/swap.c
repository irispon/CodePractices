#include<stdio.h>



typedef struct scores {
	double *scores;
	int size;
	int* ss;
} scores;
//���� �ٸ��� ������ �����ϰ� �;� ����ü�� �����Ͽ����ϴ�.

void convert(double* grades, scores *scores, int size);


int main(void)
{
	double grades[] = {4.2,3.5,2.2,2.7,4.0,3.0,2.5,2.5,2.5,2.8};
	//grades�� ���� �κ��Դϴ�.



	scores score;
	

	int size = sizeof(grades) / sizeof(double);
	
	printf("gradeSize %d\n", size);

	convert(grades, &score, size);

	int i = 0;

	printf("������: ");
	for (; i < score.size; i++) {

		printf("%f  ",(score.scores[i]));

	}

	free(score.scores);
	return 0;
}


void convert(double* grades, scores *scores, int size)
{
	int i = 0;
	scores->scores = malloc(sizeof(double) * size); //���� �Ҵ��� ���� grades ��ŭ�� ������ �Ҵ��߽��ϴ�.
	scores->size = size;

	//y = 100x/4.3

	printf("������: ");
	for (i = 0; i < size; i++)
	{
		
		printf("%f  ", (grades[i]));
		scores->scores[i] = grades[i] * 100 / 4.3;

	}





}