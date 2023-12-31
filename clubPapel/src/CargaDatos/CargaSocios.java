/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargaDatos;
import Ingreso.ConexionMySQL;
import Login.Sistema;
import com.itextpdf.text.DocumentException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author maxii
 */
public class CargaSocios extends javax.swing.JFrame {

     //CONECCION CON BASE DE DATOS
    ConexionMySQL cc=new ConexionMySQL(); 
    Connection con=ConexionMySQL.GetConnection();
    
    
    public CargaSocios() {
        initComponents();
      this.setLocationRelativeTo(null);
      this.txtnombre.setText("");
    
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
        lblnombre = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        lbldni = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lbllocalidad = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtlocalidad = new javax.swing.JTextField();
        txtidpadre = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        lblidpadre = new javax.swing.JLabel();
        lblfechanacimiento = new javax.swing.JLabel();
        lblcorreoelectronico = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtcorreoelectronico = new javax.swing.JTextField();
        btncargardatos = new javax.swing.JButton();
        lbltipousuario = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JTextField();
        lblcontraseña = new javax.swing.JLabel();
        btnfecha = new com.toedter.calendar.JDateChooser();
        cbxgrilla = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblnombre.setText("NOMBRE:");

        lblapellido.setText("APELLIDO:");

        lbldni.setText("D.N.I.:");

        lbldireccion.setText("DIRECCION:");

        lbltelefono.setText("TELEFONO:");

        lbllocalidad.setText("LOCALIDAD:");

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

        txtdni.setText("DNI");
        txtdni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdniMouseClicked(evt);
            }
        });
        txtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdniActionPerformed(evt);
            }
        });
        txtdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdniKeyTyped(evt);
            }
        });

        txtapellido.setText("Apellido");
        txtapellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtapellidoMouseClicked(evt);
            }
        });
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });

        txtlocalidad.setText("Localidad");
        txtlocalidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtlocalidadMouseClicked(evt);
            }
        });
        txtlocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlocalidadKeyTyped(evt);
            }
        });

        txtidpadre.setText("ID Padre");
        txtidpadre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtidpadreMouseClicked(evt);
            }
        });
        txtidpadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidpadreKeyTyped(evt);
            }
        });

        txtdireccion.setText("Direccion");
        txtdireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdireccionMouseClicked(evt);
            }
        });

        lblidpadre.setText("ID PADRE:");

        lblfechanacimiento.setText("FECHA NACIMIENTO:");

        lblcorreoelectronico.setText("COREO ELECTRONIO:");

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

        txtcorreoelectronico.setText("Correo Eletronico");
        txtcorreoelectronico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcorreoelectronicoMouseClicked(evt);
            }
        });

        btncargardatos.setText("CARGAR DATOS");
        btncargardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargardatosActionPerformed(evt);
            }
        });

        lbltipousuario.setText("TIPO USUARIO:");

        txtcontraseña.setText("contraseña");
        txtcontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcontraseñaMouseClicked(evt);
            }
        });

        lblcontraseña.setText("CONTRASEÑA:");

        btnfecha.setDateFormatString("yyyy-MMM-dd");

        cbxgrilla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "socio", "trabajador" }));
        cbxgrilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxgrillaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Clup Papel Misonero ");

        jLabel2.setText("Tel- 3743-591444");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(lblcontraseña)
                        .addGap(18, 18, 18)
                        .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(btncargardatos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbldireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                        .addComponent(lbldni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(36, 36, 36))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbltipousuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(25, 25, 25))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtnombre)
                            .addComponent(txtapellido)
                            .addComponent(txtdni)
                            .addComponent(txtdireccion)
                            .addComponent(cbxgrilla, javax.swing.GroupLayout.Alignment.LEADING, 0, 91, Short.MAX_VALUE))
                        .addGap(182, 182, 182)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblidpadre)
                            .addComponent(lbllocalidad)
                            .addComponent(lblcorreoelectronico)
                            .addComponent(lblfechanacimiento)
                            .addComponent(lbltelefono))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtidpadre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtlocalidad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(txtcorreoelectronico, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltelefono)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltipousuario)
                            .addComponent(cbxgrilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnombre)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbllocalidad)
                            .addComponent(txtlocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblapellido)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblidpadre)
                            .addComponent(txtidpadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbldni)
                            .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblfechanacimiento)))
                    .addComponent(btnfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldireccion)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcorreoelectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcorreoelectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(lblcontraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncargardatos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncargardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargardatosActionPerformed

        //CONTROLO QUE LOS CAMPOS NO ESTEN VACIOS
        int resultado=0;
        if (txtnombre.getText()==null)
        {
            JOptionPane.showMessageDialog(null,"falta nombre");
            resultado=1;
        }else if(txtapellido.getText()==null)
        {
            JOptionPane.showMessageDialog(null,"falta apellido");
            resultado=1;
        }else if(txtdireccion.getText()==null)
        {
            JOptionPane.showMessageDialog(null,"falta direccion");
            resultado=1;
        }else if(txtlocalidad.getText()==null)
        {
            JOptionPane.showMessageDialog(null,"falta localidad");
            resultado=1;
        }else if(txtdni.getText()==null)
        {
            JOptionPane.showMessageDialog(null,"falta DNI");
            resultado=1;
        }else if(txttelefono.getText()==null)
        {
            JOptionPane.showMessageDialog(null,"falta TELEFONO");
            resultado=1;
        }else if(btnfecha.getDate()==null)
        {
            JOptionPane.showMessageDialog(null,"falta fecha");
            resultado=1;
        }else if(txtcontraseña.getText()==null)
        {
            JOptionPane.showMessageDialog(null,"falta contraseña");
            resultado=1;
        }
        int idpadre=0;
        if(txtidpadre.getText()== null){
            idpadre=1;
        }else {
            idpadre=Integer.parseInt(txtidpadre.getText());
        }

        if(resultado==0){
            try {
                String SQL="select idsocio from socios";
                int idsocio = 0;

                Statement st=con.createStatement();
                ResultSet mp=st.executeQuery(SQL);

                while(mp.next()){
                    // int idsocio;
                    idsocio=mp.getInt("idsocio");
                }
                int idsocioo=1+idsocio;

                int dni=Integer.parseInt(txtdni.getText());
                String  telefono =String.valueOf(txttelefono.getText());

                java.util.Date date = new java.util.Date();
                java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("yyyy-MM-dd");
                String fecha = sdf.format(btnfecha.getDate());
                String nombre=String.valueOf(txtnombre.getText());
                String apellido=String.valueOf(txtapellido.getText());
                String direccion=String.valueOf(txtdireccion.getText());
                String localidad=String.valueOf(txtlocalidad.getText());
                String correoelectronico=String.valueOf(txtcorreoelectronico.getText());
                int borrado=0;
                 String contraseniaa = String.valueOf(txtcontraseña.getText());
                //CARGO LOS DATOS
                PreparedStatement pps;
                try {
                    pps = con.prepareStatement("INSERT INTO socios(idsocio,nombre,apellido,dni,direccion,telefono,idlocalidad,idpadre,fecha_nacimiento,correo_electronico,borrado)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ? ,?,?,?)");
                    pps.setInt(1,idsocioo);
                    pps.setString(2,nombre);
                    pps.setString(3,apellido);
                    pps.setInt(4,dni);
                    pps.setString(5,direccion);
                    pps.setString(6,telefono);
                    pps.setString(7,localidad);
                    pps.setInt(8,idpadre);
                    pps.setString(9,fecha);
                    pps.setString(10,correoelectronico);
                    pps.setInt(11,borrado);
                    pps.executeUpdate();
                
                  plantilla miplantilla= new plantilla(nombre,apellido,idsocioo,"D:\\Universidad Analista\\programacion Patricia\\segundo parcial,final\\Club Papel\\Imagenes\\Imagenes\\Logo.png",contraseniaa);
        try {
            miplantilla.crearPlantilla();
        } catch (DocumentException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
                } catch (SQLException ex) {
                    Logger.getLogger(CargaSocios.class.getName()).log(Level.SEVERE, null, ex);
                }
                String admin = (String) cbxgrilla.getSelectedItem();
                
                String contrasenia = String.valueOf(txtcontraseña.getText());

             
                PreparedStatement rrs;
                try {
                    rrs = con.prepareStatement("INSERT INTO usuario(idsocio,tipo_usuario,contraseña)" + "VALUES (?, ? ,?)");
                    rrs.setInt(1,idsocioo);
                    rrs.setString(2,admin);
                    rrs.setString(3,contrasenia);
                    rrs.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Su Usuario y Contraseña Son:");
                    JOptionPane.showMessageDialog(null,"Usuario "+idsocioo+" Contraseña "+contrasenia);
                
      
                
                } catch (SQLException ex) {
                    Logger.getLogger(CargaSocios.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (SQLException ex) {
                Logger.getLogger(CargaSocios.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btncargardatosActionPerformed

    private void txtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdniActionPerformed

    private void txtdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdniKeyTyped
      char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtdniKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
          char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtidpadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidpadreKeyTyped
       char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtidpadreKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
     char c = evt.getKeyChar();
        
        if( ( c != ' ')&&(c<'a' || c>'z') && (c<'A' )| c>'Z') evt.consume();
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
         char c = evt.getKeyChar();
        
        if( ( c != ' ')&&(c<'a' || c>'z') && (c<'A' )| c>'Z') evt.consume();
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtlocalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlocalidadKeyTyped
         char c = evt.getKeyChar();
        
        if( ( c != ' ')&&(c<'a' || c>'z') && (c<'A' )| c>'Z') evt.consume();
    }//GEN-LAST:event_txtlocalidadKeyTyped

    private void txtnombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreMouseClicked

    private void txtapellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapellidoMouseClicked
         this.txtapellido.setText("");
    }//GEN-LAST:event_txtapellidoMouseClicked

    private void txtdniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdniMouseClicked
         this.txtdni.setText("");
    }//GEN-LAST:event_txtdniMouseClicked

    private void txtdireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdireccionMouseClicked
        this.txtdireccion.setText("");
    }//GEN-LAST:event_txtdireccionMouseClicked

    private void txttelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttelefonoMouseClicked
        this.txttelefono.setText("");
    }//GEN-LAST:event_txttelefonoMouseClicked

    private void txtlocalidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtlocalidadMouseClicked
       this.txtlocalidad.setText("");
    }//GEN-LAST:event_txtlocalidadMouseClicked

    private void txtidpadreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtidpadreMouseClicked
         this.txtidpadre.setText("");
    }//GEN-LAST:event_txtidpadreMouseClicked

    private void txtcorreoelectronicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcorreoelectronicoMouseClicked
         this.txtcorreoelectronico.setText("");
    }//GEN-LAST:event_txtcorreoelectronicoMouseClicked

    private void txtcontraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraseñaMouseClicked
        this.txtcontraseña.setText("");
    }//GEN-LAST:event_txtcontraseñaMouseClicked

    private void cbxgrillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxgrillaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxgrillaActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(CargaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargaSocios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncargardatos;
    private com.toedter.calendar.JDateChooser btnfecha;
    private javax.swing.JComboBox<String> cbxgrilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblcorreoelectronico;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lbldni;
    private javax.swing.JLabel lblfechanacimiento;
    private javax.swing.JLabel lblidpadre;
    private javax.swing.JLabel lbllocalidad;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltipousuario;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtcorreoelectronico;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtidpadre;
    private javax.swing.JTextField txtlocalidad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables



}
