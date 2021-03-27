import java.awt.event.ActionListener;

import  javax.swing.*;

public class CalView extends JFrame{

    private JTextField firNum = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secNum = new JTextField(10);
    private JButton calButton = new JButton("Cal");
    private JTextField calcSolution = new JTextField(10);

    CalView() {

        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firNum);
        calcPanel.add(additionLabel);
        calcPanel.add(secNum);
        calcPanel.add(calButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);

    }

    public int getFirstNumber() {
        return Integer.parseInt(firNum.getText());
    }


    public int getFirstNumber() {
        return Integer.parseInt(firNum.getText());
    }

    public int getFirstNumber() {
        return Integer.parseInt(firNum.getText());
    }
}
