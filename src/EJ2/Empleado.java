package EJ2;

public class Empleado {
    private int sueldoFijo;
    public Empleado(int sueldoFijo){
        this.sueldoFijo = sueldoFijo;
    }

    public int getSueldoFijo() {
        return sueldoFijo;
    }

    public Empleado setSueldoFijo(int sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
        return this;
    }

    public int getSalarioSemanal(){
        return this.sueldoFijo;
    }
}
