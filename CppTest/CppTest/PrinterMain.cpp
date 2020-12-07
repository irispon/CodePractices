#include"Printer.h"
#include"PrinterManager.h"

int main(void) 
{
	bool loop=true;
	char ch;
	PrinterManager manager;
	manager.add(new InkSetPrinter("��ũ�� ������", "V40", "HP", 5, 10));
	manager.add(new LaserPrinter("������ ������", "SCX-6x45", "�Ｚ����", 3, 20));
	while (loop) 
	{
		manager.show();
		manager.print();
		cout << "\n��� ����Ʈ �Ͻðڽ��ϱ�?(y/n)>> ";
		cin >> ch;
		if (ch != 'y') loop =false;
		"\n";
	}

	manager.clear();

}