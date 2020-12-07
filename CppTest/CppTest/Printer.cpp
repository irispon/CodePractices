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
		cout << "\n\n용지가 부족합니다. \n\n";
	}
	else {
		for (i = 0; i < pages && print(); i++);
		cout << "\n\n프린트 했습니다. \n\n";
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
		cout << "\n\n인쇄 매수가 다 떨어졌습니다. 모델명: "<<model << "\n\n";
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
		cout << "\n\n 토너가 다 떨어졌습니다. " << model << "\n\n";
		return false;
	}
	
	Printer::print();//부모 호출

}
void LaserPrinter::info() {
	cout << kinds << ":" << model << ", " << manufacturer << ", " << "남은 종이" << printedCount << "장, " << "남은 토너" << availableToner << endl;
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
		cout << "\n\n 잉크가 다 떨어졌습니다. " << model << "\n\n";
		return false;
	}

	Printer::print();//부모 호출

}
void InkSetPrinter::info() {
	cout << kinds << ":" << model << ", " << manufacturer << ", " << "남은 종이" << printedCount << "장, " << "남은 잉크" << availableInK << endl;
}
InkSetPrinter::~InkSetPrinter()
{

}