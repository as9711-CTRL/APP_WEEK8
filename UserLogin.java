import javax.swing.*;

public class UserLogin {
    public static void main(String[] args) {
        JFrame f = new JFrame("User Login");
        f.setSize(400, 300);
        f.setLayout(null);

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(40, 40, 100, 30);

        JTextField user = new JTextField();
        user.setBounds(150, 40, 180, 30);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(40, 80, 100, 30);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(150, 80, 180, 30);

        JCheckBox remember = new JCheckBox("Remember Me");
        remember.setBounds(40, 130, 130, 30);

        JCheckBox notify = new JCheckBox("Receive Notifications");
        notify.setBounds(170, 130, 170, 30);

        JButton login = new JButton("Login");
        login.setBounds(140, 190, 100, 30);

        login.addActionListener(e -> {
            if (user.getText().equals("admin") &&
                new String(pass.getPassword()).equals("1234")) {
                JOptionPane.showMessageDialog(f, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(f, "Invalid Username or Password");
            }
        });

        f.add(l1); f.add(user);
        f.add(l2); f.add(pass);
        f.add(remember); f.add(notify);
        f.add(login);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}