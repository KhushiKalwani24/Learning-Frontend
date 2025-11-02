import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class QuizForm {
    public static void main(String[] args) {
        System.out.println("RA2411026010330");
        JFrame frame = new JFrame("Quiz Form");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JLabel questionLabel = new JLabel("What is the capital of France?");
        JRadioButton option1 = new JRadioButton("Berlin");
        JRadioButton option2 = new JRadioButton("Madrid");
        JRadioButton option3 = new JRadioButton("Paris");
        JRadioButton option4 = new JRadioButton("Rome");
        ButtonGroup optionsGroup = new ButtonGroup();
        optionsGroup.add(option1);
        optionsGroup.add(option2);
        optionsGroup.add(option3);
        optionsGroup.add(option4);
        JButton submitButton = new JButton("Submit");
        frame.add(questionLabel);
        frame.add(option1);
        frame.add(option2);
        frame.add(option3);
        frame.add(option4);
        frame.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (option3.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Correct Answer!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Wrong Answer!");
                }
            }
        });
        frame.setVisible(true);
    }
}
