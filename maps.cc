using namespace std;

int  main(){

//Alumno tendrá como key = ID (int)
//Alumno tendrá como value = nota (int)

map<int, int> alumnoNota;

alumnoNota[3] = 8;
alumnoNota[6] = 4;
alumnoNota[2] = 9;



alumnoNota.begin(); //retorna a un iterador al primer elemento

map<char, int>::iterador i; // tengo un iterador que apunta a map<int, int>

it = alumnoNota.begin();

//it->first; // accedo a la key del map
//it->second; // accedo a la value del map

it = alumno.begin();

cout << "La nota del alumno " << it->first << "es: " << it->second << end1;

}
