
package com.mycompany.drturnosgui;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Isaias
 */
public class ModificarTurnosGUI extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    private int selectedRow;
    private Set<ObraSocial> obrasSociales;
    private Set<Cliente> clientes;

    /**
     * Constructor ModificarTurnosGUI
     * @param model
     * @param selectedRow
     * @param clientes
     * @param obrasSociales 
     */
    public ModificarTurnosGUI(DefaultTableModel model, int selectedRow, Set<Cliente> clientes, Set<ObraSocial> obrasSociales) {
        this.model = model;
        this.selectedRow = selectedRow;
        this.clientes = clientes;
        this.obrasSociales = obrasSociales;
        
        //Inicializar componentes de la ventana ModificarTurnosGUI
        initComponents();
       
        //Carga las obras sociales del set al combo box de obras sociales
        for (ObraSocial obraSocial : obrasSociales) {
            campo_obra_social.addItem(obraSocial.getObraSocial());
        }
        
        //Inicializa los valores de los campos con la informacion del cliente seleccionado en la tabla (fila)
        campo_dia.setText((String) model.getValueAt(selectedRow, 0));
        campo_hora.setText((String) model.getValueAt(selectedRow, 1));
        campo_dni.setText((String) model.getValueAt(selectedRow, 2));
        campo_nombre.setText((String) model.getValueAt(selectedRow, 3));
        campo_telefono.setText((String) model.getValueAt(selectedRow, 4));
        campo_obra_social.setSelectedItem((String) model.getValueAt(selectedRow, 5));
        campo_motivo.setText((String) model.getValueAt(selectedRow, 6));
        
        //Establecer los campos fecha y hora como no modificables
        campo_dia.setEditable(false);
        campo_hora.setEditable(false);
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campo_obra_social = new javax.swing.JComboBox<>();
        campo_dia = new javax.swing.JTextField();
        lbl_hora = new javax.swing.JLabel();
        campo_hora = new javax.swing.JTextField();
        lbl_dia = new javax.swing.JLabel();
        campo_dni = new javax.swing.JTextField();
        campo_nombre = new javax.swing.JTextField();
        campo_telefono = new javax.swing.JTextField();
        campo_motivo = new javax.swing.JTextField();
        lbl_dni = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_motivo = new javax.swing.JLabel();
        lbl_obra_social = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campo_obra_social.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(campo_obra_social, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 150, 30));
        jPanel1.add(campo_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 200, 40));

        lbl_hora.setText("Hora");
        jPanel1.add(lbl_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 100, 30));
        jPanel1.add(campo_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 200, 40));

        lbl_dia.setText("Dia");
        jPanel1.add(lbl_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 30));
        jPanel1.add(campo_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 200, 40));
        jPanel1.add(campo_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 200, 40));
        jPanel1.add(campo_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 200, 40));
        jPanel1.add(campo_motivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 200, 40));

        lbl_dni.setText("Dni");
        jPanel1.add(lbl_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 100, 30));

        lbl_nombre.setText("Nombre");
        jPanel1.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, 30));

        lbl_telefono.setText("Telefono");
        jPanel1.add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 100, 30));

        lbl_motivo.setText("Motivo");
        jPanel1.add(lbl_motivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 100, 30));

        lbl_obra_social.setText("Obra social");
        jPanel1.add(lbl_obra_social, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 100, 30));

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 130, 40));

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Metodo llamado al presionar el boton "Buscar"
     * @param evt 
     */
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        String dniBuscado = campo_dni.getText();
        boolean dniRegistrado = false;
        
        for (Cliente cliente : clientes){
            if (cliente.getDni().equals(dniBuscado)){
                campo_nombre.setText(cliente.getNombre());
                campo_telefono.setText(cliente.getTelefono());
                campo_obra_social.setSelectedItem(cliente.getObraSocial());
                dniRegistrado = true;
                break;
            }
            if (!dniRegistrado){
                JOptionPane.showMessageDialog(this, "Cliente no registrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btn_buscarActionPerformed
    
    /**
     * Metodo llamado al presionar el boton "Guardar"
     * @param evt 
     */
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        String nuevoDia = campo_dia.getText();
        String nuevaHora = campo_hora.getText();
        String nuevoDni = campo_dni.getText();
        String nuevoNombre = campo_nombre.getText();
        String nuevoTelefono = campo_telefono.getText();
        String nuevaObrasocial = (String) campo_obra_social.getSelectedItem();
        String nuevoMotivo = campo_motivo.getText();
        
        boolean dniRegistrado = false;
        for (Cliente cliente : clientes){
            if (cliente.getDni().equals(nuevoDni)){
                dniRegistrado = true;
                break;
            }
        }
        
        if (!dniRegistrado){
            JOptionPane.showMessageDialog(this, "Cliente no registrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        model.setValueAt(nuevoDia, selectedRow, 0);
        model.setValueAt(nuevaHora, selectedRow, 1);
        model.setValueAt(nuevoDni, selectedRow, 2);
        model.setValueAt(nuevoNombre, selectedRow, 3);
        model.setValueAt(nuevoTelefono, selectedRow, 4);
        model.setValueAt(nuevaObrasocial, selectedRow, 5);
        model.setValueAt(nuevoMotivo, selectedRow, 6);
        
        Cliente nuevoCliente = new Cliente(nuevoDni, nuevoNombre, nuevoTelefono, nuevaObrasocial);
        if (clientes.contains(nuevoCliente)){
            clientes.add(nuevoCliente);
        }
        
        try{
            FileWriter fileWriter = new FileWriter("turnos.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            for (int i = 0; i < model.getRowCount(); i++){
                for (int j = 0; j < model.getColumnCount(); j++){
                    Object value = model.getValueAt(i, j);
                    if (value != null){
                        bufferedWriter.write(value.toString());
                    }
                    if (j != model.getColumnCount() - 1){
                        bufferedWriter.write(", ");
                    }
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        dispose();
    }//GEN-LAST:event_btn_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JTextField campo_dia;
    private javax.swing.JTextField campo_dni;
    private javax.swing.JTextField campo_hora;
    private javax.swing.JTextField campo_motivo;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JComboBox<String> campo_obra_social;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_dia;
    private javax.swing.JLabel lbl_dni;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_motivo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_obra_social;
    private javax.swing.JLabel lbl_telefono;
    // End of variables declaration//GEN-END:variables
}
