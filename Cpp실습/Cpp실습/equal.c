#include<stdio.h>

#define true 1
#define false 0;
typedef int bool;


typedef struct point {
	int x;
	int y;
} point;

bool equal(point*, point*);

int main(void)
{

	point p1;
	point p2;

	p1.x = 1;
	p1.y = 2;

	p2.x = 3;
	p2.y = 4;

	equal(&p1, &p2);//test 1 Æ²¸° ÁÂÇ¥


	p1.x = 4;
	p1.y = 5;

	p2.x = 4;
	p2.y = 5;

	equal(&p1, &p2);//test 2 °°Àº ÁÂÇ¥
}


bool equal(point* p1, point* p2)
{
	int result;
	if ((p1->x == p2->x) &&( p1->y == p2->y))
	{

		result= true;

	}
	else {

		result = false;
	}

	if (result)
	{

		printf("(%d,%d)==(%d,%d)\n",p1->x,p1->y,p2->x,p2->y);


	}
	else
	{
		printf("(%d,%d)!=(%d,%d)\n", p1->x, p1->y, p2->x, p2->y);

	}
	


	return result;
}