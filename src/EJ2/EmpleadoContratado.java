package EJ2;

public class EmpleadoContratado extends Empleado{
    private int horasExtras;
    private int pagaExtra;
    public EmpleadoContratado(int sueldoFijo, int horasExtras, int pagaExtra){
        this.horasExtras = horasExtras;
        this.pagaExtra = pagaExtra;
        super(sueldoFijo);
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public EmpleadoContratado setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
        return this;
    }

    public int getPagaExtra() {
        return pagaExtra;
    }

    @Override
    public int getSalarioSemanal(){
        return super.getSalarioSemanal()+this.horasExtras*this.pagaExtra;
    }
}
