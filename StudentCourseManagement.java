import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentCourseManagement {
    public static void main(String[] args) {
        JFrame f = new JFrame("Course Management");
        f.setSize(600, 400);
        f.setLayout(null);

        String[] courses = {"Java", "Python", "C++", "Data Structures"};
        JList<String> list = new JList<>(courses);

        JScrollPane listScroll = new JScrollPane(list);
        listScroll.setBounds(30, 40, 150, 120);

        String[] columns = {"Student Name", "Course", "Status"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);

        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setBounds(200, 40, 350, 150);

        JButton add = new JButton("Add");
        add.setBounds(50, 220, 100, 30);

        JButton remove = new JButton("Remove");
        remove.setBounds(170, 220, 100, 30);

        add.addActionListener(e -> {
            String course = list.getSelectedValue();

            if (course != null) {
                model.addRow(new Object[]{"Student", course, "Enrolled"});
            }
        });

        remove.addActionListener(e -> {
            int row = table.getSelectedRow();

            if (row != -1) {
                model.removeRow(row);
            }
        });

        f.add(listScroll);
        f.add(tableScroll);
        f.add(add);
        f.add(remove);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}