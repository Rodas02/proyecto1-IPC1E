package todoCuentas;

import javax.swing.table.AbstractTableModel;

public class CuentasTableModel extends AbstractTableModel {

    private final String[] nombreCol = {"Cuentas Asociadas"};
    private Cuenta[] cuentasCliente;

    public void setCuentas(Cuenta[] cuentasCliente) {
        this.cuentasCliente = cuentasCliente;

        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        if (cuentasCliente == null) {
            return 0;
        }
        int largo = 0;
        for (Cuenta cuenta : cuentasCliente) {
            if (cuenta != null) {
                largo++;
            }
        }
        return largo;
    }

    @Override
    public int getColumnCount() {
        return nombreCol.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return switch (col) {
            case 0 ->
                cuentasCliente[row].getId();
            default ->
                "";
        };
    }

    @Override
    public String getColumnName(int column) {
        return nombreCol[column];
    }

}
