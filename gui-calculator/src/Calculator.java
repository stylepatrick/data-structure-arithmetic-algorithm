import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JLabel panel1 = new JLabel("Wert 1");
    JTextField textField1 = new JTextField(8);
    JLabel panel2 = new JLabel("Wert 2");
    JTextField textField2 = new JTextField(8);
    JTextField result = new JTextField(5);
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");

    Calculator() {
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);

        JPanel inputs = new JPanel(new FlowLayout());
        inputs.add(textField1);
        inputs.add(textField2);

        JPanel input1 = new JPanel(new GridLayout(2, 1));
        input1.add(panel1);
        input1.add(textField1);

        JPanel input2 = new JPanel(new GridLayout(2, 1));
        input2.add(panel2);
        input2.add(textField2);

        JPanel inputsPanel = new JPanel(new FlowLayout());
        inputsPanel.add(input1);
        inputsPanel.add(input2);

        JPanel buttons = new JPanel(new FlowLayout());
        buttons.add(buttonPlus);
        buttons.add(buttonMinus);

        JPanel panel = new JPanel(new GridLayout(3,1));
        panel.add(inputsPanel);
        panel.add(buttons);
        panel.add(result);

        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(500, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            int val1 = Integer.parseInt(textField1.getText());
            int val2 = Integer.parseInt(textField2.getText());
            int res = 0;
            if (e.getSource() == buttonPlus) {
                res = val1 + val2;
            } else if (e.getSource() == buttonMinus) {
                res = val1 - val2;
            }
            textField1.setText("");
            textField2.setText("");
            result.setText(String.valueOf(res));
        } catch (NumberFormatException ignored) {

        }
    }
}
