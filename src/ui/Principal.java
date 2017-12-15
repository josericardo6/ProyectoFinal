/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import da.Cola;
import da.ListaData;
import da.ListaInsertion;
import da.ListaMerge;
import da.NodoData;
import java.util.Calendar;
import javax.swing.JOptionPane;
import sun.reflect.annotation.TypeAnnotationParser;

/**
 *
 * @author Ricardo Rodriguez
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    ListaData lista = new ListaData();
    
    public Principal() {
        initComponents();
        
        this.setLocationRelativeTo(this);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMergeCola = new javax.swing.JButton();
        btnInsertionCir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JButton();
        btnModulo = new javax.swing.JButton();
        btnMerge1 = new javax.swing.JButton();
        btnInsertionSim = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblAlgoritmo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1500, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 800));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Principal");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Metodos de ordenamiento:");

        btnMergeCola.setBackground(new java.awt.Color(102, 102, 102));
        btnMergeCola.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnMergeCola.setForeground(new java.awt.Color(255, 255, 255));
        btnMergeCola.setText("Merge Sort Cola");
        btnMergeCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMergeColaActionPerformed(evt);
            }
        });

        btnInsertionCir.setBackground(new java.awt.Color(102, 102, 102));
        btnInsertionCir.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnInsertionCir.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertionCir.setText("Insertion Sort Lista Circular");
        btnInsertionCir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertionCirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel3.setText("Elija el metodo que desea realizar");

        txtDuracion.setEditable(false);
        txtDuracion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Duración:");

        btnHistorial.setBackground(new java.awt.Color(102, 102, 102));
        btnHistorial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setText("Historial");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnModulo.setBackground(new java.awt.Color(102, 102, 102));
        btnModulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnModulo.setForeground(new java.awt.Color(255, 255, 255));
        btnModulo.setText("Modulo Grafico");
        btnModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloActionPerformed(evt);
            }
        });

        btnMerge1.setBackground(new java.awt.Color(102, 102, 102));
        btnMerge1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnMerge1.setForeground(new java.awt.Color(255, 255, 255));
        btnMerge1.setText("Merge Sort Lista Simple");
        btnMerge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMerge1ActionPerformed(evt);
            }
        });

        btnInsertionSim.setBackground(new java.awt.Color(102, 102, 102));
        btnInsertionSim.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnInsertionSim.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertionSim.setText("Insertion Sort Lista Simple");
        btnInsertionSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertionSimActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(102, 102, 102));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMerge1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertionSim, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMergeCola, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertionCir, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 371, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHistorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModulo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAlgoritmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMerge1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMergeCola, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertionSim, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertionCir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121)
                .addComponent(lblAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloActionPerformed
        
        ModuloGrafico mg = new ModuloGrafico();
        
        this.setVisible(false);
        mg.setVisible(true);
        
    }//GEN-LAST:event_btnModuloActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
         System.exit(0);
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMerge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMerge1ActionPerformed
        
        double tiempoInicioLS = System.nanoTime();
        ListaMerge simpleM = new ListaMerge();
        
        simpleM.add("Ricardo", "Rodriguez", "Moya", "2-0740-0314", 22.0);
        simpleM.add("Juan", "Perez", "Mora", "1-1121-0507", 29.0);
        simpleM.add("Brayan", "Oconer", "Splinner", "M12378", 34.0);
        simpleM.add("Obama", "Barack", "Simion", "E78072", 56.0);
        simpleM.mergeSort(simpleM.getCabeza());
        simpleM.pasaportePrimero();
        
        double tiempoTotalLS = System.nanoTime() - tiempoInicioLS;
        
        String tiempo = String.valueOf(tiempoTotalLS/1000000);
        
        txtDuracion.setText(tiempo + "s");
        lblAlgoritmo.setText("Merge Sort Simple");
        
        Calendar calendario = Calendar.getInstance();
        int hora, minutos, segundos;
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        
        String horaActual = hora + ":" + minutos + ":" + segundos;
        
        NodoData nuevo = new NodoData("Merge Sort Simple",tiempo,horaActual);
        lista.add(nuevo);
        
//        JOptionPane.showMessageDialog(this, "Se ejecuto el MergeSort Simple.");
        
    }//GEN-LAST:event_btnMerge1ActionPerformed

    private void btnMergeColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMergeColaActionPerformed
        
        double tiempoInicioLS = System.nanoTime();
        Cola cola = new Cola();
        
        cola.queue("Santiago", "Mora", "Valverde", "7-0740-0314", 6.0);
        cola.queue("Jose", "Carballo", "Flores", "1-1354-0621", 18.0);
        cola.queue("Alexander", "Ramirez", "Varela", "1-1224-0247", 55.0);
        cola.queue("Jeylin", "Smith", "Jones", "M12378", 24.0);
        cola.mergeSort(cola.top());
        cola.pasaportePrimero();
        
        double tiempoTotalLS = System.nanoTime() - tiempoInicioLS;
        
        String tiempo = String.valueOf(tiempoTotalLS/1000000);
        
        txtDuracion.setText(tiempo + "s");
        lblAlgoritmo.setText("Merge Sort Cola");
        
        Calendar calendario = Calendar.getInstance();
        int hora, minutos, segundos;
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        
        String horaActual = hora + ":" + minutos + ":" + segundos;
        
        NodoData nuevo = new NodoData("Merge Sort Cola",tiempo,horaActual);
        lista.add(nuevo);
        
    }//GEN-LAST:event_btnMergeColaActionPerformed

    private void btnInsertionSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertionSimActionPerformed
        
        double tiempoInicioLS = System.nanoTime();
        ListaInsertion simpleIn = new ListaInsertion();
        
        simpleIn.add("Javier", "Moya", "Prendas", "4-0621-0115", 12.0);
        simpleIn.add("Xinia", "Portugues", "Aviles", "2-1354-0621", 46.0);
        simpleIn.add("Julio", "Ramirez", "Ventega", "2-1224-0247", 40.0);
        simpleIn.add("Jhonson", "Williams", "Fallen", "R73950", 86.0);
        simpleIn.insertionSort();
        
        double tiempoTotalLS = System.nanoTime() - tiempoInicioLS;
        
        String tiempo = String.valueOf(tiempoTotalLS/1000000);
        
        txtDuracion.setText(tiempo + "s");
        lblAlgoritmo.setText("Insertion Sort Simple");
        
        Calendar calendario = Calendar.getInstance();
        int hora, minutos, segundos;
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        
        String horaActual = hora + ":" + minutos + ":" + segundos;
        
        NodoData nuevo = new NodoData("Insertion Sort Simple",tiempo,horaActual);
        lista.add(nuevo);
    }//GEN-LAST:event_btnInsertionSimActionPerformed

    private void btnInsertionCirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertionCirActionPerformed
        
        double tiempoInicioLS = System.nanoTime();
        ListaInsertion circularIn = new ListaInsertion();
        
        circularIn.addCircular("David", "Angulo", "Tivas", "9-0461-0872", 25.0);
        circularIn.addCircular("Heylin", "Rodriguez", "Flores", "5-2454-0621", 19.0);
        circularIn.addCircular("Alexander", "Ramirez", "Varela", "6-2454-0247", 50.0);
        circularIn.addCircular("Williams", "Smith", "Tomatito", "E12658", 31.0);
         circularIn.insertionSortCircular();
        
        double tiempoTotalLS = System.nanoTime() - tiempoInicioLS;
        
        String tiempo = String.valueOf(tiempoTotalLS/1000000);
        
        txtDuracion.setText(tiempo + "s");
        lblAlgoritmo.setText("Insertion Sort Circular");
        
        Calendar calendario = Calendar.getInstance();
        int hora, minutos, segundos;
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        
        String horaActual = hora + ":" + minutos + ":" + segundos;
        
        NodoData nuevo = new NodoData("Insertion Sort Circular",tiempo,horaActual);
        lista.add(nuevo);
        
    }//GEN-LAST:event_btnInsertionCirActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        
        JOptionPane.showMessageDialog(null, lista.toString());
        
    }//GEN-LAST:event_btnHistorialActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnInsertionCir;
    private javax.swing.JButton btnInsertionSim;
    private javax.swing.JButton btnMerge1;
    private javax.swing.JButton btnMergeCola;
    private javax.swing.JButton btnModulo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAlgoritmo;
    private javax.swing.JTextField txtDuracion;
    // End of variables declaration//GEN-END:variables
}
