/*
 * Coded by David Vazquez using NetBeans.
 */
package ui.abc;

import JDBC.Conexion;
import POJO.CategoriaPOJO;
import POJO.ProductoPOJO;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdbc.CategoriaJDBC;
import jdbc.ProductoJDBC;

/**
 *
 * @author BurnKill
 */
public class Producto extends javax.swing.JPanel {

    /**
     * Creates new form Producto
     */
    ArrayList<CategoriaPOJO> categorias;

    public Producto() {
        initComponents();
        cargaTabla();

        ResultSet rs = Conexion.customQuery("SELECT * FROM categoria");

        categorias = new ArrayList<CategoriaPOJO>();

        try {
            while (rs.next()) {
                CategoriaPOJO categoriaPOJO = new CategoriaPOJO();

                categoriaPOJO.setIdCategoria(rs.getInt(1));
                categoriaPOJO.setNombre(rs.getString(2));
                categoriaPOJO.setIniciales(rs.getString(3));

                categorias.add(categoriaPOJO);

                comboEditar.addItem(categoriaPOJO.getNombre());
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregar = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        nombreAgregar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        inicialesAgregar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        agregarComboCategoria = new javax.swing.JComboBox<>();
        editar = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        inicialesEditar = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        comboEditar = new javax.swing.JComboBox<>();
        idEditar = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        nombreEditar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        categoria = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        iniciales = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        agregar.setTitle("Agregar ");
        agregar.setResizable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nuevo Producto");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        nombreAgregar.setText(" ");

        jLabel14.setText("Iniciales:");

        inicialesAgregar.setText(" ");

        jLabel15.setText("Categoria:");

        jLabel16.setText("Nombre:");

        javax.swing.GroupLayout agregarLayout = new javax.swing.GroupLayout(agregar.getContentPane());
        agregar.getContentPane().setLayout(agregarLayout);
        agregarLayout.setHorizontalGroup(
            agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarLayout.createSequentialGroup()
                        .addGap(0, 194, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(agregarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(agregarLayout.createSequentialGroup()
                        .addGroup(agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(agregarLayout.createSequentialGroup()
                                .addGroup(agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel14))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreAgregar)
                            .addComponent(inicialesAgregar)
                            .addComponent(agregarComboCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        agregarLayout.setVerticalGroup(
            agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(nombreAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(inicialesAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(agregarComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        editar.setTitle("Editar");
        editar.setResizable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Editar Producto");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jButton6.setText("Guardar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jButton7.setText("Cancelar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel17.setText("Iniciales:");

        inicialesEditar.setText(" ");

        jLabel18.setText("Categoria:");

        jLabel19.setText("ID:");

        idEditar.setEditable(false);
        idEditar.setText(" ");

        jLabel20.setText("Nombre:");

        nombreEditar.setText(" ");

        javax.swing.GroupLayout editarLayout = new javax.swing.GroupLayout(editar.getContentPane());
        editar.getContentPane().setLayout(editarLayout);
        editarLayout.setHorizontalGroup(
            editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarLayout.createSequentialGroup()
                        .addGap(0, 195, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addGroup(editarLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(editarLayout.createSequentialGroup()
                        .addGroup(editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17)
                            .addGroup(editarLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel18))
                            .addComponent(jLabel20))
                        .addGap(11, 11, 11)
                        .addGroup(editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idEditar)
                            .addComponent(inicialesEditar)
                            .addComponent(comboEditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreEditar))))
                .addContainerGap())
        );
        editarLayout.setVerticalGroup(
            editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(idEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(nombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(inicialesEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(comboEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Editar Productos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selección", "ID", "Nombre", "Categoría", "Iniciales"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Vista con detalles"));

        jLabel2.setText("ID:");

        id.setEditable(false);
        id.setText(" ");

        jLabel3.setText("Nombre:");

        nombre.setEditable(false);
        nombre.setText(" ");

        jLabel5.setText("Categoría:");

        categoria.setEditable(false);
        categoria.setText(" ");

        jLabel13.setText("Iniciales:");

        iniciales.setEditable(false);
        iniciales.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel13)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iniciales)
                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(nombre)
                    .addComponent(categoria))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(iniciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jButton1.setText("Eliminar selección");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ResultSet rs = Conexion.customQuery("SELECT * FROM categoria");
        categorias = new ArrayList<CategoriaPOJO>();
        categorias.clear();
        try {
            while (rs.next()) {
                CategoriaPOJO categoriaPOJO = new CategoriaPOJO();

                categoriaPOJO.setIdCategoria(rs.getInt(1));
                categoriaPOJO.setNombre(rs.getString(2));
                categoriaPOJO.setIniciales(rs.getString(3));

                categorias.add(categoriaPOJO);

                agregarComboCategoria.addItem(categoriaPOJO.getNombre());
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        agregar.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../../img/icon.png")));
        agregar.setModal(true);
        agregar.setSize(419 + 30, 40 + 158);
        agregar.setLocationRelativeTo(editar.getParent());
        agregar.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        idEditar.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        nombreEditar.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        inicialesEditar.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());

        for (int i = 0; i < categorias.size(); i++) {
            if (categorias.get(i).getNombre().equals(jTable1.getValueAt(jTable1.getSelectedRow(), 3))) {
                comboEditar.setSelectedIndex(i);
            }
        }

        editar.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../../img/icon.png")));
        editar.setModal(true);
        editar.setSize(419 + 30, 198 + 45);
        editar.setLocationRelativeTo(editar.getParent());
        editar.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        id.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        nombre.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        categoria.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        iniciales.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ProductoPOJO productoPOJO = new ProductoPOJO();

        productoPOJO.setCategoria_idCategoria(categorias.get(agregarComboCategoria.getSelectedIndex()).getIdCategoria());
        productoPOJO.setIniciales(inicialesAgregar.getText().toUpperCase());
        productoPOJO.setNombre(nombreAgregar.getText().toUpperCase());

        System.out.println();

        try {
            if (ProductoJDBC.insertaProducto(productoPOJO) == 0) {
                throw new Exception();
            }
            JOptionPane.showMessageDialog(this, "Producto agregado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
            cargaTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error agregando producto: ui.abc.Producto", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error agregando producto ui.abc.Producuto: " + e);
        }
        agregar.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        agregar.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ArrayList<String> seleccionados;
        seleccionados = new ArrayList<String>();

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if ((boolean) jTable1.getModel().getValueAt(i, 0) == true) {
                seleccionados.add(jTable1.getModel().getValueAt(i, 1).toString());
            }

        }
        try {

            for (int i = 0; i < seleccionados.size(); i++) {
                if (ProductoJDBC.eliminarProducto(seleccionados.get(i))) {

                } else {
                    throw new Exception();
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error eliminando producto(s) : ui.abc.Producto", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error eliminando producto(s)ui.abc.Producto: " + e);
        }
        cargaTabla();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        editar.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ProductoPOJO pojo = new ProductoPOJO();
        pojo.setIdProducto(Integer.parseInt(idEditar.getText()));
        pojo.setNombre(nombreEditar.getText());
        pojo.setIniciales(inicialesEditar.getText().toUpperCase());
        pojo.setCategoria_idCategoria(categorias.get(comboEditar.getSelectedIndex()).getIdCategoria());

        try {
            if (ProductoJDBC.actualizaProducto(pojo) == false) {
                throw new Exception();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error editando producto: ui.abc.Producto", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error editando categoría ui.abc.Producto: " + e);
        }
        cargaTabla();
        editar.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog agregar;
    private javax.swing.JComboBox<String> agregarComboCategoria;
    private javax.swing.JTextField categoria;
    private javax.swing.JComboBox<String> comboEditar;
    private javax.swing.JDialog editar;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idEditar;
    private javax.swing.JTextField iniciales;
    private javax.swing.JTextField inicialesAgregar;
    private javax.swing.JTextField inicialesEditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombreAgregar;
    private javax.swing.JTextField nombreEditar;
    // End of variables declaration//GEN-END:variables
    public void cargaTabla() {

        try {
            DefaultTableModel datos = ProductoJDBC.cargarTabla();

            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
            tm.setRowCount(0);

            for (int filas = 0; filas < datos.getRowCount(); filas++) {
                tm.addRow(new Object[]{null, null, null, null});
                for (int columnas = 0; columnas < 4; columnas++) {
                    tm.setValueAt(datos.getValueAt(filas, columnas), filas, columnas + 1);
                    jTable1.setModel(tm);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error cargando tabla: ui.abc.Categoria", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error cargando tabla ui.abc.Categoria: " + e);
        }

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            jTable1.setValueAt(false, i, 0);
        }
    }
}
