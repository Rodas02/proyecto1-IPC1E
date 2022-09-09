package todoHistorial;

import java.text.DateFormat;
import javax.swing.table.AbstractTableModel;
import todoClientes.Cliente;
import todoCuentas.Cuenta;
import todoDeposito.Deposito;
import todoTransferencia.Transferencia;

public class HistorialTableModel extends AbstractTableModel {

    private String[] nombreColumnas = {"ID", "Fecha", "Detalle", "Débito", "Crédito", "Saldo Disponible"};
    private Deposito[] credito;
    private Transferencia[] debitoTransferencia;
    private Cliente[] clientes;
    private Cuenta[] cuentas;

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

   
    
    
    

    @Override
    public int getRowCount() {
        if (credito == null) {
            return 0;
        }
        int largo = 0;
        for (Deposito deposito : credito) {
            if (credito != null) {
                largo++;
            }
        }
        return largo;
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return switch (col) {
            case 0 ->
                cuentas[row].getId();
            case 1 -> 
                DateFormat
                .getDateTimeInstance()
                .format(credito[row].getFechaHora());
            case 2 -> 
                credito[row].getDetalle();
            case 3 ->
                "";
            case 4 ->
                credito[row].getDeposito();
            case 5 ->
                cuentas[row].getSaldo();
            default ->
                "";
        };
    }

    @Override
    public String getColumnName(int column) {
        return nombreColumnas[column];
    }
    
    

}
