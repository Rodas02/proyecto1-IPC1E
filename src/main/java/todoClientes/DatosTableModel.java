package todoClientes;

import javax.swing.table.AbstractTableModel;


public class DatosTableModel extends AbstractTableModel {
    
    private final String[] nombreColumnas ={"CUI", "Nombre", "Apellido"};
    private Cliente[] clientes;

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
        
        fireTableDataChanged();
    }
    
    

    @Override
    public int getRowCount() {
        if(clientes == null){
            return 0;
        }
        int tamaño = 0;
        for(Cliente cliente : clientes){
            if(cliente != null){
                tamaño++;
            }
        }
        return tamaño;
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length; 
    }

    @Override
    public Object getValueAt(int row, int col) {
        return switch (col) {
            case 0 ->
                clientes[row].getCui();
            case 1 ->
                clientes[row].getNombre();
            case 2 ->
                clientes[row].getApellido();
            default ->
                "";
        };
    }

    @Override
    public String getColumnName(int column) {
        return nombreColumnas[column]; 
    }
    
    
    
}
