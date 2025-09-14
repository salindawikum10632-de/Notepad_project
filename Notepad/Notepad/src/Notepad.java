import javax.swing.*;
import java.awt.*;

public class Notepad extends JFrame {
    private JTextArea textArea;
    private JMenuBar menuBar;

    public Notepad() {
        // Initialize JFrame
        setTitle("Notepad");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Initialize JTextArea
        textArea = new JTextArea();
        add(new JScrollPane(textArea));

        // Initialize JMenuBar
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Add Edit menu
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);

        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        cutItem.addActionListener(e -> textArea.cut());
        copyItem.addActionListener(e -> textArea.copy());
        pasteItem.addActionListener(e -> textArea.paste());

        // Add Help menu
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        JMenuItem aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);

        aboutItem.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    this,
                    "Notepad Application\n\nDeveloped by: [RASW Perera]\nStudent ID: [s16780]\n\nA simple text editor with basic editing and formatting features.",
                    "About Notepad",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        // Add Format menu (optional)
        JMenu formatMenu = new JMenu("Format");
        menuBar.add(formatMenu);

        JMenuItem fontItem = new JMenuItem("Font");
        JMenuItem colorItem = new JMenuItem("Color");
        formatMenu.add(fontItem);
        formatMenu.add(colorItem);

        fontItem.addActionListener(e -> {
            JDialog fontDialog = new JDialog(this, "Choose Font", true);
            fontDialog.setLayout(new FlowLayout());
            fontDialog.setSize(300, 150);

            String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment()
                    .getAvailableFontFamilyNames();
            JComboBox<String> fontCombo = new JComboBox<>(fontNames);
            fontCombo.setSelectedItem(textArea.getFont().getFamily());

            Integer[] fontSizes = {10, 12, 14, 16, 18, 20, 24, 28, 32};
            JComboBox<Integer> sizeCombo = new JComboBox<>(fontSizes);
            sizeCombo.setSelectedItem(textArea.getFont().getSize());

            JButton applyButton = new JButton("Apply");
            applyButton.addActionListener(ae -> {
                String selectedFont = (String) fontCombo.getSelectedItem();
                int selectedSize = (Integer) sizeCombo.getSelectedItem();
                textArea.setFont(new Font(selectedFont, Font.PLAIN, selectedSize));
                fontDialog.dispose();
            });

            fontDialog.add(new JLabel("Font:"));
            fontDialog.add(fontCombo);
            fontDialog.add(new JLabel("Size:"));
            fontDialog.add(sizeCombo);
            fontDialog.add(applyButton);
            fontDialog.setLocationRelativeTo(this);
            fontDialog.setVisible(true);
        });

        colorItem.addActionListener(e -> {
            Color newColor = JColorChooser.showDialog(
                    this,
                    "Choose Text Color",
                    textArea.getForeground()
            );
            if (newColor != null) {
                textArea.setForeground(newColor);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Notepad notepad = new Notepad();
            notepad.setVisible(true);
        });
    }
}