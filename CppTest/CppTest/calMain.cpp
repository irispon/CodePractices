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
		cout <<"��� ����� �Է����ּ���\na:���� s:����,m:����, d:������ b: ������\n\n ";
		cin >> mod;
		if (mod != 'b') {

			x = 0, y = 0, result = 0;
			cout << "������ �Է����ּ���\n\n";
			cin >> x >> y;

			switch (mod)
			{
			case 'a':
				cout << "\n���� ";
				a->setValue(x, y);
				result = a->calculate();
				break;
			case 's':
				cout << "\n���� ";
				s->setValue(x, y);
				result = s->calculate();
				break;
			case 'm':
				cout << "\n���� ";
				m->setValue(x, y);
				result = m->calculate();
				break;
			case 'd':
				try {
					d->setValue(x, y);
					result = d->calculate();
					cout << "\n������ ";
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
				cout << "��� ���: " << result << "\n\n";

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