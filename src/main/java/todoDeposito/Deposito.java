package todoDeposito;

import java.util.Date;

public class Deposito {
   
    private Date fechaHora; 
    private String detalle;
    private double cantidadDepositada; 

    public Deposito() {
        this.fechaHora = new Date();
    }

    public void setDeposito(double monto) {
        this.detalle = "Deposito"; 
        this.cantidadDepositada = monto;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public String getDetalle() {
        return detalle;
    }

    public double getDeposito() {
        return cantidadDepositada;
    }

   
    
    
    
    
}
