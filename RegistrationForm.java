import javax.swing.*;
import java.awt.*;
public class RegistrationForm {
    public static void main(String[] args) {
        System.out.println("RA2411026010330");
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(15);
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(15);
        JButton submitButton = new JButton("Submit");
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(submitButton);
        frame.setVisible(true);
    }
}

