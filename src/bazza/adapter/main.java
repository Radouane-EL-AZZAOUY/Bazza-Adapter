/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bazza.adapter;

import java.awt.Color;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author user
 */
public class main extends javax.swing.JFrame {

    ArrayList<String> nums = new ArrayList<>();
    String res = "";

    /**
     * Creates new form main
     */
    String getHandredNumber(String value) {
        for (int i = 0; i < 2; i++) {
            if (value.toCharArray()[0] == '0') {
                value = value.substring(1);
            }
        }
        String res = "";
        if (!value.equals("")) {
            int fiPart = Integer.parseInt(value.charAt(0)+ "");
            String sePart = value.substring(1);
            if (value.length() == 3) {
                res += fiPart == 1 ? " cent " : nums.get( fiPart) + " cent ";
                res += nums.get(Integer.parseInt(sePart));
            } else {
                if (!sePart.equals("00") && value.length() < 3) {
                    res += nums.get(Integer.parseInt(value));
                }
            }
        }
        return res;
    }

    String getThousndNumber(String value) {
        for (int i = 0; i < 2; i++) {
            if (value.toCharArray()[0] == '0') {
                value = value.substring(1);
            }
        }
        String res = "";
        if (!value.equals("")) {
            //int fiPart = Integer.parseInt(String.valueOf(value.charAt(0)));
            String fiPart = value.substring(0, value.length() - 3);
            String sePart = value.substring(value.length() - 3);
            if (value.length() > 3 && value.length() <= 6) {
                res += fiPart.equals("1") ? " mille " :getHandredNumber(fiPart) + " mille ";
                res += getHandredNumber(sePart);

                //JOptionPane.showMessageDialog(null, "First Part: " + fiPart + " \n Second Part: " + sePart);
            }
        }
        return res;
    }

    String getMillionNumber(String value) {
        for (int i = 0; i < 2; i++) {
            if (value.toCharArray()[0] == '0') {
                value = value.substring(1);
            }
        }
        String res = "";
        if (!value.equals("")) {
            //int fiPart = Integer.parseInt(String.valueOf(value.charAt(0)));
            String fiPart = value.substring(0, value.length() - 6);
            String sePart = value.substring(value.length() - 6);
            if (value.length() > 6 && value.length() <= 9) {
                res += getHandredNumber(fiPart) + " million ";
                res += getThousndNumber(sePart);
                //JOptionPane.showMessageDialog(null, "First Part: " + fiPart + " \n Second Part: " + sePart);
            }
        }
        return res;
    }

    public main() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] list = {
            "Zéro", "Un", "Deux", "Trois", "Quatre", "Cinq", "Six", "Sept", "Huit", "Neuf",
            "Dix", "Onze", "Douze", "Treize", "Quatorze", "Quinze", "Seize", "Dix-sept", "Dix-huit", "Dix-neuf",
            "Vingt", "Vingt et un", "Vingt-deux", "Vingt-trois", "Vingt-quatre", "Vingt-cinq", "Vingt-six", "Vingt-sept", "Vingt-huit", "Vingt-neuf",
            "Trente", "Trente et un", "Trente-deux", "Trente-trois", "Trente-quatre", "Trente-cinq", "Trente-six", "Trente-sept", "Trente-huit", "Trente-neuf",
            "Quarante", "Quarante et un", "Quarante-deux", "Quarante-trois", "Quarante-quatre", "Quarante-cinq", "Quarante-six", "Quarante-sept", "Quarante-huit", "Quarante-neuf",
            "Cinquante", "Cinquante et un", "Cinquante-deux", "Cinquante-trois", "Cinquante-quatre", "Cinquante-cinq", "Cinquante-six", "Cinquante-sept", "Cinquante-huit", "Cinquante-neuf",
            "Soixante", "Soixante et un", "Soixante-deux", "Soixante-trois", "Soixante-quatre", "Soixante-cinq", "Soixante-six", "Soixante-sept", "Soixante-huit", "Soixante-neuf",
            "Soixante-dix", "Soixante et onze", "Soixante-douze", "Soixante-treize", "Soixante-quatorze", "Soixante-quinze", "Soixante-seize", "Soixante-dix-sept", "Soixante-dix-huit", "Soixante-dix-neuf",
            "Quatre-vingts", "Quatre-vingt-un", "Quatre-vingt-deux", "Quatre-vingt-trois", "Quatre-vingt-quatre", "Quatre-vingt-cinq", "Quatre-vingt-six", "Quatre-vingt-sept", "Quatre-vingt-huit", "Quatre-vingt-neuf",
            "Quatre-vingt-dix", "Quatre-vingt-onze", "Quatre-vingt-douze", "Quatre-vingt-treize", "Quatre-vingt-quatorze", "Quatre-vingt-quinze", "Quatre-vingt-seize", "Quatre-vingt-dix-sept", "Quatre-vingt-dix-huit", "Quatre-vingt-dix-neuf"
        };
        nums.addAll(Arrays.asList(list));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        numView = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("تحويل");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 255, 0));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("نسخ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Bazza Adapter");

        numInput.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        numInput.setForeground(new java.awt.Color(0, 153, 255));
        numInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numInput.setToolTipText("");
        numInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        numInput.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                numInputInputMethodTextChanged(evt);
            }
        });
        numInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numInputActionPerformed(evt);
            }
        });

        jLabel2.setText("اكتب الرقم ثم اظغط على \"تحويل\"");

        jLabel3.setText("ترجمة الرقم باللغة الفرنسية اظغط على \"نسخ\"");

        numView.setColumns(20);
        numView.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        numView.setRows(5);
        jScrollPane1.setViewportView(numView);

        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(numInput, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numInput, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numInput, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String inputValue = numInput.getText();
        String[] valueTable;

        if (inputValue.equals("")) {
            JOptionPane.showMessageDialog(null, "أدخل رقما للقيام بعملية التحويل");
            numInput.setBorder(BorderFactory.createLineBorder(new Color(255, 0, 51)));
            return;
        } else {
            numInput.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        }
        if (inputValue.contains(",")) {
            valueTable = inputValue.split(",");
        } else {
            valueTable = inputValue.split("\\.");
        }
        res = "";
        if (valueTable[0].length() < 4) {
            res += getHandredNumber(valueTable[0]);
        } else if (valueTable[0].length() < 7) {
            res += getThousndNumber(valueTable[0]);
        } else if (valueTable[0].length() < 10) {
            res += getMillionNumber(valueTable[0]);
        }

        res += " dirhams ";
        if (valueTable.length > 1) {
            res += " et ";
            if (valueTable[1].length() < 4) {
                res += getHandredNumber(valueTable[1]);
            } else if (valueTable[1].length() < 7) {
                res += getThousndNumber(valueTable[1]);
            } else if (valueTable[1].length() < 10) {
                res += getMillionNumber(valueTable[1]);
            }

            res += " centimes.";
        }
        res = res.toLowerCase();
        numView.setText(res);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Clipboard clipboard = getToolkit().getSystemClipboard();
        StringSelection txtSelected = new StringSelection(res);
        clipboard.setContents(txtSelected, null);
        JOptionPane.showMessageDialog(null, "تم نسخ النص");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void numInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numInputActionPerformed

    private void numInputInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_numInputInputMethodTextChanged

    }//GEN-LAST:event_numInputInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numInput;
    private javax.swing.JTextArea numView;
    // End of variables declaration//GEN-END:variables
}
