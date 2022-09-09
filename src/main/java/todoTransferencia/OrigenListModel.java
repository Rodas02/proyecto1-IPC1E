/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todoTransferencia;

import javax.swing.DefaultComboBoxModel;
import todoCuentas.Cuenta;

/**
 *
 * @author Celeste Rodas
 */
public class OrigenListModel extends DefaultComboBoxModel<Cuenta> {
    private Cuenta[] cuentas;

    public OrigenListModel(Cuenta[] cuentas) {
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
