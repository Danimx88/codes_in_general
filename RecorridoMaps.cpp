#include <iostream>
#include <map>


using namespace std;


int main() {

	// Alumno tendrá como key = nombre	(string)
	// Alumno tendrá como value = nota	(int)

	// map<key,value>
	

	map<string, int> alumnoNota;

	alumnoNota["santiago"] = 8;	
	alumnoNota["ana"] = 4;			
	alumnoNota["carlos"] = 9;
	alumnoNota["ulises"] = 5;
	alumnoNota["adan"] = 10;
	alumnoNota["richard"] = 6;

	// begin() retorna un puntero al primer elemento
	// end()   retorna un puntero al ficticio elemento que va despues del ultimo

		// tengo un iterador que apunta a map<string,int>

	// BUCLE WHILE

	map<string, int>::iterator it = --alumnoNota.end();

	while (it != --alumnoNota.begin()) {
		cout << "El alumno " << it->first << " tiene la nota: " << it->second << endl;
		--it;
	}
