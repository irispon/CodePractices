#include"Printer.h"
#include"PrinterManager.h"

int main(void) 
{
	bool loop=true;
	char ch;
	PrinterManager manager;
	manager.add(new InkSetPrinter("잉크젯 프린터", "V40", "HP", 5, 10));
	manager.add(new LaserPrinter("레이저 프린터", "SCX-6x45", "삼성전자", 3, 20));
	while (loop) 
	{
		manager.show();
		manager.print();
		cout << "\n계속 프린트 하시겠습니까?(y/n)>> ";
		cin >> ch;
		if (ch != 'y') loop =false;
		"\n";
	}

	manager.clear();

}