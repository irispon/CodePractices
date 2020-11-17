#include"constructor.h"

OverConstructor::Person::Person()
{

}

OverConstructor::Person::Person(int id,string name)
{
	this->id = id;
	this->name = name;
}

OverConstructor::Person::Person(int id, string name,double weight)
{
	
		this->id = id;
		this->name = name;
		this->weight = weight;
}
void OverConstructor::Person::show()
{

	cout << id << "  " << weight << "  " << name << endl;
}

DeConstructor::Person::Person(int id,string name, double weight) 
{
	this->id = id;
	this->name = name;
	this->weight = weight;
}
void DeConstructor::Person::show()
{

	cout << id << "  " << weight << "  " << name << endl;
}