package vista;

import controlador.CConexion;
import controlador.TipoActivo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import java.util.Map;
import javax.swing.JOptionPane;

public class Registrar extends javax.swing.JFrame 
{
    private CConexion objetoConexion;
    private final int idUsuario;
    
    public Registrar(int idUsuario) 
    {
        initComponents();
        this.idUsuario = idUsuario;
        objetoConexion = new CConexion();
        llenarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 233, 95));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        jLabel1.setText("Registrar activo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tipo activo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Serial");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Marca");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Observaciones");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Crear activo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(61, 61, 61)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButton1)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        TipoActivo tipoSeleccionado = (TipoActivo) jComboBox1.getSelectedItem();
    
        // Obtener el ID y el nombre del tipo de activo seleccionado
        int idTipoActivo = tipoSeleccionado.getIdTipoActivo();
        String nombreTipoActivo = tipoSeleccionado.getNombreTipoActivo();

        // Hacer lo que necesites con el ID y el nombre del tipo de activo
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    TipoActivo tipoSeleccionado = (TipoActivo) jComboBox1.getSelectedItem();

    // Obtener el ID del tipo de activo seleccionado
    int idTipoActivo = tipoSeleccionado.getIdTipoActivo();
    String serial = jTextField2.getText();
    String marca = jTextField3.getText();
    String observaciones = jTextField4.getText();

  

    try (Connection conexion = objetoConexion.establecerConexion()) {
        if (conexion != null) {
            // Crear la consulta SQL para insertar un nuevo activo
            String sqlInsertActivo = "INSERT INTO Activo (IdTipoActivo, SerialMaquina, Marca, Observaciones) VALUES (?, ?, ?, ?)";

            try (PreparedStatement statementInsertActivo = conexion.prepareStatement(sqlInsertActivo, Statement.RETURN_GENERATED_KEYS)) {
                // Establecer los valores de los parámetros en la consulta
                statementInsertActivo.setInt(1, idTipoActivo);  
                statementInsertActivo.setString(2, serial);
                statementInsertActivo.setString(3, marca);
                statementInsertActivo.setString(4, observaciones);

                // Ejecutar la consulta
                int filasAfectadasInsertActivo = statementInsertActivo.executeUpdate();

                if (filasAfectadasInsertActivo > 0) {
                    // Obtener el ID del activo recién insertado
                    ResultSet generatedKeys = statementInsertActivo.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        int idActivo = generatedKeys.getInt(1);

                        // Ahora, insertar en la tabla intermedia
                        String sqlInsertCantidadDeActivos = "INSERT INTO CantidadDeActivos (IdActivo, IdUsuario) VALUES (?, ?)";
                        try (PreparedStatement statementInsertCantidadDeActivos = conexion.prepareStatement(sqlInsertCantidadDeActivos)) {
                            statementInsertCantidadDeActivos.setInt(1, idActivo);
                            // Aquí debes establecer el ID del usuario. Por ahora, asumiré que es 1.
                            statementInsertCantidadDeActivos.setInt(2, idUsuario);

                            int filasAfectadasInsertCantidadDeActivos = statementInsertCantidadDeActivos.executeUpdate();

                            if (filasAfectadasInsertCantidadDeActivos > 0) {
                                System.out.println("Activo y relación con usuario creadas exitosamente.");
                                dispose();
                                // Abrir la ventana de Perfil nuevamente
                                Map<String, Object> usuarioLogeado = new HashMap<>();
                                usuarioLogeado.put("IdUsuario", idUsuario); // Reemplaza con el ID del usuario
                                usuarioLogeado.put("Nombre", "NombreUsuario");
                                usuarioLogeado.put("Apellido", "ApellidoUsuario");
                                usuarioLogeado.put("Correo", "correo@example.com");
                                usuarioLogeado.put("Telefono", "123456789");
                                usuarioLogeado.put("TipoDocumento", "Cedula");
                                usuarioLogeado.put("Documento", "1234567890");
                                new Perfil(usuarioLogeado).setVisible(true);
                                // ... otras propiedades del usuario
                            } else {
                                System.out.println("No se pudo crear la relación con el usuario.");
                            }
                        }
                    }
                } else {
                    System.out.println("No se pudo crear el activo.");
                }
            }
        } else {
            // Manejar el caso en que no se pueda establecer la conexión
            System.out.println("No se pudo establecer la conexión a la base de datos.");
        }
    } catch (SQLException e) {
    if (e.getMessage().contains("No se permite ingresar un activo con un serial de máquina duplicado.")) {
        // Muestra un mensaje de error
        JOptionPane.showMessageDialog(this, "No se permite ingresar un activo con un serial de máquina duplicado.", "Error", JOptionPane.ERROR_MESSAGE);
               // Cierra la interfaz actual
               this.dispose();
               
    } else {
        e.printStackTrace(); // Manejar la excepción adecuadamente en tu aplicación      
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    }
 private void llenarComboBox() {
    Connection conexion = objetoConexion.establecerConexion();
    if (conexion != null) {
        // Conectar a la base de datos y recuperar los tipos de activos
        List<TipoActivo> tiposDeActivos = obtenerTiposDeActivosDesdeBD(conexion);

        // Limpiar el ComboBox
        jComboBox1.removeAllItems();

        // Crear un modelo para el ComboBox
        DefaultComboBoxModel<TipoActivo> modeloComboBox = new DefaultComboBoxModel<>();

        // Llenar el modelo con los tipos de activos
        for (TipoActivo tipo : tiposDeActivos) {
            modeloComboBox.addElement(tipo);
        }

        // Establecer el modelo en el ComboBox
        jComboBox1.setModel(modeloComboBox);
    } else {
        // Manejar el caso en el que no se pueda establecer la conexión
        System.out.println("No se pudo establecer la conexión a la base de datos.");
    }
}

     
     private List<TipoActivo> obtenerTiposDeActivosDesdeBD(Connection conexion) 
     {
        List<TipoActivo> tiposDeActivos = new ArrayList<>();

        try (PreparedStatement statement = conexion.prepareStatement("SELECT * FROM TipoActivo");
         ResultSet resultSet = statement.executeQuery()) 
        {

        while (resultSet.next()) 
        {
            int idTipoActivo = resultSet.getInt("IdTipoActivo");
            String nombreTipoActivo = resultSet.getString("NombreTipoActivo");
            TipoActivo tipoActivo = new TipoActivo(idTipoActivo, nombreTipoActivo);
            tiposDeActivos.add(tipoActivo);
        }
        } 
        catch (SQLException e) 
        {
        e.printStackTrace(); // Manejar la excepción adecuadamente en tu aplicación
        }
    return tiposDeActivos;
    }

    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            // Modifica esto según el ID del usuario que desees pasar
            int idUsuario = 1; // Reemplaza esto con el ID del usuario que corresponda
            new Registrar(idUsuario).setVisible(true);
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<TipoActivo> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
