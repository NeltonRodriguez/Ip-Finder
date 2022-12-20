import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpFinderProgram {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("IP Finder Progrma");
        jFrame.setBounds(100,100,1000,100);
        jFrame.setVisible(true);


        // IP Finder program
        JLabel label = new JLabel("Enter URL: ");
        label.setBounds(50,70,150,20);

        JTextField textField = new JTextField();
        textField.setBounds(50,100,200,20);

        JButton button = new JButton("Find IP");
        button.setBounds(50,150,80,30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = textField.getText();
                try{
                    InetAddress ia = InetAddress.getByName(url);
                    String ip = ia.getHostAddress();
                    JOptionPane.showMessageDialog(jFrame, ip);

                } catch (UnknownHostException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        jFrame.add(textField);
        jFrame.add(label);
        jFrame.add(button);

        jFrame.setLayout(new GridLayout());


    }
}