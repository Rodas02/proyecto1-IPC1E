package todoClientes;

import javax.swing.DefaultComboBoxModel;

public class ClienteListModel extends DefaultComboBoxModel<Cliente> {

    private Cliente[] clientes;

    public ClienteListModel(Cliente[] clientes) {
        this.clientes = clientes;
    }
    
//Overrride para seleccionar el elemento del combobox
    @Override
    public Cliente getElementAt(int index) {
        return clientes[index];
    }

    @Override
    public int getSize() {
        int largo = 0;

        for (Cliente cliente : clientes) {
            if (cliente != null) {
                largo++;
            }
        }
        return largo;
    }

}
