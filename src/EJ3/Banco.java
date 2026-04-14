package EJ3;

import java.util.ArrayList;

public class Banco {
    /*La funcionalidad mínima que debe soportar el sistema es
    crear cajas de ahorro,
    depositar y extraer sobre una cuenta en particular,
    retornar el saldo de una cuenta (dinero disponible),
    listar las cuentas de un cliente
    y cerrar cuentas.*/

    private ArrayList<Cliente> listaClientes;

    public Banco(){
        listaClientes = null;
    }
    public int saberSaldo(Cliente client){
        return //listaclientes.at(client).getSaldo();
    }
    public void depositarSaldo(Cliente client, int monto){
        client.depositar(monto);
    }
    public void extraerSaldo(Cliente client, int monto){
        client.extraer(monto);
    }
    public void cerrarCuenta(Cliente client){

    }
    public void listarCuentas(Cliente client){
        client.mostrarCuentas();
    }


}
