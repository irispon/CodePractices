#include"constructor.h"
using namespace OverConstructor;
int main(void) 
{
	Person grace, ashley(2, "Ashley"), helen(3, "Helen", 32.5);
	grace.show();
	ashley.show();
	helen.show();

}