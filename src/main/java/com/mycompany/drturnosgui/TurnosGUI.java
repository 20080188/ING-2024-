package com.mycompany.drturnosgui;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TurnosGUI extends javax.swing.JFrame {
    
    //Sets para guardar turnos, clientes y obras sociales:
    private final Set<String> turnosSet = new HashSet<>();
    public static Set<Cliente> clientes = new HashSet<>();
    public static Set<ObraSocial> obrasSociales = new HashSet<>();
    //private JTable table;
    private DefaultTableModel model;
     
        
    public TurnosGUI() {
        cargarHashSets();
        initComponents();
        model = (DefaultTableModel) tblTurnos.getModel();
        loadTableData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTurnos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnPacientes = new javax.swing.JButton();
        btnObrasSociales = new javax.swing.JButton();
        btnAgregarTurno = new javax.swing.JButton();
        btnEliminarTurno = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTurnos.setBackground(new java.awt.Color(204, 255, 204));
        tblTurnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Horario", "DNI", "Nombre", "Telefono", "Obra social", "Motivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTurnos.setGridColor(new java.awt.Color(0, 102, 102));
        tblTurnos.setSelectionBackground(new java.awt.Color(153, 255, 153));
        jScrollPane2.setViewportView(tblTurnos);

        PanelPrincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 550, 570));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        btnPacientes.setBackground(new java.awt.Color(0, 204, 153));
        btnPacientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPacientes.setForeground(new java.awt.Color(255, 255, 255));
        btnPacientes.setText("Pacientes");
        btnPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesActionPerformed(evt);
            }
        });

        btnObrasSociales.setBackground(new java.awt.Color(0, 204, 153));
        btnObrasSociales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnObrasSociales.setForeground(new java.awt.Color(255, 255, 255));
        btnObrasSociales.setText("Obras sociales");
        btnObrasSociales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrasSocialesActionPerformed(evt);
            }
        });

        btnAgregarTurno.setBackground(new java.awt.Color(0, 204, 153));
        btnAgregarTurno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarTurno.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarTurno.setText("Agregar/Modificar");
        btnAgregarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTurnoActionPerformed(evt);
            }
        });

        btnEliminarTurno.setBackground(new java.awt.Color(0, 204, 153));
        btnEliminarTurno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarTurno.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarTurno.setText("Eliminar");
        btnEliminarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTurnoActionPerformed(evt);
            }
        });

        btn_cerrar.setBackground(new java.awt.Color(0, 204, 153));
        btn_cerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnObrasSociales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnPacientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnObrasSociales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarTurno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarTurno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cerrar)
                .addContainerGap())
        );

        PanelPrincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodo llamado al presionar el boton "Agregar/Modificar"
     * @param evt 
     */
    private void btnAgregarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTurnoActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblTurnos.getSelectedRow();
        if(selectedRow != -1){
            DefaultTableModel model = (DefaultTableModel) tblTurnos.getModel();
            ModificarTurnosGUI modificarTurnoGUI = new ModificarTurnosGUI(model, selectedRow, clientes, obrasSociales);
            modificarTurnoGUI.setVisible(true);
            modificarTurnoGUI.setLocationRelativeTo(null);
        }else{
            showError("Selecciona un turno para modificar.");
        }
        
    }//GEN-LAST:event_btnAgregarTurnoActionPerformed
    
    /**
     * Metodo llamado al presionar el boton "Pacientes"
     * @param evt 
     */
    private void btnPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesActionPerformed
        ClientesGUI clientesGUI = new ClientesGUI(clientes, obrasSociales);
        clientesGUI.setVisible(true);
        clientesGUI.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPacientesActionPerformed
    
    /**
     * Metodo llamado al presionar el boton "Obras sociales"
     * @param evt 
     */
    private void btnObrasSocialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrasSocialesActionPerformed
        // TODO add your handling code here:
        ObrasSocialesGUI obrasocialesGUI = new ObrasSocialesGUI(obrasSociales);
        obrasocialesGUI.setVisible(true);
        obrasocialesGUI.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnObrasSocialesActionPerformed
    
    /**
     * Metodo llamado al cerrar la ventana
     * @param evt 
     */
    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        // TODO add your handling code here:
        guardarHashSets();
        dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed
    
    /**
     * Metodo llamado al presionar el boton "Eliminar"
     * @param evt 
     */
    private void btnEliminarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTurnoActionPerformed
        // TODO add your handling code here:
        limpiarCamposSeleccionados();
    }//GEN-LAST:event_btnEliminarTurnoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginGUI loginGUI = new LoginGUI();
                loginGUI.setVisible(true);
                loginGUI.setLocationRelativeTo(null);
            }
        });
    }
    
    /**
     * Borra los campos de la tabla
     */
    private void limpiarCamposSeleccionados() {
        int selectedRow = tblTurnos.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tblTurnos.getModel();
            String fecha = model.getValueAt(selectedRow, 0).toString();
            String hora = model.getValueAt(selectedRow, 1).toString();
            String dni = model.getValueAt(selectedRow, 2).toString();
            
            model.setValueAt("", selectedRow, 2); // DNI
            model.setValueAt("", selectedRow, 3); // Nombre
            model.setValueAt("", selectedRow, 4); // Teléfono
            model.setValueAt("", selectedRow, 5); // Obra Social
            model.setValueAt("", selectedRow, 6); // Motivo
            
            eliminarTurnoEnArchivo(fecha, hora, dni);
            
        } else {
            showError("Selecciona un turno para limpiar los campos.");
        }
    }
    
    /**
     * Borra los campos de la tabla en el archivo 
     * @param fecha
     * @param hora
     * @param dni 
     */
    private void eliminarTurnoEnArchivo(String fecha, String hora, String dni) {
       try {
           BufferedReader br = new BufferedReader(new FileReader("turnos.txt"));
           String line;
           StringBuilder fileContent = new StringBuilder();

            while ((line = br.readLine()) != null) {
               String[] fields = line.split(", ");
               if (fields.length < 3 || !fecha.equals(fields[0]) || !hora.equals(fields[1]) || !dni.equals(fields[2])) {
                   fileContent.append(line).append("\n");
               } else {
                   // Crear una nueva línea con los primeros dos campos y el resto en blanco
                   String newLine = fields[0] + ", " + fields[1] + ", , , , , ";
                   fileContent.append(newLine).append("\n");
               }
            }
           br.close();

           Files.write(Paths.get("turnos.txt"), fileContent.toString().getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
           loadTableData();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
    
    /**
     * Carga los datos del archivo a la tabla
     */
    private void loadTableData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("turnos.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(", ");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fecha = LocalDate.parse(fields[0], formatter);
                LocalDate now = LocalDate.now();

                if (fields.length == 1) {
                    if (!fecha.isBefore(now)) {
                        model.addRow(fields);
                    }
                }

                if (fields.length >= 2) {
                    if (!fecha.isBefore(now)) {
                        model.addRow(fields);
                        String hora = fields[1];
                        String turnoKey = fecha + ", " + hora;
                        turnosSet.add(turnoKey);
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Recarga los datos del archivo a la tabla
     */
    public void actualizarTabla() {
        loadTableData(); // Recargar datos en la tabla
    }
    
    /**
     * Muestra un mensaje de error
     * @param message
     */
    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    private void guardarHashSet(Set<? extends Serializable> set, String fileName) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(set);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private <T extends Serializable> Set<T> cargarHashSet(String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Set<T> setDeserializado = (Set<T>) objectInputStream.readObject();
            objectInputStream.close();
            return setDeserializado;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * Guarda las obras sociales y clientes de los Sets en los archivos obrasSociales.ser y clientes.ser
     */
    public void guardarHashSets(){
        guardarHashSet(obrasSociales, "obrasSociales.ser");
        guardarHashSet(clientes, "clientes.ser");
    }
    
    /**
     * Carga las obras sociales y clientes de los archivos obrasSociales.ser y clientes.ser en los Sets
     */
    public void cargarHashSets() {
        clientes = cargarHashSet("clientes.ser");
        obrasSociales = cargarHashSet("obrasSociales.ser");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btnAgregarTurno;
    private javax.swing.JButton btnEliminarTurno;
    private javax.swing.JButton btnObrasSociales;
    private javax.swing.JButton btnPacientes;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTurnos;
    // End of variables declaration//GEN-END:variables
}
