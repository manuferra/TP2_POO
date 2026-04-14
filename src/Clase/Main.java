package Clase;

class Main{
    public static void imprimir(Figura cc){
        System.out.println("La figura "+cc.getNombre()+
                        " tiene un área de "+cc.getArea());
        System.out.print(cc.getDatos());
    }

    public static void main(String[] args){
        Circunferencia circ = new Circunferencia(10);
        imprimir(circ);

    }
}