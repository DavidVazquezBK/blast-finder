/*
 * Coded by David Vazquez using NetBeans.
 */
package ui.misc;

import jdbc.Conexion;
import POJO.CategoriaPOJO;
import POJO.MaterialPOJO;
import POJO.MovimientoPOJO;
import POJO.ProductoPOJO;
import POJO.UbicacionPOJO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import jdbc.MovimientoJDBC;

/**
 *
 * @author BurnKill
 */
public class MoverMaterial extends javax.swing.JPanel {

    ArrayList<CategoriaPOJO> categorias;
    ArrayList<ProductoPOJO> productos;
    ArrayList<MaterialPOJO> materiales;
    ArrayList<UbicacionPOJO> ubicaciones;

    /**
     * Creates new form MoverMaterial
     */
    public MoverMaterial() {
        initComponents();

        ListSelectionListener listSelectionListener = new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                cambiaEstadoBotonAceptar();
            }
        };
        jList2.addListSelectionListener(listSelectionListener);

        jButton1.setEnabled(false);
        this.categorias = new ArrayList<CategoriaPOJO>();
        this.productos = new ArrayList<ProductoPOJO>();
        this.materiales = new ArrayList<MaterialPOJO>();
        this.ubicaciones = new ArrayList<UbicacionPOJO>();

        try {
            Connection con = Conexion.getConnection();
            PreparedStatement st = con.prepareStatement("SELECT * FROM categoria");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {

                CategoriaPOJO categoriaPOJO = new CategoriaPOJO();

                categoriaPOJO.setIdCategoria(rs.getInt(1));
                categoriaPOJO.setNombre(rs.getString(2));
                categoriaPOJO.setIniciales(rs.getString(3));

                categorias.add(categoriaPOJO);
            }
            rs.close();
            st.close();
            con.close();
            Conexion.closeAll();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement st = con.prepareStatement("SELECT * FROM producto");
            ResultSet rs2 = st.executeQuery();
            while (rs2.next()) {
                ProductoPOJO productoPOJO = new ProductoPOJO();
                productoPOJO.setIdProducto(rs2.getInt(1));
                productoPOJO.setNombre(rs2.getString(2));
                productoPOJO.setCategoria_idCategoria(rs2.getInt(3));
                productoPOJO.setIniciales(rs2.getString(4));

                productos.add(productoPOJO);
            }
            rs2.close();
            st.close();
            con.close();
            Conexion.closeAll();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        try {
            Connection con = Conexion.getConnection();
            PreparedStatement st = con.prepareStatement("SELECT * FROM material");
            ResultSet rs3 = st.executeQuery();

            while (rs3.next()) {
                MaterialPOJO materialPOJO = new MaterialPOJO();

                materialPOJO.setIdMaterial(rs3.getInt(1));
                materialPOJO.setNotas(rs3.getString(2));
                materialPOJO.setProducto_idProducto(rs3.getInt(3));
                materialPOJO.setNombre(rs3.getString(4));

                materiales.add(materialPOJO);
            }

            rs3.close();
            st.close();
            con.close();
            Conexion.closeAll();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement st = con.prepareStatement("SELECT * FROM ubicacion");
            ResultSet rs4 = st.executeQuery();

            while (rs4.next()) {
                UbicacionPOJO ubicacionPOJO = new UbicacionPOJO();

                ubicacionPOJO.setIdUbicacion(rs4.getInt(1));
                ubicacionPOJO.setNombre(rs4.getString(2));
                ubicacionPOJO.setDescripcion(rs4.getString(3));

                ubicaciones.add(ubicacionPOJO);
            }

            rs4.close();
            st.close();
            con.close();
            Conexion.closeAll();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        cargaModoCategorias();
        cargaUbicaciones();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Material(es) seleccionado(s)"));

        jList1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jList1PropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/derecha.png"))); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izquierda.png"))); // NOI18N
        jButton3.setText("Retirar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jButton1.setText("Confirmar movimiento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoría", "Producto" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Clasificar por:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Todos los materiales"));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Todas las ubicaciones"));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jList2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
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
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        cargaJTree();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Checar si ya está en la lista
        DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        if (Objects.nonNull(nodoSeleccionado)) {
            if (nodoSeleccionado.getUserObject() instanceof MaterialPOJO) {
                //Obtener nodo seleccionado
                DefaultMutableTreeNode nodoSeleccionado2 = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
                //Obtener material seleccionado
                MaterialPOJO materialSeleccionado = (MaterialPOJO) nodoSeleccionado2.getUserObject();
                //Si la lista está vacía, se agrega el material, si no, se buscan coincidencias
                if (jList1.getModel().getSize() == 0) {
//                    System.out.println("Lista vacia, agregando...");
                    agrega(materialSeleccionado);
                    //Que hacer si la lista tiene mas de 0 materiales
                } else if (jList1.getModel().getSize() > 0) {
                    //Obtener modelo de jList, en el cual hay que buscar coincidencias de material
                    ListModel listModel1 = jList1.getModel();
                    //Comparar cada material con el seleccionado
                    boolean listo;
                    listo = true;
                    for (int i = 0; i < jList1.getModel().getSize(); i++) {
                        if (((MaterialPOJO) listModel1.getElementAt(i)) == materialSeleccionado) {
                            listo = false;
                        }
                    }
                    if (listo) {
                        agrega(materialSeleccionado);
                    }
                }
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed
    public void agrega(MaterialPOJO materialSeleccionado) {
        //Crear modelo nuevo
        DefaultListModel<MaterialPOJO> defaultListModel = new DefaultListModel<MaterialPOJO>();
        //Obtener modelo de jList1
        ListModel listModel = jList1.getModel();
        //Agregar registros de jList al modelo nuevo
        for (int i = 0; i < jList1.getModel().getSize(); i++) {
            defaultListModel.addElement((MaterialPOJO) listModel.getElementAt(i));
        }
        //Agregar material seleccionado
        defaultListModel.addElement(materialSeleccionado);
        //Definir nuevo modelo
        jList1.setModel((ListModel) defaultListModel);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jList1.getModel().getSize() > 0) {
            //Crear modelo nuevo
            DefaultListModel<MaterialPOJO> defaultListModel = new DefaultListModel<MaterialPOJO>();
            //Obtener modelo de jList1
            ListModel listModel = jList1.getModel();
            //Agregar registros de jList al modelo nuevo
            for (int i = 0; i < jList1.getModel().getSize(); i++) {
                defaultListModel.addElement((MaterialPOJO) listModel.getElementAt(i));
            }
            //Eliminar
            defaultListModel.remove(jList1.getSelectedIndex());
            //Definir nuevo modelo
            jList1.setModel((ListModel) defaultListModel);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Donde almacenar materiales seleccionados
        MaterialPOJO[] materialesSeleccionado = new MaterialPOJO[jList1.getModel().getSize()];
        //Obtener modelo de jList1 para obtener cada objeto
        ListModel listModel = jList1.getModel();
        //Almacenar cada objeto casteado a su posición en materialesSeleccionado
        for (int i = 0; i < materialesSeleccionado.length; i++) {
            materialesSeleccionado[i] = (MaterialPOJO) listModel.getElementAt(i);
        }

        //Obtener ubicación seleccionada
        ListModel listModel2 = jList2.getModel();
        UbicacionPOJO ubicacionSeleccionada = (UbicacionPOJO) listModel2.getElementAt(jList2.getSelectedIndex());

        //Insertar cada movimiento
        //Nota:el numero de movimientos = numero de materiales seleccionados
        boolean error = false;
        for (int i = 0; i < materialesSeleccionado.length; i++) {
            MovimientoPOJO movimientoActual = new MovimientoPOJO();

            movimientoActual.setMaterial_idMaterial(materialesSeleccionado[i].getIdMaterial());
            movimientoActual.setUbicacion_idUbicacion(ubicacionSeleccionada.getIdUbicacion());

            try {
                if (MovimientoJDBC.insertaMovimiento(movimientoActual) == 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                error = true;
                System.out.println("Error agregando movimiento(s) ui.abc.Movimiento: " + e);
            }
        }
        if (error) {
            JOptionPane.showMessageDialog(this, "Error agregando movimiento(s): ui.abc.Movimiento", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Movimiento(s) agregados correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
            jList1.setModel((DefaultListModel<String>) new DefaultListModel<String>());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jList1PropertyChange
        cambiaEstadoBotonAceptar();
    }//GEN-LAST:event_jList1PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
private void cargaJTree() {
        switch (jComboBox1.getSelectedIndex()) {
            case 0: {
                cargaModoCategorias();
                break;

            }

            case 1: {
                cargaModoProductos();
                break;
            }

        }
    }

    private void cargaModoCategorias() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Categorías");
        for (int i = 0; i < categorias.size(); i++) {
            // Agregar CategoriasPOJO al root
            DefaultMutableTreeNode categoria = new DefaultMutableTreeNode();
            categoria.setUserObject(categorias.get(i));

            //Agregar materiales a cada categoria
            try {
                Connection con = Conexion.getConnection();
                PreparedStatement st = con.prepareStatement("SELECT * FROM material WHERE material.Producto_idProducto in (SELECT producto.idProducto FROM producto WHERE producto.Categoria_idCategoria = " + categorias.get(i).getIdCategoria() + ")");
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    categoria.add(new DefaultMutableTreeNode(new MaterialPOJO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4))));

                }
                rs.close();
                st.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(MaterialVista.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Agregar cada categoria al root
            root.add(categoria);
        }

        jTree1.setModel(new DefaultTreeModel(root));
    }

    private void cargaModoProductos() {

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Productos");
        for (int i = 0; i < productos.size(); i++) {
            // Agregar ProductosPOJO al root
            DefaultMutableTreeNode producto = new DefaultMutableTreeNode();
            producto.setUserObject(productos.get(i));

            //Agregar materiales a cada categoria
            try {
                Connection con = Conexion.getConnection();
                PreparedStatement st = con.prepareStatement("SELECT * FROM material WHERE material.Producto_idProducto=" + productos.get(i).getIdProducto());
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    producto.add(new DefaultMutableTreeNode(new MaterialPOJO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4))));

                }
                rs.close();
                st.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(MaterialVista.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Agregar cada categoria al root
            root.add(producto);
        }

        jTree1.setModel(new DefaultTreeModel(root));
    }

    private void cargaUbicaciones() {
        DefaultListModel<UbicacionPOJO> defaultListModel = new DefaultListModel<UbicacionPOJO>();
        for (int i = 0; i < ubicaciones.size(); i++) {
            defaultListModel.addElement(ubicaciones.get(i));
        }
        jList2.setModel((ListModel) defaultListModel);
    }

    private void cambiaEstadoBotonAceptar() {
        if (jList2.getSelectedIndex() != -1 && jList1.getModel().getSize() > 0) {
            jButton1.setEnabled(true);
        } else {
            jButton1.setEnabled(false);
        }
    }
}
