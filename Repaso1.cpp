#include <iostream>
#include <vector>
using namespace std;

struct Empleado_t
{
    string nombre;
    string apellido;
    string fecha_de_nacimiento;
    string sexo;
    int salario;
};

Empleado_t EmpleadoConMayorSueldo(vector <Empleado_t> trabajadores, vector <Empleado_t> &nada)
{
    Empleado_t empleado;
    int ms=0;

    for(int i=0;i<trabajadores.size();i++){
    
    if(trabajadores[i].salario <= 400000){
        nada.push_back(trabajadores[i]);
    }

    if(ms<trabajadores[i].salario){
        ms=trabajadores[i].salario;
        empleado=trabajadores[i];
    }
}



    return empleado;
}

int main(){

    Empleado_t trabajador;
    vector <Empleado_t> empleados;
    vector <Empleado_t> vacio;
    string texto;
    
    trabajador.nombre = "LetalForce";
    trabajador.apellido = "ASKLDKs";
    trabajador.fecha_de_nacimiento = "1/1/2000";
    trabajador.sexo = "Masculino";
    trabajador.salario = 30000;

    empleados.push_back(trabajador);
    
    trabajador.nombre = "Pistolero2008";
    trabajador.apellido = "alsdkLASKd";
    trabajador.fecha_de_nacimiento = "2/1/2000";
    trabajador.sexo = "Masculino";
    trabajador.salario = 400001;

    empleados.push_back(trabajador);

    trabajador.nombre = "Rici";
    trabajador.apellido = "Siacxinni";
    trabajador.fecha_de_nacimiento = "1/4/2000";
    trabajador.sexo = "Masculino";
    trabajador.salario = 200;

    empleados.push_back(trabajador);

    trabajador = EmpleadoConMayorSueldo(empleados, vacio);

    cout<<"el empleado con mayor sueldo es: "<<trabajador.nombre<< " "<< trabajador.apellido << endl<<"Fecha de nacimiento: " << trabajador.fecha_de_nacimiento << endl;
    cout<<"Sexo: "<< trabajador.sexo << endl << "Salario: " <<trabajador.salario<< endl;

    cout<<"----Empleados con salario menor o igual a 400000----"<<endl;
    
    for(int i = 0 ; i<vacio.size(); i++)
    {
        cout<<vacio[i].nombre << " " << vacio[i].apellido <<endl;

    }
    return 0;
}