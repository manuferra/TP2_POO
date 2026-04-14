package EJ1;

public class Coleccion {
    private Object[] arregloElementos;
    private int pos;
    public Coleccion(int tamano){
        this.arregloElementos = new Object[tamano];
        this.pos = 0;
    }
    public Object getElement(int pos){
        if(pos >= 0 && pos < arregloElementos.length)
            return arregloElementos[pos];
        else return null;
    }
    public void addElement(Object element){
        if(pos == arregloElementos.length){//Se fue de rango
            Object[] aux = new Object[this.arregloElementos.length * 2];
            for(int i = 0; i <= pos; i++){
                aux[i] = arregloElementos[i];
            }
            this.arregloElementos = aux;
        }
        //Este if se encarga de duplicar el tamaño del arreglo para seguir sumando elementos
        //Por mas de irse de rango en el arreglo creado originalmente
        //Crea un arreglo el doble de grande ( en este caso ) y copia todos los elementos
        //Por ultimo, actualiza la referencia de la clase al nuevo arreglo, más grande
        this.arregloElementos[pos++] = element;

    }
    public int getSize(){
        return this.arregloElementos.length;
    }

}
