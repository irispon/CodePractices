#include"PrinterManager.h"

void PrinterManager::add(Printer* printer) 
{
	if (cusor>=size)
	{
		
		reSize();
	}

	printers[cusor] = printer;
	cusor++;
}

void PrinterManager::reSize()
{
	size *= 2;
	Printer** temp = (Printer**)malloc(sizeof(Printer*) * size);
	for (int i = 0; i < cusor; i++)
	{
		temp[i] = printers[i];
	}
	free(printers);
	printers = temp;
	
}

void PrinterManager::show() 
{
	cout << "\n���� �۵����� " << cusor << "���� �����ʹ� ������ ����" << endl;
	info();
}
void PrinterManager::info()
{
	cout << "\n";
	for (int i = 0; i < cusor; i++)
	{
		printers[i]->info();
	}
}

void PrinterManager::print() 
{
	int kind;
	int pages;
	cout << "������(";
	for (int i = 0; i < cusor; i++)
	{
		cout << i+1 << ": " << printers[i]->getKind() << ", ";
	}
	cout << "\b\b)�� �ż� �Է�>>";
	cin >> kind >> pages;
	kind--;
	if (kind >= 0&&kind<=cusor) 
	{
		try {
			printers[kind]->print(pages);
			info();
		}
		catch (exception e) {
			cout << "����!" << e.what() << endl;
		}
	}



}
