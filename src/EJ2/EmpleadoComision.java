package EJ2;

public class EmpleadoComision extends Empleado{
    private int ventas;
    private int pagaVenta;
    public EmpleadoComision(int sueldoFijo, int ventas, int pagaVenta){
        this.ventas = ventas;
        this.pagaVenta = pagaVenta;
        super(sueldoFijo);
    }

    @Override
    public int getSalarioSemanal(){
        return super.getSalarioSemanal()+this.ventas*this.pagaVenta;
    }
}
