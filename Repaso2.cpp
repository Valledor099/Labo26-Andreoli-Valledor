#include <iostream>
#include <vector>
using namespace std;

const int F = 3;
const int C = 4;

struct productos_t{
string nombre;
string codigo_de_barra;
string marca;
int precio;
bool fecha_de_vencimiento;
};

void cargarGondola(productos_t gondola[F][C])
{
    productos_t producto;
    producto.nombre = "fideos";
producto.codigo_de_barra = "123214-12321421";
producto.marca = "Don Vicente";
producto.precio = 1500;
producto.fecha_de_vencimiento = true;
gondola[0][0] = producto;


producto.nombre = "salsa boglonesa";
producto.codigo_de_barra = "123214-12321421";
producto.marca = "La campganola";
producto.precio = 300;
producto.fecha_de_vencimiento = false;
gondola[0][1] = producto;


producto.nombre = "carne picada";
producto.codigo_de_barra = "123214-12321421";
producto.marca = "Coto";
producto.precio = 5000;
producto.fecha_de_vencimiento = true;
gondola[0][2] = producto;

producto.nombre = "Papas fritas";
producto.codigo_de_barra = "123214-12321421";
producto.marca = "Pringles";
producto.precio = 2000;
producto.fecha_de_vencimiento = true;
gondola[0][3] = producto;

producto.nombre = "Leche";
producto.codigo_de_barra = "123214-12321421";
producto.marca = "La serenisima";
producto.precio = 3500;
producto.fecha_de_vencimiento = false;
gondola[1][0] = producto;

producto.nombre = "manteca";
producto.codigo_de_barra = "123214-12321421";
producto.marca = "La manteca dentro de mi";
producto.precio = 500;
producto.fecha_de_vencimiento = true;
gondola[1][1] = producto;

producto.nombre = "sanguche de milanesa";
producto.codigo_de_barra = "123214-12321421";
producto.marca = "Digiovanni";
producto.precio = 5500;
producto.fecha_de_vencimiento = false;
gondola[1][2] = producto;

producto.nombre = "Chocolinas";
producto.codigo_de_barra = "1911-2008";
producto.marca = "Chocolinas";
producto.precio = 140;
producto.fecha_de_vencimiento = true;
gondola[1][3] = producto;

producto.nombre = "chocolate";
producto.codigo_de_barra = "123214-12321421";
producto.marca = "arcor";
producto.precio = 13;
producto.fecha_de_vencimiento = true;
gondola[2][0] = producto;

producto.nombre = "avena";
producto.codigo_de_barra = "123214-12321421";
producto.marca = "coto";
producto.precio = 100;
producto.fecha_de_vencimiento = false;
gondola[2][1] = producto;

producto.nombre = "banana";
producto.codigo_de_barra = "123214-12321421";
producto.marca = "verduleria";
producto.precio = 400;
producto.fecha_de_vencimiento = true;
gondola[2][2] = producto;

producto.nombre = "vainilla";
producto.codigo_de_barra = "123214-12321421";
producto.marca = "Vanella";
producto.precio = 980;
producto.fecha_de_vencimiento = true;
gondola[2][3] = producto;
}


void maxPrecio(int &columna_producto_mayor_precio,productos_t gondola[F][C])
{
    int maxp=0;
    for (int i = 0; i < 3 ; i++) 
    {
        for(int j = 0; j < 4; j++)
        {
            if(maxp < gondola[i][j].precio)
            {
                maxp = gondola[i][j].precio;
                columna_producto_mayor_precio = j;
            }

       

     

        }

    }

}


void prom(int &promedio,productos_t gondola[F][C])
{
    int precios = 0;
    for (int i = 0; i < 3 ; i++) 
    {
        for(int j = 0; j < 4; j++)
        {
         precios+= gondola[i][j].precio;
        }
    }

promedio = precios / 12;
}

void fecha(int &cont,productos_t gondola[F][C]){
    for (int i = 0; i < 3 ; i++) 
    {
        for(int j = 0; j < 4; j++)
        {
            if(gondola[i][j].fecha_de_vencimiento == true)
            {
            cont++;
            }


        }

    }

}



int main (){

productos_t gondola[F][C];
int columna_producto_mayor_precio;
int promedio = 0;
int cont=0;


    cargarGondola(gondola);

    maxPrecio(columna_producto_mayor_precio,gondola);

    prom(promedio,gondola);

    fecha(cont,gondola);


    cout << "Columna con producto de mayor precio: " << columna_producto_mayor_precio<<endl;
    cout << "Producto de la fila 2 columna 3: "<<gondola[1][2].nombre <<endl;
    cout << "Promedio de precios de todo el pasillo: " << promedio << endl;
    cout << "Cantidad de productos con fecha de vencimiento: " << cont <<endl;

    return 0;
}