package com.ua.robot.lesson1_10.lesson9;
public class ButtonTest extends javax.swing.JFrame {
    private javax.swing.JLabel jLabel1;


    public ButtonTest() {
        initComponents();

        changeLabelText();
    }

    private void changeLabelText() {
        if(jLabel1.getText().equals("1"))
            jLabel1.setText("2");
        else
            jLabel1.setText("1");
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        javax.swing.JButton jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("1");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, java.awt.BorderLayout.CENTER);

        jButton1.setText("Click");
        jButton1.addActionListener(evt -> changeLabelText());
        getContentPane().add(jButton1, java.awt.BorderLayout.PAGE_END);

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new ButtonTest().setVisible(true));
    }
}