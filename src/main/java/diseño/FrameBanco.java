package diseño;

import todoClientes.Cliente;
import todoClientes.ClienteListModel;
import todoClientes.DatosTableModel;
import todoCuentas.Cuenta;
import todoCuentas.CuentasTableModel;
import java.util.UUID;
import static java.util.UUID.randomUUID;
import javax.swing.JOptionPane;
import todoDeposito.Deposito;
import todoDeposito.DepositoListModel;
import todoHistorial.HistorialTableModel;
import todoTransferencia.DestinoListModel;
import todoTransferencia.OrigenListModel;

public class FrameBanco extends javax.swing.JFrame {

    //Arreglo de clientes
    Cliente[] clientes = new Cliente[5];

    //Arreglo de cuentas
    Cuenta[] cuentas = new Cuenta[25];

    //Creación de la lista para enviar al combobox de crear cuenta
    ClienteListModel listModel = new ClienteListModel(clientes);

    //Creación del modelo tabla para enviar los datos del cliente a la tabla donde se visualizan
    DatosTableModel modeloTabla = new DatosTableModel();

    //Creacion del modelo tabla para enviar el id de la cuenta cuando se busque con un CUI en especifico
    CuentasTableModel modeloTablaCuentas = new CuentasTableModel();

    //Creacion de la lista para enviar los datos al combobox de deposito
    DepositoListModel modeloListaCuentasDeposito = new DepositoListModel(cuentas);

    OrigenListModel modeloListaCuentasOrigen = new OrigenListModel(cuentas);
    DestinoListModel modeloListaCuentasDestino = new DestinoListModel(cuentas);

    HistorialTableModel modeloTablaHistorial = new HistorialTableModel();

    int contador = 0;

    public FrameBanco() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCui = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnCrearCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        btnCrearCuenta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbCuenta = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtMontoDepo = new javax.swing.JTextField();
        btnDepositar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cmbOrigen = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbDestino = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnTrans = new javax.swing.JButton();
        txtMontoTrans = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cmbCDeb = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cmbServ = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtMontoServ = new javax.swing.JTextField();
        btnServ = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCuiT = new javax.swing.JTextField();
        txtNomT = new javax.swing.JTextField();
        txtApeT = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CUI");

