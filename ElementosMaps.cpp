#include <iostream>
#include <map>

using namespace std;



int main() {
	// identificador, sueldo
	// map<key,value>
	map<int, double> empresa;

	map<int, double> oficina;

	map<int, double>::iterator ite;

    empresa.insert({ 1,650 });	// Inserto el trabajador 1
	empresa.insert({ 3,620});   // Inserto el trabajador 2

	oficina.insert({ 2,520.50 });
	oficina.insert({ 4,575 });

	cout << "Los trabajores de oficina son" << endl;

	for (auto it = oficina.begin(); it != oficina.end(); ++it) {
		cout << it->first << ' ' << it->second << endl;
	}

	// Añadir los trabajores de Oficina a Empresa

	empresa.insert(oficina.begin(), oficina.end());

	
	cout << "Los trabajores de Empresa son" << endl;

	for (auto it = empresa.begin(); it != empresa.end(); ++it) {
		cout << it->first << ' ' << it->second << endl;
	}

	

}
