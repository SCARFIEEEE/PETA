import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class MainMenu implements ActionListener{    
    
    JFrame main_frame = new JFrame();
    JPanel header = new JPanel();
    ImageIcon image = new ImageIcon("logo.png");
    JLabel label = new JLabel();
    JButton check_inventory = new JButton();
    JButton manage_inventory = new JButton();
    
    MainMenu(){
        //header
        label.setIcon(image);
        label.setBounds(0, 0, 500, 150);
        
        //Buttons
        //Check inventory button
        check_inventory.setBounds(0, 155, 240, 100);
        check_inventory.setBackground(Color.pink);
        check_inventory.setForeground(Color.black);
        check_inventory.setText("Check");
        check_inventory.setFont(new Font("Comic Sans", Font.BOLD, 22));
        check_inventory.addActionListener(this);
        
        //Manage inventory button
        manage_inventory.setBounds(245, 155, 240, 100);
        manage_inventory.setBackground(Color.pink);
        manage_inventory.setForeground(Color.black);
        manage_inventory.setText("Manage");
        manage_inventory.setFont(new Font("Comic Sans", Font.BOLD, 22));
        manage_inventory.addActionListener(this);
        
        main_frame.add(header);
        main_frame.add(check_inventory);
        main_frame.add(manage_inventory);
        
        //Main Frame (Do Not Touch)
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.setSize(500, 300);
        main_frame.add(label);
        main_frame.setLayout(null);
        main_frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==check_inventory){
            main_frame.dispose();
            check_inventory checkinv = new check_inventory();
        }
        else if(e.getSource()==manage_inventory){
            main_frame.dispose();
            manage_inventory manageinv = new manage_inventory();
        }
    }
}

