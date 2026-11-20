
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {

    JLabel title, userLabel, passLabel;
    JTextField username;
    JPasswordField password;
    JButton login, reset;

    LoginPage() {

        setTitle("Login Page");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        title = new JLabel("USER LOGIN");
        title.setBounds(130, 20, 200, 30);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        add(title);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 80, 100, 30);
        add(userLabel);

        username = new JTextField();
        username.setBounds(150, 80, 180, 30);
        add(username);

        passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 130, 100, 30);
        add(passLabel);

        password = new JPasswordField();
        password.setBounds(150, 130, 180, 30);
        add(password);

        login = new JButton("Login");
        login.setBounds(80, 190, 100, 30);
        login.addActionListener(this);
        add(login);

        reset = new JButton("Reset");
        reset.setBounds(200, 190, 100, 30);
        reset.addActionListener(this);
        add(reset);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == login) {

            String user = username.getText();
            String pass = new String(password.getPassword());

            if (user.equals("admin") && pass.equals("1234")) {
                JOptionPane.showMessageDialog(this,
                    "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this,
                    "Invalid Username or Password!");
            }
        }

        if (e.getSource() == reset) {
            username.setText("");
            password.setText("");
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