        txtCui.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Apellido");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnCrearCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCrearCliente.setText("Crear");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCui)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel3))
                    .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCrearCliente)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registar Cliente", jPanel2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Cliente");

        cmbClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbClientes.setModel(listModel);

        btnCrearCuenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCrearCuenta.setText("Crear");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(46, 46, 46)
                .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnCrearCuenta)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear Cuenta", jPanel1);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(modeloTabla);
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("CUI");

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar Cuentas Asociadas");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable2.setModel(modeloTablaCuentas);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(106, 106, 106)
                                    .addComponent(jLabel5))
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
        );

        jTabbedPane1.addTab("Ver Cliente", jPanel3);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Cuenta");

        cmbCuenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbCuenta.setModel(modeloListaCuentasDeposito);
        cmbCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCuentaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Monto");

        txtMontoDepo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnDepositar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDepositar.setText("Aceptar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(338, 338, 338))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMontoDepo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(218, 218, 218))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cmbCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(82, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtMontoDepo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnDepositar)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Deposito Monetario", jPanel4);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Cuenta de Origen");

        cmbOrigen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbOrigen.setModel(modeloListaCuentasOrigen);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Cuenta de Destino");

        cmbDestino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbDestino.setModel(modeloListaCuentasDestino);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Monto");

        btnTrans.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTrans.setText("Aceptar");
        btnTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransActionPerformed(evt);
            }
        });

        txtMontoTrans.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(txtMontoTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel10)))
                .addContainerGap(318, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(cmbOrigen, 0, 699, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(btnTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMontoTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnTrans)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transferencia", jPanel5);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Cuenta a Debitar");

        cmbCDeb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbCDeb.setModel(listModel);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Tipo de Servicio");

        cmbServ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbServ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luz Eléctrica", "Agua", "Servicio Telefónico" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Monto");

        txtMontoServ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnServ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnServ.setText("Aceptar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(429, 429, 429))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(cmbCDeb, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addComponent(jLabel12))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(cmbServ, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(txtMontoServ, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(btnServ)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCDeb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(cmbServ, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(txtMontoServ, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnServ)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pago de Servicios", jPanel6);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Id Cuenta");

        txtID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnMostrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMostrar.setText("Mostrar Transacciones");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("CUI");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Nombre");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Apellido");

        txtCuiT.setEditable(false);
        txtCuiT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtNomT.setEditable(false);
        txtNomT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtApeT.setEditable(false);
        txtApeT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTable3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable3.setModel( modeloTablaHistorial);
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel15))
                                    .addComponent(txtCuiT, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel16))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(txtNomT, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtApeT, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel17))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMostrar)))
                        .addGap(0, 189, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtApeT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCuiT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Historial de Transacciones", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuiActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Creacion de la variable necesaria para poder buscar las cuentas asociadas
        String cuiCliente = this.txtBuscar.getText().trim();

        //Condiciones para la busqueda adecuada de las cuentas dependiendo del numero de CUI ingresado
        if (!cuiCliente.isEmpty()) {
            for (Cliente cliente : clientes) {
                if (cliente != null) {
                    if (cliente.getCui().equals(cuiCliente)) {
                        modeloTablaCuentas.setCuentas(cliente.getCuentasCliente());
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Escriba el CUI de un Cliente", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        //Creación de cada una de las variables que necesitan almacenar los datos para poder crear un cliente
        String CUI = this.txtCui.getText().trim();
        String nombreCliente = this.txtNombre.getText().trim();
        String apellidoCliente = this.txtApellido.getText().trim();

        //Condiciones y creacion del cliente en base al constructor creado en su propia clase
        if (!CUI.isEmpty() && !nombreCliente.isEmpty() && !apellidoCliente.isEmpty()) {
            for (int i = 0; i < clientes.length; i++) {
                if (!mismoCUI()) {
                    if (clientes[i] == null) {
                        clientes[i] = new Cliente(CUI, nombreCliente, apellidoCliente);
                        JOptionPane.showMessageDialog(this, "Cliente creado exitosamente", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se pueden crear clientes con CUI duplicados. El CUI ingresado ya existe en el sistema", "Advertencia", JOptionPane.ERROR_MESSAGE);
                    break;
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "Escriba los datos del cliente", "Información", JOptionPane.INFORMATION_MESSAGE);
        }

        //Validar que no se creen más de 5 clientes
        if (clientes[4] != null) {
            JOptionPane.showMessageDialog(this, "No es posible crear más clientes.", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }

        modeloTabla.setClientes(clientes);


    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        Cliente cuentasCliente = clientes[this.cmbClientes.getSelectedIndex()];
        Cuenta cuentaCliente = new Cuenta();
        UUID id = randomUUID();
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                if (cuentasDisponibles()) {
                    cuentaCliente.setId(id);
                    cuentaCliente.setCui(clientes[this.cmbClientes.getSelectedIndex()].getCui());
                    cuentaCliente.setSaldo(0);
                    cuentaCliente.setNombre(clientes[this.cmbClientes.getSelectedIndex()].getNombre());
                    cuentaCliente.setApellido(clientes[this.cmbClientes.getSelectedIndex()].getApellido());
                    cuentasCliente.registrarCuenta(cuentaCliente);
                    cuentas[contador] = new Cuenta(cuentaCliente.getId(), cuentaCliente.getCui(), cuentaCliente.getSaldo(), cuentaCliente.getNombre(), cuentaCliente.getApellido());
                    contador++;
                    JOptionPane.showMessageDialog(this, "Cuenta creada exitosamente", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
                    break;

                }
            }
        }
    }//GEN-LAST:event_btnCrearCuentaActionPerformed
    
//Validar que no se creen más de 5 cuentas
    private boolean cuentasDisponibles() {
        boolean disponible = false;
        Cuenta[] c = clientes[this.cmbClientes.getSelectedIndex()].getCuentasCliente();
        if (c[4] == null) {
            disponible = true;
        } else {
            JOptionPane.showMessageDialog(this, "No es posible crear más cuentas.", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
        return disponible;
    }
    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        Cuenta cuenta = modeloListaCuentasDeposito.getElementAt(cmbCuenta.getSelectedIndex());
        double monto = Double.parseDouble(this.txtMontoDepo.getText());
        Deposito deposito = new Deposito();

        if (!cmbCuenta.getSelectedItem().toString().isEmpty() && !this.txtMontoDepo.getText().isEmpty()) {
            if (monto > 0) {
                deposito.setDeposito(monto);
                cuenta.registrarDeposito(deposito);
                JOptionPane.showMessageDialog(this, "Deposito realizado exitosamente", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "El monto debe ser mayor a cero", "Advertencia", JOptionPane.ERROR_MESSAGE);

            }

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente o ingrese un monto", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }

        //JOptionPane.showMessageDialog(this, cuenta.getSaldo(), this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void cmbCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCuentaActionPerformed

    }//GEN-LAST:event_cmbCuentaActionPerformed

    private void btnTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransActionPerformed

    }//GEN-LAST:event_btnTransActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        String idCliente = this.txtBuscar.getText().trim();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private boolean mismoCUI() {
        boolean mismo = false;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                if (clientes[i].getCui().equals(this.txtCui.getText())) {
                    mismo = true;
                }
            }
        }
        return mismo;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrameBanco().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnServ;
    private javax.swing.JButton btnTrans;
    private javax.swing.JComboBox<Cliente> cmbCDeb;
    private javax.swing.JComboBox<Cliente> cmbClientes;
    private javax.swing.JComboBox<Cuenta> cmbCuenta;
    private javax.swing.JComboBox<Cuenta> cmbDestino;
    private javax.swing.JComboBox<Cuenta> cmbOrigen;
    private javax.swing.JComboBox<String> cmbServ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField txtApeT;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCui;
    private javax.swing.JTextField txtCuiT;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMontoDepo;
    private javax.swing.JTextField txtMontoServ;
    private javax.swing.JTextField txtMontoTrans;
    private javax.swing.JTextField txtNomT;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
