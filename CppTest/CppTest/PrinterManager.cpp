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
	cout << "\n현재 작동중인 " << cusor << "대의 프린터는 다음과 같다" << endl;
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
	cout << "프린터(";
	for (int i = 0; i < cusor; i++)
	{
		cout << i+1 << ": " << printers[i]->getKind() << ", ";
	}
	cout << "\b\b)와 매수 입력>>";
	cin >> kind >> pages;
	kind--;
	if (kind >= 0&&kind<=cusor) 
	{
		try {
			printers[kind]->print(pages);
			info();
		}
		catch (exception e) {
			cout << "오류!" << e.what() << endl;
		}
	}



}
