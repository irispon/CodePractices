#include<stdio.h>



typedef struct scores {
	double *scores;
	int size;
	int* ss;
} scores;
//조금 다르게 문제를 접근하고 싶어 구조체를 선언하였습니다.

void convert(double* grades, scores *scores, int size);


int main(void)
{
	double grades[] = {4.2,3.5,2.2,2.7,4.0,3.0,2.5,2.5,2.5,2.8};
	//grades의 선언 부분입니다.



	scores score;
	

	int size = sizeof(grades) / sizeof(double);
	
	printf("gradeSize %d\n", size);

	convert(grades, &score, size);

	int i = 0;

	printf("변경후: ");
	for (; i < score.size; i++) {

		printf("%f  ",(score.scores[i]));

	}

	free(score.scores);
	return 0;
}


void convert(double* grades, scores *scores, int size)
{
	int i = 0;
	scores->scores = malloc(sizeof(double) * size); //동적 할당을 통해 grades 만큼의 공간을 할당했습니다.
	scores->size = size;

	//y = 100x/4.3

	printf("변경전: ");
	for (i = 0; i < size; i++)
	{
		
		printf("%f  ", (grades[i]));
		scores->scores[i] = grades[i] * 100 / 4.3;

	}





}