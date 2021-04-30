
package timerApp;


import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Dejan
 */
public class Settings extends javax.swing.JFrame {

    SwingWorker sw;                                                           
    boolean start;
    long difference;
    int speed;
    
            
    
    public Settings() {
        initComponents();
        
        ImageIcon frameIcon = new ImageIcon("clock.png");                      
        setIconImage(frameIcon.getImage());                                    
        
        setLocationRelativeTo(null);                                           
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        chooseColorButton = new javax.swing.JButton();
        colorLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setText("on time:");
        jRadioButton1.setToolTipText("On tipe option!");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jFormattedTextField1, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jRadioButton1, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText("countdown (sec)");
        jRadioButton2.setToolTipText("Countdown option!");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jFormattedTextField2, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jRadioButton2, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setToolTipText("Set time to start app!");
        jFormattedTextField1.setEnabled(false);
        jFormattedTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
        jFormattedTextField2.setToolTipText("Set time to start app!");
        jFormattedTextField2.setEnabled(false);
        jFormattedTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        chooseColorButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chooseColorButton.setText("Choose color");
        chooseColorButton.setToolTipText("Choose color!");
        chooseColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseColorButtonActionPerformed(evt);
            }
        });

        colorLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        colorLabel.setText("No color selected");
        colorLabel.setToolTipText("Selected color!");

        speedLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedLabel.setText("Speed:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox1.setToolTipText("Choose a speed!");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jComboBox1, org.jdesktop.beansbinding.ELProperty.create("${selectedItem}"), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        startButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        startButton.setText("Start");
        startButton.setToolTipText("Press button to start app!");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        stopButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stopButton.setText("Stop");
        stopButton.setToolTipText("Press button to stop app!");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chooseColorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField1)
                            .addComponent(jFormattedTextField2)
                            .addComponent(colorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(speedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorLabel))
                .addGap(30, 30, 30)
                .addComponent(speedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseColorButtonActionPerformed
        
        ChooseColor ck = new ChooseColor();                                    
        colorLabel.setText(ck.toString());                                      
        colorLabel.setForeground(ck.c);                                         
        
        
    }//GEN-LAST:event_chooseColorButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
                                                                                
        jRadioButton1.setEnabled(false);                                        
        jRadioButton2.setEnabled(false);
        jFormattedTextField1.setEnabled(false);
        jFormattedTextField2.setEnabled(false);
        chooseColorButton.setEnabled(false);
        speedLabel.setEnabled(false);
        jComboBox1.setEnabled(false);
        startButton.setEnabled(false);
        
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");         
        Date systemTime = new Date(System.currentTimeMillis());                
        String sysTime = formatter.format(systemTime);                          
        
        Options opt = new Options();                                           
        opt.setColor(colorLabel.getForeground());                              
        opt.setSpeed(speed);                                                    
        
        
        if(jRadioButton1.isSelected()){                                         
            
            start = true;                                   
            
            Object set = jFormattedTextField1.getValue();                       
            String ot = (String)set;                                            
            opt.setOnTime(ot);                                                  
            
            try{
            SimpleDateFormat formatter1 = new SimpleDateFormat("HH:mm:ss");
            Date d1 = formatter1.parse(opt.getOnTime());                        
            Date d2 = formatter1.parse(sysTime);
            difference = d1.getTime() - d2.getTime();                           
            }
            catch(ParseException ex){
                
                JOptionPane.showMessageDialog(null, ex.getMessage());           
            }
            
            sw = new SwingWorker() {                                            
                
                @Override
                protected Object doInBackground() throws Exception {            
                    
                    Thread.sleep(difference);                                   
                    ChooseColor.colorFrame();                                   
                    while(start){                                               
                        ChooseColor.f.getContentPane().setBackground(Color.white); 
                        Thread.sleep(opt.getSpeed());                           
                        ChooseColor.f.getContentPane().setBackground(opt.getColor());    
                        Thread.sleep(opt.getSpeed());                           
                    }
                    return null;
                }
                @Override
                protected void done(){                                          
                    JOptionPane.showMessageDialog(null, "Changing color is finished!"); 
                    ChooseColor.f.dispose();                                    
                    opt.setColor(null);                                        
                    start = false;                                              
                }
            };
            sw.execute();                                                       
            
        }
        
        else if(jRadioButton2.isSelected()){                                    
            
            
            start = true;                                                       
            
            Object set = jFormattedTextField2.getValue();                       
            int cd = Integer.parseInt(set.toString());                          
            opt.setCountdown(cd);                                               
            
            sw = new SwingWorker() {                                            
                @Override
                protected Object doInBackground() throws Exception {            
                    
                  Thread.sleep(opt.getCountdown() * 1000);                     
                  ChooseColor.colorFrame();
                  while(start){
                      ChooseColor.f.getContentPane().setBackground(Color.white);    
                      Thread.sleep(opt.getSpeed());                             
                      ChooseColor.f.getContentPane().setBackground(opt.getColor()); 
                      Thread.sleep(opt.getSpeed());                             
                  }
                  return null;
                }
                @Override
                protected void done(){
                    JOptionPane.showMessageDialog(null, "Changing color is finished!"); 
                    ChooseColor.f.dispose();                                    
                    opt.setColor(null);                                         
                    start = false;                                              
                }
            };
            sw.execute();                                                       
            
        }
        else{
            
            JOptionPane.showMessageDialog(null, "You must select time option"); 
            
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        int cases = jComboBox1.getSelectedIndex();                              
        
        
        switch(cases){                                                          
            
            case 0:
                
                speed = 1000;                                                   
            
            break;
            case 1:
                
                speed = 2000;
                
            break; 
            case 2:
                
                speed = 3000;
                
            break; 
            case 3:
                
                speed = 4000;
                
            break; 
            case 4:
                
                speed = 5000;
                
            break; 
                
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
                                                                                
        sw.cancel(false);                                                                                                 
        
        jRadioButton1.setSelected(false);                                       
        jRadioButton1.setEnabled(true);
        jRadioButton2.setSelected(false);
        jRadioButton2.setEnabled(true);
        jFormattedTextField1.setText("");
        jFormattedTextField1.setEnabled(false);
        jFormattedTextField2.setText("");
        jFormattedTextField2.setEnabled(false);
        chooseColorButton.setEnabled(true);
        speedLabel.setEnabled(true);
        jComboBox1.setEnabled(true);
        startButton.setEnabled(true);
        colorLabel.setForeground(null);
        colorLabel.setText("No color selected!");
        
    }//GEN-LAST:event_stopButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton chooseColorButton;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
