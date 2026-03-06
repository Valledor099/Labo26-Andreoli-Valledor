#include <iostream>
#include <vector>
using namespace std;

struct zombie_t
{
    float vida;
    string tipo;
    float daño;
    string velocidad;

};


void recibir_mordida(float &salud, zombie_t Zombie)
{
    
    salud = salud - Zombie.daño;

}

int main()
{
vector <string> mochila;
float salud = 100;
string nombre = "RICKI CYASCHINI";
bool Infectado = false;
int Municion = 30;
zombie_t Zombie;

string Item = "Requiem";

mochila.push_back(Item);

//Zombie
Zombie.vida = 100;
Zombie.tipo ="Normal";
Zombie.daño = 25;
Zombie.velocidad = "Moderado";



    cout<<"Estado Inicial: "<<"Salud: "<< salud << ", Nombre: " << nombre << endl;


/*    if(Infectado){
    cout<<"Esta infectado: SI"<<endl;
}

else{
    cout<<"Esta infectado: NO"<<endl;
}
*/

//cout<<"Municion: " << Municion<<endl;

cout<<"Enemigo zombie avistado"<<endl;

if(Municion > 0 )
{   Zombie.vida = Zombie.vida - 100;
    cout<<"Disparo efectuado "<<"Daño: 100."<<"Salud del Zombie: "<<Zombie.vida<<endl;
    Municion--;
    cout<<"municion restante: "<<Municion<<endl;
}
else{
cout<<"sin municion corre"<<endl;
}

for(int i = 0; i < 5; i++)
{
    cout<<"Revisando caja... "<<endl;

    if (i == 2)
    {
        Item = "Comida";
        cout<<"Item encontrado:"<< "["<<Item<<"]"<<endl;
        mochila.push_back(Item);
        cout<<"Inventario: "<<"["<<mochila[1]<<"]"<<endl;
    }

    if(i == 3)
    {
        Item = "Vendas";
        cout<<"Item encontrado: "<<"["<<Item<<"]"<<endl;
        mochila.push_back(Item);
        cout<<"Inventario: "<<"["<<mochila[2]<<"]"<<endl;
    }


}

recibir_mordida(salud, Zombie);
cout<<"Recibiste una mordida."<<"Salud restante: "<<salud<<endl;
cout<<"Ciclo de vida activo. Salud: "<< salud << ", Nombre: " <<nombre <<". Inventario actual: ["<<mochila[0] <<", "<< mochila[1] << ", " << mochila[2]<< "]."<<endl;
cout<<"Fin de la simulacion."<< endl;
cout<<"Estado Final: Salud: "<< salud <<", Nombre: " <<nombre << ", Inventario: ["<<mochila[0] <<", "<< mochila[1] << ", " << mochila[2]<< "]."<<endl; 






    return 0;
}