package todoCuentas;

import java.util.UUID;
import todoDeposito.Deposito;

public class Cuenta {

    private UUID id;
    private String cui;
    private String nombre;
    private String apellido;
    private double saldo;
    private Deposito[] depositos;

    //Concstructor con todos los datos necesarios para crear la cuenta
    public Cuenta(UUID id, String cui, double saldo, String nombre, String apellido) {
        this.id = id;
        this.cui = cui ;
        this.saldo = saldo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.depositos = new Deposito[]{};
    }

//COnstructor vacío
    public Cuenta() {

    }

    public void registrarDeposito(Deposito deposito) {
        saldo = saldo + deposito.getDeposito();
    }

    public UUID getId() {
        return id;
    }

    public Deposito[] getDepositos() {
        return depositos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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
    
    

    //Overrride para enviar los datos al combobox de depositar
    @Override
    public String toString() {
        return id + " - Cuenta de " + nombre;
    }

}
