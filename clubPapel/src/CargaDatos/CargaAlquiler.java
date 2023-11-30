package CargaDatos;

import Ingreso.ConexionMySQL;
import Login.Sistema;
import com.itextpdf.text.DocumentException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author maxii
 */
public class CargaAlquiler extends javax.swing.JFrame {
         //CONECCION CON BASE DE DATOS
    ConexionMySQL cc=new ConexionMySQL(); 
    Connection con=ConexionMySQL.GetConnection(); 

    /**
     * Creates new form CargaAlquiler
     */
    public CargaAlquiler() {
        initComponents();
        this.setLocationRelativeTo(null);
         this.txthora.setText("");
        
        
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
        lblhora = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblFechaa = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txthora = new javax.swing.JTextField();
        txthorafija = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        btncargar = new javax.swing.JToggleButton();
        lbldireccion = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnfecha = new com.toedter.calendar.JDateChooser();
        lblprecio = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        cbxgrilla = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblhora.setText("HORA:");

        lblnombre.setText("NOMBRE:");

        lblFechaa.setText("FECHA:");

        lblapellido.setText("HORA FIJA");

        txttelefono.setText("Telefono");
        txttelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttelefonoMouseClicked(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        txthora.setText("Horaa");
        txthora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txthoraMouseClicked(evt);
            }
        });

        txthorafija.setText("hora fija");
        txthorafija.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txthorafijaMouseClicked(evt);
            }
        });
        txthorafija.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthorafijaKeyTyped(evt);
            }
        });

        txtnombre.setText("Nombre");
        txtnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnombreMouseClicked(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        btncargar.setText("CARGAR ALQUILER");
        btncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarActionPerformed(evt);
            }
        });

        lbldireccion.setText("DIRECCION:");

        lbltelefono.setText("TELEFONO:");

        txtdireccion.setText("Direccion");
        txtdireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdireccionMouseClicked(evt);
            }
        });

        jLabel1.setText(" ALQUILER:");

        lblprecio.setText("PRECIO:");

        txtprecio.setText("precio");
        txtprecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtprecioMouseClicked(evt);
            }
        });
        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });

        cbxgrilla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salon ", "Cancha" }));

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel14.setText("Clup Papel Misonero ");

        jLabel15.setText("Tel- 3743-591444");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        jLabel16.setText("jLabel3");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel15))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefono)
                    .addComponent(lblFechaa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(txthorafija, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblnombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxgrilla, 0, 105, Short.MAX_VALUE)
                            .addComponent(txtdireccion))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncargar)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblnombre)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblhora)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblapellido)
                    .addComponent(txthorafija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefono)
                    .addComponent(btncargar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxgrilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldireccion)
                            .addComponent(lblprecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaa))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarActionPerformed
         //VARIABLE HORA
        int horaa=Integer.parseInt(txthora.getText());
        int minuto=0;
        int segundo=0;
        DateFormat jjj = new SimpleDateFormat("hh:mm:ss");
        Time hora = new Time(horaa,minuto,segundo);  
        //Variable Fecha
        java.util.Date date = new java.util.Date();
        java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(btnfecha.getDate());
        int resultado=0;
      
      
      String admin = (String) cbxgrilla.getSelectedItem();
      int  idalquiler=0;
  
         //CONTROLAR QUE NO AYA UN ALQUILER IGUAL
      if(admin=="Cancha"){
        
            try {
                
                idalquiler=1;
                String SQL="select * from alquiler where idalquiler= '" +idalquiler+ "' and fecha= '" +fecha+ "' and hora= '" +hora+ "' ";
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(SQL);
                
                if(rs.next()){
                    resultado=1;
                    JOptionPane.showMessageDialog(null,"Esta Fecha esta Ocupada ");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CargaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
            }
     }else if(admin=="Salon"){
            try {
                idalquiler=2;
                String SQL="select * from alquiler where idalquiler= '" +idalquiler+ "' and fecha= '" +fecha+ "' ";
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(SQL);
                
                if(rs.next()){
                    resultado=1;
                      JOptionPane.showMessageDialog(null,"Esta Fecha o Hora esta Ocupada ");
                }
                
            }catch (SQLException ex) {
                        Logger.getLogger(CargaSocios.class.getName()).log(Level.SEVERE, null, ex);
                          
                    }
     }   
                 //CONTROLO QUE LOS CAMPOS NO ESTEN VACIOS
                JOptionPane.showMessageDialog(null,"4 ");
                if(txtprecio.getText()==null)
                {
                    JOptionPane.showMessageDialog(null,"falta Precio");
                    resultado=1;
                }else if(txthora.getText()==null)
                {
                    JOptionPane.showMessageDialog(null,"falta Hora");
                    resultado=1;
                }else if(txtnombre.getText()==null)
                {
                    JOptionPane.showMessageDialog(null,"falta Nombre");
                    resultado=1;
                }else if(txthorafija.getText()==null)
                {
                    JOptionPane.showMessageDialog(null,"falta Hora fija");
                    resultado=1;
                }else if(txtdireccion.getText()==null)
                {
                    JOptionPane.showMessageDialog(null,"falta direccion");
                    resultado=1;
                }else if(btnfecha.getDate()==null)
                {
                    JOptionPane.showMessageDialog(null,"falta fecha");
                    resultado=1;
                }
                if(resultado==0){
            try {
                int precio=Integer.parseInt(txtprecio.getText());
                int idsocio=0;
                String nombre=String.valueOf(txtnombre.getText());
                String hora_fija="no";
                String direccion=String.valueOf(txtdireccion.getText());
                String telefono=String.valueOf(txttelefono.getText());
                int borrado=0;
                
                //CARGO LOS DATOS
                PreparedStatement pps;
                
                
                pps = con.prepareStatement("INSERT INTO alquiler(hora,fecha,hora_fija,idsocio,precio,idalquiler,nombre,direccion,telefono,borrado)" + "VALUES (?,?,?,?,?,?,?,?,?,?)");
                pps.setTime(1,hora);
                pps.setString(2,fecha);
                pps.setString(3,hora_fija);
                pps.setInt(4,idsocio);
                pps.setInt(5,precio);
                pps.setInt(6,idalquiler);
                pps.setString(7,nombre);
                pps.setString(8,direccion);
                pps.setString(9,telefono);
                pps.setInt(10,borrado);
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null,"inserto correcto");
                
                                  PlantillaAlquiler miplantilla= new PlantillaAlquiler(nombre,direccion,precio,"D:\\Universidad Analista\\programacion Patricia\\segundo parcial,final\\Club Papel\\Imagenes\\Imagenes\\Logo.png",admin,telefono,horaa,minuto,segundo,fecha);
                try {
                miplantilla.crearPlantilla();
                } catch (DocumentException ex) {
                Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(CargaAlquiler.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"inserto incorrectoo");
            }
               
                      
                        
    }//GEN-LAST:event_btncargarActionPerformed
    }                              

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
   char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
   char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtprecioKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
            char c = evt.getKeyChar();
        
        if( ( c != ' ')&&(c<'a' || c>'z') && (c<'A' )| c>'Z') evt.consume();
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txthorafijaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthorafijaKeyTyped
               char c = evt.getKeyChar();
        
        if( ( c != ' ')&&(c<'a' || c>'z') && (c<'A' )| c>'Z') evt.consume();
    }//GEN-LAST:event_txthorafijaKeyTyped

    private void txthoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txthoraMouseClicked
        this.txthora.setText("");
    }//GEN-LAST:event_txthoraMouseClicked

    private void txttelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttelefonoMouseClicked
           this.txttelefono.setText("");
    }//GEN-LAST:event_txttelefonoMouseClicked

    private void txtprecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtprecioMouseClicked
           this.txtprecio.setText("");
    }//GEN-LAST:event_txtprecioMouseClicked

    private void txtnombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreMouseClicked
           this.txtnombre.setText("");
    }//GEN-LAST:event_txtnombreMouseClicked

    private void txthorafijaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txthorafijaMouseClicked
          this.txthorafija.setText("");
    }//GEN-LAST:event_txthorafijaMouseClicked

    private void txtdireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdireccionMouseClicked
           this.txtdireccion.setText("");
    }//GEN-LAST:event_txtdireccionMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CargaAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargaAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargaAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargaAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargaAlquiler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btncargar;
    private com.toedter.calendar.JDateChooser btnfecha;
    private javax.swing.JComboBox<String> cbxgrilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblFechaa;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txthorafija;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
