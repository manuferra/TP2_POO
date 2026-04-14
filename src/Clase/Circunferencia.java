package Clase;

public class Circunferencia extends Figura {
    //Como esta clase hereda los atributos y metodos de Clase.Figura
    //No necesita definirlos tambien aca
    //La herencia es como cebollas TIENEN CAPAS

    private double radio;

    public Circunferencia(double radio){
        super("Circulo");//LLama al padre con super y lo construye
        this.radio = radio;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radio, 2);
    }
    public double getPerimetro(){
        return Math.PI*2*this.radio;
    }

}
