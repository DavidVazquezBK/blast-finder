/*
 * Coded by David Vazquez using NetBeans.
 */
package ui;

import com.alee.laf.WebLookAndFeel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.SplashScreen;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.sql.SQLException;
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import ui.abc.Categoria;
import ui.abc.Material;
import ui.abc.Movimiento;
import ui.abc.Producto;
import ui.abc.Ubicacion;
import ui.misc.Ajustes;
import ui.misc.Ayuda;
import ui.misc.GeneradorQR;
import ui.misc.MaterialVista;
import ui.misc.MoverMaterial;

/**
 *
 * @author BurnKill
 */
public class Principal extends javax.swing.JFrame {

    static SplashScreen mySplash;
    static Graphics2D splashGraphics;
    static Rectangle2D.Double splashTextArea;
    static Rectangle2D.Double splashProgressArea;
    static Font font;

    public Principal() throws SQLException {
        initComponents();
        this.setIconImage(new ImageIcon(this.getClass().getResource("/img/icon.png")).getImage());
        //      Límite de edición
        final JPopupMenu popup = new JPopupMenu();

        //Añadir cada botón del pop-up
        popup.add(new JMenuItem(new AbstractAction("Categorías") {
            public void actionPerformed(ActionEvent e) {
                agregarPestaña(new Categoria(), "Administrar Categorías", createIcon("/img/administracion.png"));
            }
        }));
        popup.add(new JMenuItem(new AbstractAction("Productos") {
            public void actionPerformed(ActionEvent e) {
                agregarPestaña(new Producto(), "Administrar Productos", createIcon("/img/administracion.png"));
            }
        }));
        popup.add(new JMenuItem(new AbstractAction("Materiales") {
            public void actionPerformed(ActionEvent e) {
                agregarPestaña(new Material(), "Administrar Materiales", createIcon("/img/administracion.png"));
            }
        }));
        popup.add(new JMenuItem(new AbstractAction("Ubicaciones") {
            public void actionPerformed(ActionEvent e) {
                agregarPestaña(new Ubicacion(), "Administrar Ubicaciones", createIcon("/img/administracion.png"));
            }
        }));
        popup.add(new JMenuItem(new AbstractAction("Movimientos") {
            public void actionPerformed(ActionEvent e) {
                agregarPestaña(new Movimiento(), "Administrar Movimientos", createIcon("/img/administracion.png"));
            }
        }));

        // Poner listener al boton
        jButton2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });
        //      Límite de edición
        this.setLocationRelativeTo(null);
        agregarPestaña(new Inicio(), "Inicio", createIcon("/img/inicio.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        eliminar = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        jButton3 = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blast Finder");

        jToolBar1.setFloatable(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/administracion.png"))); // NOI18N
        jButton2.setText("Administración");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jToolBar1.add(jButton2);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jButton1.setText("Vista de Materiales");
        jButton1.setFocusable(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/movimiento.png"))); // NOI18N
        jButton6.setText("Mover materiales");
        jButton6.setFocusable(false);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/qr.png"))); // NOI18N
        jButton4.setText("Generador QR");
        jButton4.setFocusable(false);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ajustes.png"))); // NOI18N
        jButton5.setText("Ajustes");
        jButton5.setFocusable(false);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jToolBar2.setFloatable(false);

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        eliminar.setText("Eliminar Pestaña Actual");
        eliminar.setEnabled(false);
        eliminar.setFocusable(false);
        eliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jToolBar2.add(eliminar);

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio.png"))); // NOI18N
        jButton3.setText("Inicio");
        jButton3.setFocusable(false);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton3);

        jToolBar4.setFloatable(false);
        jToolBar4.setRollover(true);
        jToolBar4.setPreferredSize(new java.awt.Dimension(139, 25));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        jButton7.setText("Ayuda y Contacto");
        jButton7.setFocusable(false);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar4.add(jButton7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Inicio");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (jTabbedPane1.getTabCount() > 1) {
            jTabbedPane1.removeTabAt(jTabbedPane1.getSelectedIndex());
            eliminar.setEnabled(true);
        }

        if (jTabbedPane1.getTabCount() == 1) {
            eliminar.setEnabled(false);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            agregarPestaña(new Inicio(), "Inicio", createIcon("/img/inicio.png"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de base de datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregarPestaña(new MaterialVista(), "Vista de materiales", createIcon("/img/lupa.png"));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        agregarPestaña(new GeneradorQR(), "Generador QR", createIcon("/img/qr.png"));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        agregarPestaña(new Ajustes(), "Ajustes", createIcon("/img/ajustes.png"));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        agregarPestaña(new MoverMaterial(), "Mover Materiales", createIcon("/img/movimiento.png"));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        agregarPestaña(new Ayuda(), "Ayuda y Contacto", createIcon("/img/info.png"));
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        splashInit();
        appInit();
        if (mySplash != null) {
            mySplash.close();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                WebLookAndFeel.install();
                try {
                    new Principal().setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex, "Error de base de datos", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex, "Error iniciando", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    // End of variables declaration//GEN-END:variables
    private static void splashInit() {

        mySplash = SplashScreen.getSplashScreen();

        if (mySplash != null) {
            Dimension ssDim = mySplash.getSize();
            int height = ssDim.height;
            int width = ssDim.width;
            splashTextArea = new Rectangle2D.Double(15., height * 0.88, width * .45, 32.);
            splashProgressArea = new Rectangle2D.Double(width * .55, height * .92, width * .4, 12);
            splashGraphics = mySplash.createGraphics();
            font = new Font("Cinzel", Font.PLAIN, 14);
            splashGraphics.setFont(font);
            splashText("Starting");
            splashProgress(0);
        }
    }

    private static void appInit() {
        for (int i = 1; i <= 2; i++) {
            int pctDone = i * 10;
            splashText("Doing task #" + i);
            splashProgress(pctDone);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                break;
            }
        }
    }

    /**
     * Display text in status area of Splash. Note: no validation it will fit.
     *
     * @param str - text to be displayed
     */
    public static void splashText(String str) {
        if (mySplash != null && mySplash.isVisible()) {
            splashGraphics.setPaint(Color.LIGHT_GRAY);
            splashGraphics.fill(splashTextArea);
            splashGraphics.setPaint(Color.BLACK);
            splashGraphics.drawString(str, (int) (splashTextArea.getX() + 10), (int) (splashTextArea.getY() + 15));
            mySplash.update();
        }
    }

    /**
     * Display a (very) basic progress bar
     *
     * @param pct how much of the progress bar to display 0-100
     */
    public static void splashProgress(int pct) {
        if (mySplash != null && mySplash.isVisible()) {

            splashGraphics.setPaint(Color.WHITE);
            splashGraphics.fill(splashProgressArea);

            splashGraphics.setPaint(Color.BLUE);
            splashGraphics.draw(splashProgressArea);

            int x = (int) splashProgressArea.getMinX();
            int y = (int) splashProgressArea.getMinY();
            int wid = (int) splashProgressArea.getWidth();
            int hgt = (int) splashProgressArea.getHeight();

            int doneWidth = Math.round(pct * wid / 100.f);
            doneWidth = Math.max(0, Math.min(doneWidth, wid - 1));

            splashGraphics.setPaint(Color.GREEN);
            splashGraphics.fillRect(x, y + 1, doneWidth, hgt - 1);

            mySplash.update();
        }
    }

    public void agregarPestaña(JPanel JPanel, String nombreTab, Icon icono) {
        boolean fl = false;
        int tabSeleccionado = 0;
        try {
            for (int i = 0; i < jTabbedPane1.getTabCount(); i++) {
                if (jTabbedPane1.getTitleAt(i).equals(nombreTab)) {
                    fl = true;
                    tabSeleccionado = i;
                }
            }
            if (fl) {
                jTabbedPane1.setSelectedIndex(tabSeleccionado);
            } else {
                jTabbedPane1.addTab(nombreTab, icono, JPanel);
                jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount() - 1);
                if (jTabbedPane1.getComponentCount() > 1) {

                    //FALTA AGREGAR BOTON DE ELIMINAR
//                    eliminarPestania.setEnabled(true);
                }
            }
        } catch (Exception e) {
            System.out.println("Agregando pestaña: " + e);
        }
        if (jTabbedPane1.getTabCount() > 1) {
            eliminar.setEnabled(true);

        }
    }

    /**
     * Devuelve Icon con la ruta dada o null si es inválida
     */
    public Icon createIcon(String ruta) {
        java.net.URL imgURL = getClass().getResource(ruta);

        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Archivo no encontrado: " + ruta);
            return null;
        }
    }
}
