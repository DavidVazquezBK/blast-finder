/*
 * Coded by David Vazquez using NetBeans.
 */
package ui.misc;

import JDBC.Conexion;
import POJO.CategoriaPOJO;
import POJO.MaterialPOJO;
import POJO.ProductoPOJO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author BurnKill
 */
public class MaterialVista extends javax.swing.JPanel {

    ArrayList<CategoriaPOJO> categorias;
    ArrayList<ProductoPOJO> productos;
    ArrayList<MaterialPOJO> materiales;

    /**
     * Creates new form MaterialConsulta
     */
    public MaterialVista() {
        initComponents();
        this.productos = new ArrayList<ProductoPOJO>();
        this.categorias = new ArrayList<CategoriaPOJO>();
        this.materiales = new ArrayList<MaterialPOJO>();

        ResultSet rs = Conexion.customQuery("SELECT * FROM categoria");
        try {
            while (rs.next()) {

                CategoriaPOJO categoriaPOJO = new CategoriaPOJO();

                categoriaPOJO.setIdCategoria(rs.getInt(1));
                categoriaPOJO.setNombre(rs.getString(2));
                categoriaPOJO.setIniciales(rs.getString(3));

                categorias.add(categoriaPOJO);
            }
            rs.close();
            Conexion.closeAll();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        ResultSet rs2 = Conexion.customQuery("SELECT * FROM producto");
        try {
            while (rs2.next()) {
                ProductoPOJO productoPOJO = new ProductoPOJO();
                productoPOJO.setIdProducto(rs2.getInt(1));
                productoPOJO.setNombre(rs2.getString(2));
                productoPOJO.setCategoria_idCategoria(rs2.getInt(3));
                productoPOJO.setIniciales(rs2.getString(4));

                productos.add(productoPOJO);
            }
            rs2.close();
            Conexion.closeAll();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        ResultSet rs3 = Conexion.customQuery("SELECT * FROM material");
        try {

            while (rs3.next()) {
                MaterialPOJO materialPOJO = new MaterialPOJO();

                materialPOJO.setIdMaterial(rs3.getInt(1));
                materialPOJO.setNotas(rs3.getString(2));
                materialPOJO.setProducto_idProducto(rs3.getInt(3));
                materialPOJO.setNombre(rs3.getString(4));

                materiales.add(materialPOJO);
            }

            rs3.close();
            Conexion.closeAll();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        cargaModoCategorias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        producto = new javax.swing.JTextField();
        categoria = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        no = new javax.swing.JScrollPane();
        notas = new javax.swing.JTextArea();

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jLabel1.setText("Clasificar por:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoría", "Producto" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles de material"));

        jLabel20.setText("Producto:");

        producto.setEditable(false);
        producto.setText(" ");

        categoria.setEditable(false);
        categoria.setText(" ");

        jLabel21.setText("Categoría:");

        jLabel2.setText("ID:");

        id.setEditable(false);
        id.setText(" ");

        jLabel3.setText("Nombre:");

        nombre.setEditable(false);
        nombre.setText(" ");

        jLabel13.setText("Notas:");

        notas.setEditable(false);
        notas.setColumns(20);
        notas.setLineWrap(true);
        notas.setRows(5);
        no.setViewportView(notas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(producto, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(no))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        cargaJTree();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked

        try {
            DefaultMutableTreeNode nodeSeleccionado = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
            if (nodeSeleccionado.getUserObject() instanceof MaterialPOJO) {
                MaterialPOJO materialPOJO = (MaterialPOJO) nodeSeleccionado.getUserObject();
                id.setText("" + materialPOJO.getIdMaterial());
                nombre.setText("" + materialPOJO.getNombre());
                notas.setText("" + materialPOJO.getNotas());

                ProductoPOJO productoSeleccionado = new ProductoPOJO();
                for (int i = 0; i < productos.size(); i++) {
                    if (productos.get(i).getIdProducto() == materialPOJO.getProducto_idProducto()) {
                        producto.setText("" + productos.get(i).getNombre());
                        productoSeleccionado = productos.get(i);
                    }
                }
                for (int i = 0; i < categorias.size(); i++) {
                    if (productoSeleccionado.getCategoria_idCategoria() == categorias.get(i).getIdCategoria()) {
                        categoria.setText(categorias.get(i).getNombre());
                    }
                }
            }
        } catch (Exception e) {
//            System.out.println("Material vista: No seleccionado");
        }

    }//GEN-LAST:event_jTree1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField id;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JScrollPane no;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextArea notas;
    private javax.swing.JTextField producto;
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
            ResultSet rs = Conexion.customQuery("SELECT * FROM material WHERE material.Producto_idProducto in (SELECT producto.idProducto FROM producto WHERE producto.Categoria_idCategoria = " + categorias.get(i).getIdCategoria() + ")");
            try {
                while (rs.next()) {
                    categoria.add(new DefaultMutableTreeNode(new MaterialPOJO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4))));

                }

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
            ResultSet rs = Conexion.customQuery("SELECT * FROM material WHERE material.Producto_idProducto=" + productos.get(i).getIdProducto());
            try {
                while (rs.next()) {
                    producto.add(new DefaultMutableTreeNode(new MaterialPOJO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4))));

                }

            } catch (SQLException ex) {
                Logger.getLogger(MaterialVista.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Agregar cada categoria al root
            root.add(producto);
        }

        jTree1.setModel(new DefaultTreeModel(root));
    }

}
