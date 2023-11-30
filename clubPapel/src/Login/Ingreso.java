
package Login;
import Ingreso.ConexionMySQL;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class Ingreso extends javax.swing.JFrame {

    //CONECCION CON BASE DE DATOS
    ConexionMySQL cc=new ConexionMySQL(); 
    Connection con=ConexionMySQL.GetConnection(); 

    
    public Ingreso() {
        initComponents();
         this.setMinimumSize(new Dimension(400, 600));
         //super("Centrar JFrame");	

      Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
      int height = pantalla.height;
      int width = pantalla.width;
      setSize(width/2, height/2);		

      setLocationRelativeTo(null);		
      setVisible(true);
      //this.setLocationRelativeTo(null);
     
        
    }


    @SuppressWarnings("unchecked")
    
         public void nombreusuario(String usuario) throws SQLException{
            String SQLL="select * from socios where idsocio= '" +usuario+ "'";
            Statement stL=con.createStatement();
            ResultSet rss=stL.executeQuery(SQLL);
            String nombreusuario = null; 
            if(rss.next()){
                
                nombreusuario=rss.getString("nombre");
           }
             JOptionPane.showMessageDialog(null,"BIENVENIDO SOCIO '" +nombreusuario+ "'");
    }            
    
    
    public void controlarUsuario()
    {
        int resultado;
       String pass=String.valueOf(txtcontraseña.getPassword());
       String usuario=txtusuario.getText();
      // int borrar=0;
       
       String SQL="select * from usuario where idsocio= '" +usuario+ "' and contraseña= '" +pass+ "' ";
    
        try {
            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);

            if(rs.next()){
                String nivel_usuario; 
                nivel_usuario=rs.getString("tipo_usuario");
                resultado=1;
       
              
             if(resultado==1){
                 
                 
                   if("administrador".equals(nivel_usuario)){
              
                    Sistema form=new Sistema();
                    form.setVisible(true);
                    this.dispose();
                      
                    nombreusuario(usuario);
          
                    }else if("socio".equals(nivel_usuario)){
                    SistemaSocio form=new SistemaSocio();
                    form.setVisible(true);
                    this.dispose();
                    nombreusuario(usuario);
                   }else if("trabajador".equals(nivel_usuario)){
                    SistemaTrabajador form=new SistemaTrabajador();
                    form.setVisible(true);
                    this.dispose();
                   }
                }
                }
                  
       
                
        
    } catch (HeadlessException | SQLException e)
    {
        JOptionPane.showMessageDialog(null,"USUARIO O CONTRASEÑA INCORRECTAS");
    }
    }
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpingreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btningresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(477, 200));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpingreso.setBackground(new java.awt.Color(204, 204, 255));
        jpingreso.setMinimumSize(new java.awt.Dimension(200, 300));
        jpingreso.setPreferredSize(new java.awt.Dimension(370, 335));
        jpingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CONTRASEÑA");
        jpingreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 80, 20));

        jLabel2.setText("USUARIO");
        jpingreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 80, 20));

        txtusuario.setForeground(new java.awt.Color(0, 16, 240));
        txtusuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpingreso.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 120, 30));

        txtcontraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpingreso.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 120, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logiiiiinnn.png"))); // NOI18N
        jpingreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 270, -1));

        btningresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btningresar.setForeground(new java.awt.Color(0, 0, 204));
        btningresar.setText("INGRESAR");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        jpingreso.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(388, 388, 388))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(625, 625, 625))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jpingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(609, 609, 609))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
   controlarUsuario();
    }//GEN-LAST:event_btningresarActionPerformed

void nombreusuario(){


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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ingreso().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btningresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpingreso;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
