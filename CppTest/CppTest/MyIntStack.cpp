#include "MyIntStack.h"
#include <vcruntime_string.h>
MyIntStack::MyIntStack()
{
	memset(p, 0, sizeof(p));//배열 0으로 초기화
	tos = 0;
	
}
bool MyIntStack::push(int n) {
	if (tos < sizeof(p) / sizeof(p[0]))
	{
		p[tos] = n;
		tos++;
		return true;
	}
	else {

		return false;
	}


}
bool MyIntStack::pop(int& n) {
	tos--;
	if (tos < 0) {
		return false;
	}
	n = p[tos];

	return true;
}
