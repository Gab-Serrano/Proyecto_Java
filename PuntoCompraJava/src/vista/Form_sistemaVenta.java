/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.RegistroCompra;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Compra;
import modelo.DetalleCompra;
import modelo.Producto;

/**
 *
 * @author david
 */
public class Form_sistemaVenta extends javax.swing.JFrame {

    List<DetalleCompra> listaCompra = new ArrayList<>();
    public static int totalVenta = 0;

    /**
     * Creates new form Form_nuevaVenta
     */
    public Form_sistemaVenta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtbl_productos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtxt_codigo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtxt_cantidad = new javax.swing.JTextField();
        jBttn_agregar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setText("Carrito De Compras");

        jtbl_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre ", "Precio", "Descuento", "Cantidad", "Total"
            }
        ));
        jScrollPane8.setViewportView(jtbl_productos);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("TOTAL");

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("$");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("CODIGO");

        jtxt_codigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_codigoFocusGained(evt);
            }
        });
        jtxt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_codigoActionPerformed(evt);
            }
        });
        jtxt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxt_codigoKeyPressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("CANTIDAD");

        jBttn_agregar.setText("Agregar");
        jBttn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttn_agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxt_codigo)
                            .addComponent(jtxt_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBttn_agregar)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jBttn_agregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtxt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblTotal)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_codigoActionPerformed


    }//GEN-LAST:event_jtxt_codigoActionPerformed

    private void jtxt_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_codigoKeyPressed
//        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
//            if (!"".equals(txtcantidad.getText())) {
//                String cod = txtcodigo.getText();
//                int cant = Integer.parseInt(txtcodigo.getText());
//                double precio = Double.parseDouble(lblPrecio.getText());
//                double total  = cant *precio ;
//                int stock = Integer.parseInt(txtstock.getText());
//                if (stock>= cant) {
//                    item = item +1;
//                    modelo = (DefaultTableModel) jtbl_productos.getModel();
//                    ArrayList lista = new ArrayList();
//                    lista.add(item);
//                    lista.add(cod);
//                    lista.add(cant);
//                    lista.add(precio);
//                    lista.add(total);
//                    Object[] O = new Object[5];
//                    O[0]=lista.get(1);
//                    O[1]=lista.get(2);
//                    O[2]=lista.get(3);
//                    O[3]=lista.get(4);
//                    modelo.addRow(O);
//                    jtbl_productos.setModel(modelo);
//                    
//                }else{
//                    JOptionPane.showConfirmDialog(null, "Stock no disponible");
//                }
//            }else{
//                 JOptionPane.showConfirmDialog(null, "ingrese cantidad");
//            }
//        }
    }//GEN-LAST:event_jtxt_codigoKeyPressed

    private void jtxt_codigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_codigoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_codigoFocusGained

    private void jBttn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttn_agregarActionPerformed
        RegistroCompra regCom = new RegistroCompra();
        Producto producto = regCom.agregarProductoALista(jtxt_codigo.getText());
        int cantidad = Integer.valueOf(jtxt_cantidad.getText());
        int total = (int) ((int) cantidad * producto.getPrecioUnitario() -((double)(cantidad * producto.getPrecioUnitario()) * producto.getPorcentajeDescuento()));
        totalVenta = totalVenta + total;

        listaCompra.add(new DetalleCompra(producto, cantidad, total));
        DefaultTableModel modelo = (DefaultTableModel) this.jtbl_productos.getModel();
        modelo.setRowCount(0);

        for (DetalleCompra item : listaCompra) {
            modelo.addRow(new Object[]{item.getProducto().getDescripcionProducto(), item.getProducto().getPrecioUnitario(),
                item.getProducto().getPorcentajeDescuento(), item.getCantidad(), item.getTotalProducto()});
        }
        
        jTextField1.setText(String.valueOf(totalVenta));


    }//GEN-LAST:event_jBttn_agregarActionPerformed
    public void actualizarTabla() {
//        while(modelo.getRowCount()>0){
//            modelo.removeRow(0);
//        }
//        double subtotal=0;
//        for (Producto v : listaProducto) {
//            Object x[]=new Object[4];
//            x[0]=v.getDescripcionProducto();
//            x[1]=aMoneda(v.getPrecioUnitario());
//            x[2]=v.getPorcentajeDescuento();
//            
//            
//            modelo.addRow(x);
//        }
//        double iva=subtotal*0.19;
//        double total =subtotal+iva;
//        lblSubtotal.setText(aMoneda(subtotal));
//        lblIva.setText(aMoneda(iva));
//        lblTotal.setText(aMoneda(total));
//        jtbl_productos.setModel(modelo);
//        
    }

    public String aMoneda(double precio) {
        return "$ " + Math.round(precio * 100) / 100 + " CLP";
    }

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
            java.util.logging.Logger.getLogger(Form_sistemaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_sistemaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_sistemaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_sistemaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_sistemaVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttn_agregar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable jtbl_productos;
    private javax.swing.JTextField jtxt_cantidad;
    private javax.swing.JTextField jtxt_codigo;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}
