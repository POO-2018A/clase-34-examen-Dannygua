
package prueba;

import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    double lado1C;
    double lado2C;
    double lado3C;

    public Ventana() {
        initComponents();
                txtLado1.setVisible(false);
                txtLado2.setVisible(false);
                txtLado3.setVisible(false);
                lblLado1.setVisible(false);
                lblLado2.setVisible(false);
                lblLado3.setVisible(false);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLado1 = new javax.swing.JLabel();
        lblLado2 = new javax.swing.JLabel();
        lblLado3 = new javax.swing.JLabel();
        boxTriangulos = new javax.swing.JComboBox<>();
        txtLado1 = new javax.swing.JTextField();
        txtLado2 = new javax.swing.JTextField();
        txtLado3 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblPerimetro = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Triangulos");

        jLabel2.setText("Tipo de Triangulo");

        lblLado1.setText("Lado 1");

        lblLado2.setText("Lado 2");

        lblLado3.setText("Lado3");

        boxTriangulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rectangulo", "Isosceles", "Escaleno", "Equilatero" }));
        boxTriangulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTriangulosActionPerformed(evt);
            }
        });

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel6.setText("Area");

        jLabel7.setText("Perimetro");

        jLabel8.setText("Altura");

        jLabel9.setText("Pesultados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLado3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLado1)
                                    .addComponent(lblLado2)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtLado1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                        .addComponent(txtLado2)))))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPerimetro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(btnCalcular)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(boxTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLado1)
                            .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLado2)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLado3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addComponent(btnCalcular)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxTriangulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTriangulosActionPerformed

        String op = ""+boxTriangulos.getSelectedItem();
        
        switch (op){
            case "Rectangulo":

                lblLado1.setText("Lado 1");
                lblLado2.setText("Lado 2");
                txtLado1.setVisible(true);
                txtLado2.setVisible(true);
                txtLado3.setVisible(false);
                lblLado1.setVisible(true);
                lblLado2.setVisible(true);
                lblLado3.setVisible(false);
                txtLado1.setText("");
                txtLado2.setText("");
                txtLado3.setText("");
              
                
                break;
            case "Isosceles":
                lblLado1.setText("Lado Repetido");
                lblLado2.setText("Base");
                txtLado1.setVisible(true);
                txtLado2.setVisible(true);
                txtLado3.setVisible(false);
                lblLado1.setVisible(true);
                lblLado2.setVisible(true);
                lblLado3.setVisible(false);
                txtLado1.setText("");
                txtLado2.setText("");
                txtLado3.setText("");
                
                break;
            case "Escaleno":
                lblLado1.setText("Lado 1");
                lblLado2.setText("Lado 2");
                txtLado1.setVisible(true);
                txtLado2.setVisible(true);
                txtLado3.setVisible(true);
                lblLado1.setVisible(true);
                lblLado2.setVisible(true);
                lblLado3.setVisible(true);
                txtLado1.setText("");
                txtLado2.setText("");
                txtLado3.setText("");
                
                break;
            case "Equilatero":
                lblLado1.setText("Lado 1");
                lblLado2.setText("Lado 2");
                txtLado1.setVisible(true);
                txtLado2.setVisible(false);
                txtLado3.setVisible(false);
                lblLado1.setVisible(true);
                lblLado2.setVisible(false);
                lblLado3.setVisible(false);
                txtLado1.setText("");
                txtLado2.setText("");
                txtLado3.setText("");
                
                break;
                
        }
            
        
    }//GEN-LAST:event_boxTriangulosActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        String op = ""+boxTriangulos.getSelectedItem();
        Metodos ob;
        
        switch (op){
            case "Rectangulo":
                if (!txtLado1.getText().equals("")&&!txtLado2.getText().equals("")){
        lado1C = Double.parseDouble(txtLado1.getText());
        lado2C = Double.parseDouble(txtLado1.getText());
                ob = new Rectangulo (lado1C,lado2C);
                lblArea.setText(""+ob.CalcularArea());
                lblPerimetro.setText(""+ob.CalcularPerimetro());
                lblAltura.setText(""+ob.CalcularAltura());

                }else{
                    JOptionPane.showMessageDialog(rootPane, "Ingrese los valores");
                }
                break;
            case "Isosceles":
                if (!txtLado1.getText().equals("")&&!txtLado2.getText().equals("")){
        lado1C = Double.parseDouble(txtLado1.getText());
        lado2C = Double.parseDouble(txtLado1.getText());
                ob = new Isosceles (lado1C,lado2C);
                lblArea.setText(""+ob.CalcularArea());
                lblPerimetro.setText(""+ob.CalcularPerimetro());
                lblAltura.setText(""+ob.CalcularAltura());
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Ingrese los valores");
                }

                
                break;
            case "Escaleno":
                if (!txtLado1.getText().equals("")&&!txtLado2.getText().equals("")&&!txtLado3.getText().equals("")){  
        lado1C = Double.parseDouble(txtLado1.getText());
        lado2C = Double.parseDouble(txtLado1.getText());
        lado3C = Double.parseDouble(txtLado1.getText());
                ob = new Escaleno (lado1C,lado2C,lado3C);
                lblArea.setText(""+ob.CalcularArea());
                lblPerimetro.setText(""+ob.CalcularPerimetro());
                lblAltura.setText(""+ob.CalcularAltura());
                                }else{
                    JOptionPane.showMessageDialog(rootPane, "Ingrese los valores");
                }


                
                break;
            case "Equilatero":
                
                if (!txtLado1.getText().equals("")){
        lado1C = Double.parseDouble(txtLado1.getText());                    
                ob = new Equilatero (lado1C);
                lblArea.setText(""+ob.CalcularArea());
                lblPerimetro.setText(""+ob.CalcularPerimetro());
                lblAltura.setText(""+ob.CalcularAltura());
                                }else{
                    JOptionPane.showMessageDialog(rootPane, "Ingrese los valores");
                }
                
                break;
                
        }        
        
                txtLado1.setText("");
                txtLado2.setText("");
                txtLado3.setText("");
        
    }//GEN-LAST:event_btnCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTriangulos;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblLado1;
    private javax.swing.JLabel lblLado2;
    private javax.swing.JLabel lblLado3;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JTextField txtLado1;
    private javax.swing.JTextField txtLado2;
    private javax.swing.JTextField txtLado3;
    // End of variables declaration//GEN-END:variables
}
