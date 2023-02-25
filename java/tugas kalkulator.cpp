#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{

	int a, b, c, d;
	cout << "KALKULATOR SEDERHANA by ridho aji" << endl;
	do{
	cout << "masukkan angka pertama" << endl;
	cin >> c;
	cout << endl;
	cout << "masukkan angka kedua" << endl;
	cin >> d;
	cout << endl;
	cout << "tentukan operasi bilangan" << endl;
	cout << "1.penjumlahan" << endl;
	cout << "2.pengurangan" << endl;
	cout << "3.perkalian" << endl;
	cout << "4.pembagian" << endl;
	cout << "masukkan pilihan" << endl;
	cin >> a;

	switch(a){
		case 1:
			cout << c << "+" << d << "=" <<c+d<< endl;
		break;
		case 2:
			cout << c << "-" << d << "=" <<c-d<< endl;
		break;
		case 3:
			cout << c << "*" << d << "=" <<c*d<< endl;
		break;
		case 4:
			cout << c << "/" << d << "=" <<c/d<< endl;
		break;
		default:
			cout << "pilihan tidak logis" << endl << endl;
		break;
	}
	cout << "ulang?" << endl;
	cout << "1.ya" << endl;
	cout << "2.tidak" << endl;
	cin >> a;
	switch(a){
		case 1:
			(a==1);
		break;
		case 2:
			(a==0);
		break;
	}
	cout << "========================================================="<< endl;
	cout << endl;
	}while(a==1);

	while(a==0);
		cout << "terima kasih telah menggunakan kalkulator ini" << std::endl;
	cin.get();
	return 0;
}

