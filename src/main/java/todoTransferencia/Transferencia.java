package todoTransferencia;

import java.util.Date;

public class Transferencia {

    private Date fechaHora;
    private String detalle;
    private double cantidadTransferencia;

    public Transferencia(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Transferencia(double total) {
        this.detalle = "Transferencia";
        this.cantidadTransferencia = total;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public String getDetalle() {
        return detalle;
    }

    public double getCantidadTransferencia() {
        return cantidadTransferencia;
    }

}
