
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FirstPage extends javax.swing.JFrame {
    public String vehicleType, engineType, enginePower, tireSize;
    public int modelNo;
    String string;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet;
    public FirstPage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        modelNoTextField = new javax.swing.JTextField();
        vehicleTypeComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        engineTypeComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        enginePowerTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tireSizeTextField = new javax.swing.JTextField();
        addVehicle = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        modelNoTextField2 = new javax.swing.JTextField();
        removeVehicle = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showVehiclesList = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        showVehicle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("Vehicle Manager");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Model No:");

        modelNoTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modelNoTextField.setForeground(new java.awt.Color(51, 0, 0));

        vehicleTypeComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vehicleTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chose Vehicle Type", "Normal Vehicle", "Sports Vehicle", "Heavy Vehicle" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Vehicle Type:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Engine Type:");

        engineTypeComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        engineTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chose Engine Type", "Oil", "Gas", "Disel" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Engine Power:");

        enginePowerTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enginePowerTextField.setForeground(new java.awt.Color(51, 0, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tire Size:");

        tireSizeTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tireSizeTextField.setForeground(new java.awt.Color(51, 0, 0));

        addVehicle.setBackground(new java.awt.Color(0, 102, 102));
        addVehicle.setForeground(new java.awt.Color(204, 255, 204));
        addVehicle.setText("Add Vehicle");
        addVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehicleActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Model No:");

        modelNoTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modelNoTextField2.setForeground(new java.awt.Color(51, 0, 0));

        removeVehicle.setBackground(new java.awt.Color(51, 0, 0));
        removeVehicle.setForeground(new java.awt.Color(255, 204, 204));
        removeVehicle.setText("Remove Vehicle");
        removeVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeVehicleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(removeVehicle)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(25, 25, 25)
                        .addComponent(modelNoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tireSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(engineTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel2)
                                    .addGap(26, 26, 26)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(modelNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(vehicleTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enginePowerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(engineTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enginePowerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tireSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addVehicle)
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelNoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeVehicle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        showVehiclesList.setBackground(new java.awt.Color(204, 255, 255));
        showVehiclesList.setForeground(new java.awt.Color(0, 51, 51));
        jScrollPane1.setViewportView(showVehiclesList);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("All Vehicles");

        showVehicle.setText("Show Vehicles");
        showVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showVehicleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showVehicle)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(169, 169, 169))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showVehicle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehicleActionPerformed
        vehicleType = vehicleTypeComboBox.getSelectedItem().toString();
        modelNo = Integer.parseInt(modelNoTextField.getText());
        engineType = engineTypeComboBox.getSelectedItem().toString();
        enginePower = enginePowerTextField.getText();
        tireSize = tireSizeTextField.getText();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle_showroom","root","");
            statement = connection.createStatement();
            statement.execute("INSERT INTO `vehicles`(`model_no`, `vehicle_type`, `engine_type`, `engine_power`, `tire_size`) VALUES ("+modelNo+",\""+vehicleType+"\",\""+engineType+"\",\""+enginePower+"\",\""+tireSize+"\")");
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(this, "Added Model: "+modelNo);
        modelNoTextField.setText("");
        enginePowerTextField.setText("");
        tireSizeTextField.setText("");
    }//GEN-LAST:event_addVehicleActionPerformed

    private void removeVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeVehicleActionPerformed
        modelNo = Integer.parseInt(modelNoTextField2.getText());
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle_showroom","root","");
            statement = connection.createStatement();
            statement.execute("DELETE FROM `vehicles` WHERE model_no = "+modelNo);
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(this, "Removed Model: "+modelNo);
        modelNoTextField2.setText("");
    }//GEN-LAST:event_removeVehicleActionPerformed

    private void showVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showVehicleActionPerformed
        try {
            showVehicles();
        } catch (SQLException ex) {
            Logger.getLogger(FirstPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showVehicleActionPerformed
    
    private void showVehicles() throws SQLException{
        ArrayList<String> list=new ArrayList<String>();  
        list.add("Model No: "); 
        list.add("Vehicle Type: ");    
        list.add("Engine Type: ");    
        list.add("Engine Power: ");
        list.add("Tire Size: ");
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle_showroom","root","");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM `vehicles`");
        } catch (Exception e) {
        }
        DefaultListModel defaultListModel = new DefaultListModel();
        while(resultSet.next()){
            defaultListModel.addElement("########################################");
            for (int i = 1; i <= 5; i++ ){
                if(i==1)
                    string = ""+list.get(i-1)+ resultSet.getInt(i);
                else
                    string = ""+list.get(i-1)+ resultSet.getString(i);
                defaultListModel.addElement(string);
            }
        }
        defaultListModel.addElement("########################################");
        showVehiclesList.setModel(defaultListModel);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstPage().setVisible(true);               
            }
        });
        try {
            new FirstPage().showVehicles();
        } catch (SQLException ex) {
            Logger.getLogger(FirstPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVehicle;
    private javax.swing.JTextField enginePowerTextField;
    private javax.swing.JComboBox<String> engineTypeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modelNoTextField;
    private javax.swing.JTextField modelNoTextField2;
    private javax.swing.JButton removeVehicle;
    private javax.swing.JButton showVehicle;
    private javax.swing.JList<String> showVehiclesList;
    private javax.swing.JTextField tireSizeTextField;
    private javax.swing.JComboBox<String> vehicleTypeComboBox;
    // End of variables declaration//GEN-END:variables
}
