import javax.swing.*;

public class SimpleTextEditor {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Text Editor");
        f.setSize(600, 400);

        JTextArea area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);

        JMenuBar bar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem newFile = new JMenuItem("New");
        JMenuItem clear = new JMenuItem("Clear");
        JMenuItem exit = new JMenuItem("Exit");

        JMenu edit = new JMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        newFile.addActionListener(e -> area.setText(""));
        clear.addActionListener(e -> area.setText(""));
        exit.addActionListener(e -> System.exit(0));

        cut.addActionListener(e -> area.cut());
        copy.addActionListener(e -> area.copy());
        paste.addActionListener(e -> area.paste());

        file.add(newFile);
        file.add(clear);
        file.add(exit);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        bar.add(file);
        bar.add(edit);

        f.setJMenuBar(bar);
        f.add(scroll);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}