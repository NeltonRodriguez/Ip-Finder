import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounterProgram {
    public static void main(String[] args) {
        // Word Counter

        JFrame jFrame = new JFrame("Word counter");
        jFrame.setLayout(null);
        jFrame.setBounds(100, 100, 500, 500);
        jFrame.setVisible(true);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 50, 300, 200);

        JButton button = new JButton("Check");
        button.setBounds(180, 300, 100, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 1st: Get text from TextArea
                String text = textArea.getText();

                // 2nd: Splitting up the string and storing word into []
                if (!text.equals("")) {
                    String[] word = text.split("\\s");

                    // 3rd: Display the results of words
                    JOptionPane.showMessageDialog(jFrame, "Total words are: " + word.length);
                }
            }
        });

        jFrame.add(textArea);
        jFrame.add(button);

    }

}
