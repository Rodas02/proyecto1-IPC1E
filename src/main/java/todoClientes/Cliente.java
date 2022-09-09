package todoClientes;

import java.util.UUID;
import todoCuentas.Cuenta;

public class Cliente {

    private String cui;
    private String nombre;
    private String apellido;
    private Cuenta[] cuentasCliente;

//Constructor Vacío
    public Cliente() {

    }
//COnstructor con todos los datos del cliente

    public Cliente(String cui, String nombre, String apellido) {
        this.cui = cui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentasCliente = new Cuenta[5];
    }
    

    public String getCui() {
        return cui;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cuenta[] getCuentasCliente() {
        return cuentasCliente;
    }

    public void setCuentasCliente(Cuenta[] cuentasCliente) {
        this.cuentasCliente = cuentasCliente;
    }
    
    

    public void registrarCuenta(Cuenta cuenta) {
        for (int i = 0; i < cuentasCliente.length; i++) {
            if (cuentasCliente[i] == null) {
                cuentasCliente[i] = cuenta;
                break;
            }
        }
    }

//Override para enviar los datos al combobox de crear cuenta
    @Override
    public String toString() {
        return cui + " - " + nombre + " " + apellido;

    }

}
