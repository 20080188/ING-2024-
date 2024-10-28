
package com.mycompany.drturnosgui;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Interfaz grafica de obras sociales 
 * @author usuario
 */
public class ObrasSocialesGUI extends javax.swing.JFrame {
    
    private Set<ObraSocial> obrasSociales; //
    private DefaultTableModel tableModel; //Modelo de la tabla
    
    /**
     * Constructor de ObrasSocialesGUI
     * @param obrasSociales 
     */
    public ObrasSocialesGUI(Set<ObraSocial> obrasSociales) {
        this.obrasSociales = obrasSociales;
        if(!obraSocialExists("Particular")){
            this.obrasSociales.add(new ObraSocial("Particular"));
        }
        initComponents();
        loadTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_obra_social = new javax.swing.JTable();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_obra_social.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Nombre"
            }
        ));
        jScrollPane1.setViewportView(tbl_obra_social);
        if (tbl_obra_social.getColumnModel().getColumnCount() > 0) {
            tbl_obra_social.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 400));

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 130, -1));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 420, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        agregarObraSocial();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        int fila = tbl_obra_social.getSelectedRow();
        tableModel.removeRow(fila);
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        GuardarHashSet();
        dispose();
    }//GEN-LAST:event_formWindowClosing



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_obra_social;
    // End of variables declaration//GEN-END:variables

    
    //Metodos
    
    /**
     * Metodo para comprobar si una obra social existe
     * @param particular es el nombre de la obra social
     * @return 
     */
    private boolean obraSocialExists(String nombreObraSocial) {
        for(ObraSocial obraSocial : obrasSociales){
            if(obraSocial.getObraSocial().equals(nombreObraSocial)){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Metodo que permite agregar una obra social
     */
    private void agregarObraSocial(){
        String input = JOptionPane.showInputDialog(null, "Ingrese la obra social a agregar:");
        
        if (input != null && !input.isEmpty()){
            ObraSocial nuevaObraSocial = new ObraSocial(input);
            
            /**
             * Convertir la obra social a minúsculas (o mayúsculas) 
             * para hacer la comparación insensible a mayúsculas/minúsculas
             */
            
            String obraSocialLowercase = nuevaObraSocial.getObraSocial().toLowerCase();
            
            if(!obraSocialExists(obraSocialLowercase)){
                obrasSociales.add(new ObraSocial(obraSocialLowercase));
                loadTableData();
            }
        }else{
            showError("La obra social ya existe.");
        }
    }
    
    /**
     * Metodo para cargar la informacion a la tabla
     */
    void loadTableData(){
        DefaultTableModel model = (DefaultTableModel) tbl_obra_social.getModel();
        if(model.getRowCount() > 0){
            model.setRowCount(0);
        }
        
        for(ObraSocial obraSocial : obrasSociales){
            model.addRow(new Object[]{obraSocial.getObraSocial()});
        }
    }
    
    /**
     * Metodo que muestra el error en pantalla
     * @param message, mensaje que va a mostrar por pantalla 
     */
    private void showError(String message){
        JOptionPane.showMessageDialog(this, message, "Error" , JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Metodo que guarda las obras sociales en el archivo "obrasSociales.ser"
     */
    public void GuardarHashSet(){
        guardarHashSet(obrasSociales, "obrasSociales.ser");
    }
    
    /**
     * Metodo para guardar un HashSet en un archivo
     * @param set, que se va a guardar 
     * @param fileName , nombre del archivo y tambien indicando el formato
     */
    private void guardarHashSet(Set<? extends Serializable> set, String fileName){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(set);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
