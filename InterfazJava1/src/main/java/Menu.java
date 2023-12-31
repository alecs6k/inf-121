
import java.awt.Image;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        setImageLabel(jLCrear, "src/main/resources/crear.png");
        setImageLabel(jLAdicionar, "src/main/resources/adicionar.png");
        setImageLabel(jLListar, "src/main/resources/listar.png");
        setImageLabel(jLConsultas, "src/main/resources/consultas.png");
        setImageLabel(jLEliminar, "src/main/resources/eliminar.png");
        setImageLabel(jLSalir, "src/main/resources/salir.png");
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
        jLAdicionar = new javax.swing.JLabel();
        jLListar = new javax.swing.JLabel();
        jLCrear = new javax.swing.JLabel();
        jLSalir = new javax.swing.JLabel();
        jLEliminar = new javax.swing.JLabel();
        jLConsultas = new javax.swing.JLabel();
        jBListar = new javax.swing.JButton();
        jBAdicionar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBConsultas = new javax.swing.JButton();
        jBCrearArchivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adicionar.png"))); // NOI18N
        jLAdicionar.setText("jLabel2");
        jPanel1.add(jLAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 120, 120));

        jLListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/listar.png"))); // NOI18N
        jLListar.setText("jLabel2");
        jPanel1.add(jLListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 120, 120));

        jLCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crear.png"))); // NOI18N
        jLCrear.setText("jLabel2");
        jPanel1.add(jLCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 120, 120));

        jLSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir.png"))); // NOI18N
        jLSalir.setText("jLabel2");
        jPanel1.add(jLSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 120, 120));

        jLEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar.png"))); // NOI18N
        jLEliminar.setText("jLabel2");
        jPanel1.add(jLEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 120, 120));

        jLConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultas.png"))); // NOI18N
        jLConsultas.setText("jLabel2");
        jPanel1.add(jLConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 120, 120));

        jBListar.setText("Listar Empleados");
        jBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarActionPerformed(evt);
            }
        });
        jPanel1.add(jBListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 180, 50));

        jBAdicionar.setText("Adicionar Empleado");
        jBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(jBAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 180, 50));

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 180, 50));

        jBEliminar.setText("Eliminar Empleado");
        jPanel1.add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 180, 50));

        jBConsultas.setText("Hacer consultas");
        jPanel1.add(jBConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 180, 50));

        jBCrearArchivo.setText("Crear archivo");
        jBCrearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(jBCrearArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
        this.setVisible(false);
        FrameAdicionar adicionar = new FrameAdicionar();
        adicionar.setVisible(true);
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void jBCrearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearArchivoActionPerformed
        String nomArch = "empleados.dat";
        ObjectOutputStream arch = null;
        try {
            arch = new ObjectOutputStream(new FileOutputStream(nomArch));
            JOptionPane.showMessageDialog(null, "El archivo se creo correctamente!!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al crear el archivo");
        } finally {
            try {
                arch.close();
            } catch (IOException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBCrearArchivoActionPerformed

    private void jBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarActionPerformed
        this.setVisible(false);
        FrameMostrar mostrar = new FrameMostrar();
        mostrar.setVisible(true);
    }//GEN-LAST:event_jBListarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    public void setImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jBConsultas;
    private javax.swing.JButton jBCrearArchivo;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBListar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLAdicionar;
    private javax.swing.JLabel jLConsultas;
    private javax.swing.JLabel jLCrear;
    private javax.swing.JLabel jLEliminar;
    private javax.swing.JLabel jLListar;
    private javax.swing.JLabel jLSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
