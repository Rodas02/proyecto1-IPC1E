
package todoDeposito;

import javax.swing.DefaultComboBoxModel;
import todoCuentas.Cuenta;


public class DepositoListModel extends DefaultComboBoxModel<Cuenta> {
    
    private Cuenta[] cuentas;

    public DepositoListModel(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public Cuenta getElementAt(int index) {
        return cuentas[index];
    }

    @Override
    public int getSize() {
        int largo = 0;

        for (Cuenta cuenta : cuentas) {
            if (cuenta != null) {
                largo++;
            }
        }
        return largo;
    }
    
    
    
    
    
}
