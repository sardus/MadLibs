import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Fri Feb 28 16:56:57 MSK 2020
 */



/**
 * @author unknown
 */
public class MadLibs extends JFrame {
    public MadLibs() {
        initComponents();
    }

    private void btnGeneratorActionPerformed(ActionEvent e) {
        String adjective = txtAjective.getText();
        String color = txtColor.getText();
        String verb = txtPastTenseVerb.getText();
        String noun = txtNoun.getText();
        lblOutput.setText(color + " дракон " + verb + " " + adjective + " " + noun + ".\n" +
                "И все жили долго и счастливо. \n" +
                "Конец.");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        txtPastTenseVerb = new JTextField();
        txtColor = new JTextField();
        txtAjective = new JTextField();
        txtNoun = new JTextField();
        btnGenerator = new JButton();
        lblOutput = new JLabel();
        label2 = new JLabel();
        lblAdjective = new JLabel();
        lblColor = new JLabel();
        lblNoun = new JLabel();
        lblPastTenseVerb = new JLabel();

        //======== this ========
        setTitle("Andrei's MadLibs");
        var contentPane = getContentPane();

        //---- btnGenerator ----
        btnGenerator.setText("\u0421\u0433\u0435\u043d\u0435\u0440\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0432\u0441\u044f\u043a\u0443\u044e \u0435\u0440\u0443\u043d\u0434\u0443");
        btnGenerator.setFont(btnGenerator.getFont().deriveFont(btnGenerator.getFont().getStyle() | Font.BOLD));
        btnGenerator.addActionListener(e -> btnGeneratorActionPerformed(e));

        //---- lblOutput ----
        lblOutput.setText("\u0417\u0434\u0435\u0441\u044c \u043f\u043e\u044f\u0432\u0438\u0442\u0441\u044f \u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442 \u0432\u0430\u0448\u0435\u0439 \u0435\u0440\u0443\u043d\u0434\u044b...");
        lblOutput.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label2 ----
        label2.setText("\u0413\u0415\u041d\u0415\u0420\u0410\u0422\u041e\u0420 \u0421\u041b\u041e\u0412\u0415\u0421\u0422\u041d\u041e\u0419 \u0415\u0420\u0423\u041d\u0414\u042b \u041e\u0422 \u0410\u041d\u0414\u0420\u0415\u042f");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() | Font.BOLD));

        //---- lblAdjective ----
        lblAdjective.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043f\u0440\u0438\u043b\u0430\u0433\u0430\u0442\u0435\u043b\u044c\u043d\u043e\u0435");
        lblAdjective.setHorizontalAlignment(SwingConstants.RIGHT);

        //---- lblColor ----
        lblColor.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0446\u0432\u0435\u0442");
        lblColor.setHorizontalAlignment(SwingConstants.RIGHT);

        //---- lblNoun ----
        lblNoun.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0435");
        lblNoun.setHorizontalAlignment(SwingConstants.RIGHT);

        //---- lblPastTenseVerb ----
        lblPastTenseVerb.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0433\u043b\u0430\u0433\u043e\u043b \u043f\u0440\u043e\u0448\u0435\u0434\u0448\u0435\u0433\u043e \u0432\u0440\u0435\u043c\u0435\u043d\u0438");
        lblPastTenseVerb.setHorizontalAlignment(SwingConstants.RIGHT);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(lblOutput, GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addComponent(lblPastTenseVerb, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                                .addComponent(lblAdjective, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addComponent(txtPastTenseVerb, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                                .addComponent(txtAjective, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addComponent(lblColor, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                                .addComponent(lblNoun, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(0, 261, Short.MAX_VALUE)
                                            .addComponent(btnGenerator, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(txtNoun, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(txtColor, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
                            .addGap(14, 14, 14)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(15, 15, 15)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPastTenseVerb)
                        .addComponent(txtColor)
                        .addComponent(lblAdjective, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblColor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(34, 34, 34)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAjective)
                        .addComponent(txtNoun)
                        .addComponent(lblPastTenseVerb, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNoun, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(41, 41, 41)
                    .addComponent(btnGenerator, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(28, 28, 28)
                    .addComponent(lblOutput, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addGap(19, 19, 19))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    public String message = "";

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JTextField txtPastTenseVerb;
    private JTextField txtColor;
    private JTextField txtAjective;
    private JTextField txtNoun;
    private JButton btnGenerator;
    private JLabel lblOutput;
    private JLabel label2;
    private JLabel lblAdjective;
    private JLabel lblColor;
    private JLabel lblNoun;
    private JLabel lblPastTenseVerb;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public static void main(String[] args) {
        MadLibs MD = new MadLibs();
        MD.setSize(new Dimension(1000,500));
        MD.setVisible(true);

    }
}
