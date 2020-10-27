#include"calcualtor.h"

int main(void)
{

	Calculate* a, * s, * m, * d;
	a = new Add();
	s = new Sub();
	m = new Mul();
	d = new Div();
	int x=0, y = 0,result=0;
	char mod;
	bool loop = true;

	while (loop)
	{
		cout <<"°è»ê ¹æ¹ýÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä\na:µ¡¼À s:»¬¼À,m:°ö¼À, d:³ª´°¼À b: ³ª°¡±â\n\n ";
		cin >> mod;
		if (mod != 'b') {

			x = 0, y = 0, result = 0;
			cout << "º¯¼ö¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä\n\n";
			cin >> x >> y;

			switch (mod)
			{
			case 'a':
				cout << "\nµ¡¼À ";
				a->setValue(x, y);
				result = a->calculate();
				break;
			case 's':
				cout << "\n»¬¼À ";
				s->setValue(x, y);
				result = s->calculate();
				break;
			case 'm':
				cout << "\n°ö¼À ";
				m->setValue(x, y);
				result = m->calculate();
				break;
			case 'd':
				try {
					d->setValue(x, y);
					result = d->calculate();
					cout << "\n³ª´°¼À ";
				}
				catch (exception& e) {
					cout << "\n " << e.what();
					result = 0;
				}

				break;
			default:
				mod = 'b';
				break;
			}

			if (mod != 'b')
				cout << "°è»ê °á°ú: " << result << "\n\n";

		}
		else {
			loop = false;
		}


	}



	delete a;
	delete s;
	delete m;
	delete d;
}