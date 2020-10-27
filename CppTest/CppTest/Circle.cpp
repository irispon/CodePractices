#include"Circle.h"

 Circle::Circle() {
	radius = 1;
}
void Circle::setRadius(int radius)
{
	this->radius = radius;
}
double Circle::getArea()
{
	double area =(double) 3.14 * (radius * radius);
	return area;
}
Circle::~Circle() 
{
	
}
