#include"Circles.h"

Circle::Circle() {
	name = "";
	radious = 0;
}
double Circle::getArea() {
	return (radious* radious*3.14);
}
string Circle::getName() {
	return name;
}
void Circle::setCircle(string name, int radious) {
	this->name = name;
	this->radious = radious;
}

//CircleManager
