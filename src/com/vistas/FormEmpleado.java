/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vistas;
import com.clases.Empleado;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class FormEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormEmpleado
     */
    public FormEmpleado() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jTxtApellido = new javax.swing.JTextField();
        jSEdad = new javax.swing.JSpinner();
        jRMasculino = new javax.swing.JRadioButton();
        jRFemenino = new javax.swing.JRadioButton();
        jTxtDui = new javax.swing.JFormattedTextField();
        jTxtNit = new javax.swing.JFormattedTextField();
        jCmbDepartamento = new javax.swing.JComboBox<>();
        jCmbCargo = new javax.swing.JComboBox<>();
        jTxtSalario = new javax.swing.JTextField();
        jTxtFecha = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jChMusica = new javax.swing.JCheckBox();
        jChDeportes = new javax.swing.JCheckBox();
        jChAutos = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setText("Datos de Empleado");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido: ");

        jLabel4.setText("Género:");

        jLabel5.setText("Edad:");

        jLabel6.setText("DUI:");

        jLabel7.setText("NIT:");

        jLabel8.setText("Departamento:");

        jLabel9.setText("Cargo:");

        jLabel10.setText("Salario:");

        jLabel11.setText("Año de Ingreso:");

        jTxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNombreKeyTyped(evt);
            }
        });

        jTxtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtApellidoKeyTyped(evt);
            }
        });

        jSEdad.setModel(new javax.swing.SpinnerNumberModel(18, 18, 60, 1));

        jRMasculino.setText("Masculino");

        jRFemenino.setText("Femenino");

        try {
            jTxtDui.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTxtNit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-######-###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtNit.setText("0101 - 010101 - 101 - 1");

        jCmbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su cargo", "Equipo de IT", "Finanzas", "Ventas", " " }));
        jCmbDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCmbDepartamentoItemStateChanged(evt);
            }
        });

        jCmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jTxtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtSalarioKeyTyped(evt);
            }
        });

        jTxtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtFechaKeyTyped(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMouseClicked(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel12.setText("Intereses:");

        jChMusica.setText("Música");

        jChDeportes.setText("Deportes");

        jChAutos.setText("Autos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRFemenino))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTxtFecha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtSalario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCmbCargo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCmbDepartamento, javax.swing.GroupLayout.Alignment.LEADING, 0, 158, Short.MAX_VALUE)
                                .addComponent(jTxtNit, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtDui, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSEdad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEnviar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jChMusica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jChDeportes))
                            .addComponent(jChAutos))))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRMasculino)
                    .addComponent(jRFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtDui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTxtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jCmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jChMusica)
                    .addComponent(jChDeportes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jChAutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar)
                    .addComponent(btnCancelar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //System.exit(0);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        procesar();
    }//GEN-LAST:event_btnEnviarMouseClicked

    private void jCmbDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCmbDepartamentoItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            if(this.jCmbDepartamento.getSelectedIndex()>0)
            {
                this.jCmbCargo.setModel(new DefaultComboBoxModel(this.llenarCargo(this.jCmbDepartamento.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_jCmbDepartamentoItemStateChanged

    private void jTxtSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtSalarioKeyTyped
        Character s= evt.getKeyChar();
       if(!Character.isDigit(s) && s!='.'){  
           evt.consume();
       }else if(s=='.'&&jTxtSalario.getText().contains(".")){ 
           evt.consume();
       }
    }//GEN-LAST:event_jTxtSalarioKeyTyped

    private void jTxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNombreKeyTyped
        Character s = evt.getKeyChar();
        if(!Character.isLetter(s) && s != KeyEvent.VK_SPACE)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTxtNombreKeyTyped

    private void jTxtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtApellidoKeyTyped
        Character s = evt.getKeyChar();
        if(!Character.isLetter(s) && s != KeyEvent.VK_SPACE)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTxtApellidoKeyTyped

    private void jTxtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtFechaKeyTyped
        Character s = evt.getKeyChar();
        if(!Character.isDigit(s))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTxtFechaKeyTyped

    public String[] llenarCargo(String departamento)
    {
        String cargo[] = new String[2];
        
        if(departamento.equalsIgnoreCase("Equipo de IT"))
        {
            cargo[0] = "Soporte Técnico";
            cargo[1] = "Desarrollador";
        }
        if(departamento.equalsIgnoreCase("Finanzas"))
        {
            cargo[0] = "Contador";
            cargo[1] = "Cajero";
        }
        if(departamento.equalsIgnoreCase("Ventas"))
        {
            cargo[0] = "Vendedor de Contratos";
            cargo[1] = "Gerente de Ventas";
        }        
        return cargo;
    }
    
    public void procesar()
    {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        Empleado e = new Empleado();
        e.setNombre(this.jTxtNombre.getText());
        e.setApellido(this.jTxtApellido.getText());
        e.setEdad(Integer.parseInt(this.jSEdad.getValue().toString()));
        if(this.jRMasculino.isSelected())
        {
            e.setGenero(this.jRMasculino.getText());
        }else if(this.jRFemenino.isSelected())
        {
            e.setGenero(this.jRFemenino.getText());
        }
        e.setDui(this.jTxtDui.getText());
        e.setNit(this.jTxtNit.getText());
        e.setDepartamento(this.jCmbDepartamento.getSelectedItem().toString());
        e.setCargo(this.jCmbCargo.getSelectedItem().toString());
        e.setSalario(Double.parseDouble(this.jTxtSalario.getText()));
        e.setFechaIngreso(Integer.parseInt(this.jTxtFecha.getText()));
        
        String acu = "";
        
        if(this.jChMusica.isSelected())
        {
            acu += this.jChMusica.getText() + ", ";
        }
        if(this.jChDeportes.isSelected())
        {
            acu += this.jChDeportes.getText() + ", ";
        }
        if(this.jChAutos.isSelected())
        {
            acu += this.jChAutos.getText() + ".";
        }
        e.setIntereses(acu);
        
        JOptionPane.showMessageDialog(null,"Datos del Empleado: "
                + "\nNombre: "+e.getNombre()
                + "\nApellido: "+e.getApellido()
                + "\nEdad: "+e.getEdad()
                + "\nGénero: "+e.getGenero()
                + "\nDUI: "+e.getDui()
                + "\nNIT: "+e.getNit()
                + "\nDepartamento: "+e.getDepartamento()
                + "\nCargo: "+e.getCargo()
                + "\nSalario: "+nf.format(e.getSalario())
                + "\nFecha de Ingreso: "+e.getFechaIngreso()
                + "\nIntereses: "+acu);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jChAutos;
    private javax.swing.JCheckBox jChDeportes;
    private javax.swing.JCheckBox jChMusica;
    private javax.swing.JComboBox<String> jCmbCargo;
    private javax.swing.JComboBox<String> jCmbDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRFemenino;
    private javax.swing.JRadioButton jRMasculino;
    private javax.swing.JSpinner jSEdad;
    private javax.swing.JTextField jTxtApellido;
    private javax.swing.JFormattedTextField jTxtDui;
    private javax.swing.JTextField jTxtFecha;
    private javax.swing.JFormattedTextField jTxtNit;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtSalario;
    // End of variables declaration//GEN-END:variables
}
