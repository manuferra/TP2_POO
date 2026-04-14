package Clase;

public class Figura {
    private String nombre;

    public Figura(String n){
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public Figura setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    //Si bien a la figura no le podes pedir el area o el perimetro pues no esta definido
    //Depende de cada hijo, sigue estando pues es algo que luego
    //se usa como generico al usar figura
    //Se llama control de tipos
    public double getArea(){
        return 0;
    }
    public double getPerimetro(){
        return 0;
    }
    public String getDatos() {
        return this.nombre + "<" + this.getArea() + "," + this.getPerimetro()+">";
    }

}

