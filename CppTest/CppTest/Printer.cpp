#include"Printer.h"

Printer::Printer(string kinds, string model, string manufacturer, int printedCount) {
	this->kinds = kinds;
	this->model = model;
	this->manufacturer = manufacturer;
	this->printedCount = printedCount;
}
void Printer::print(int pages) 
{
	int i = 0;
	if (pages > printedCount) {
		cout << "\n\n������ �����մϴ�. \n\n";
	}
	else {
		for (i = 0; i < pages && print(); i++);
		cout << "\n\n����Ʈ �߽��ϴ�. \n\n";
	}


	
}
string Printer::getKind() 
{
	return kinds;
}
bool Printer::print() 
{
	if (printedCount > 0) {
		printedCount--;
		return true;
	}
	else {
		cout << "\n\n�μ� �ż��� �� ���������ϴ�. �𵨸�: "<<model << "\n\n";
		return false;
	}
	
}
Printer::~Printer() {

}


LaserPrinter::LaserPrinter(string kinds, string model, string manufacturer, int printedCount, int availableToner):Printer(kinds,  model, manufacturer, printedCount)
{
	this->availableToner = availableToner;
}


bool LaserPrinter::print() 
{
	if (availableToner > 0) {
		availableToner--;
	}else 
	{
		cout << "\n\n ��ʰ� �� ���������ϴ�. " << model << "\n\n";
		return false;
	}
	
	Printer::print();//�θ� ȣ��

}
void LaserPrinter::info() {
	cout << kinds << ":" << model << ", " << manufacturer << ", " << "���� ����" << printedCount << "��, " << "���� ���" << availableToner << endl;
}
LaserPrinter::~LaserPrinter() {

}

InkSetPrinter::InkSetPrinter(string kinds, string model, string manufacturer, int printedCount, int availableInK) :Printer(kinds, model, manufacturer, printedCount)
{
	this->availableInK = availableInK;
}

bool InkSetPrinter::print()
{
	if (availableInK > 0) {
		availableInK--;
	}
	else
	{
		cout << "\n\n ��ũ�� �� ���������ϴ�. " << model << "\n\n";
		return false;
	}

	Printer::print();//�θ� ȣ��

}
void InkSetPrinter::info() {
	cout << kinds << ":" << model << ", " << manufacturer << ", " << "���� ����" << printedCount << "��, " << "���� ��ũ" << availableInK << endl;
}
InkSetPrinter::~InkSetPrinter()
{

}