import javax.swing.*;

public class StudentRegistration {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Registration");
        f.setSize(400, 350);
        f.setLayout(null);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(40, 40, 100, 30);

        JTextField name = new JTextField();
        name.setBounds(150, 40, 180, 30);

        JLabel l2 = new JLabel("Register No:");
        l2.setBounds(40, 80, 100, 30);

        JTextField reg = new JTextField();
        reg.setBounds(150, 80, 180, 30);

        JLabel l3 = new JLabel("Gender:");
        l3.setBounds(40, 120, 100, 30);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150, 120, 70, 30);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(220, 120, 80, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        JLabel l4 = new JLabel("Department:");
        l4.setBounds(40, 160, 100, 30);

        String[] dept = {"CSE", "ECE", "EEE", "MECH"};
        JComboBox<String> cb = new JComboBox<>(dept);
        cb.setBounds(150, 160, 180, 30);

        JButton submit = new JButton("Submit");
        submit.setBounds(140, 220, 100, 30);

        submit.addActionListener(e -> {
            String gender = male.isSelected() ? "Male" : "Female";

            JOptionPane.showMessageDialog(f,
                    "Name: " + name.getText() +
                    "\nRegister No: " + reg.getText() +
                    "\nGender: " + gender +
                    "\nDepartment: " + cb.getSelectedItem());
        });

        f.add(l1); f.add(name);
        f.add(l2); f.add(reg);
        f.add(l3); f.add(male); f.add(female);
        f.add(l4); f.add(cb);
        f.add(submit);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}