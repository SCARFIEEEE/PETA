import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.*;
import java.util.HashMap;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;

public class manage_inventory implements ActionListener{  
    HashMapClass hashMapClass = new HashMapClass();

    HashMap<String, String> myHashMap = hashMapClass.myHashMap;
    
    JFrame main_frame = new JFrame();
    ImageIcon image = new ImageIcon("logo.png");
    JLabel label = new JLabel();
    JButton back = new JButton();
    JButton add = new JButton();
    JButton subtract = new JButton();
    JButton check_inventory = new JButton();
    DefaultTableModel tableModel = new DefaultTableModel();
    JTable table = new JTable(tableModel);
    JPanel panel = new JPanel(new BorderLayout());
    JTextField item = new JTextField("Item name");
    JTextField quantity = new JTextField("Quantity");
    
    manage_inventory(){   
    label.setIcon(image);
    label.setBounds(0, 0, 500, 210);
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.BOTTOM);
    label.setFont(new Font("Basic",Font.PLAIN,40));
    
    item.setBounds(0, 200, 250, 30); 
    
    quantity.setBounds(250, 200, 250, 30);
    
    add.setBounds(90, 230, 150, 30);
    add.setText("Add Item");
    add.setFont(new Font("Comic Sans", Font.BOLD, 15));
    add.addActionListener(this);
    
    subtract.setBounds(260, 230, 150, 30);
    subtract.setText("Take Item");
    subtract.setFont(new Font("Comic Sans", Font.BOLD, 15));
    subtract.addActionListener(this);
    
    back.setBounds(0, 560, 250, 50);
    back.setText("Back to Main Menu");
    back.setFont(new Font("Comic Sans", Font.BOLD, 22));
    back.addActionListener(this);
        
    tableModel.addColumn("Item");
    tableModel.addColumn("Quantity");
        
    for (Map.Entry<String, String> entry : myHashMap.entrySet()) {
            tableModel.addRow(new Object[]{entry.getKey(), entry.getValue()});
        }
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 270, 500, 500);

        panel.add(scrollPane, BorderLayout.CENTER);
        
        check_inventory.setBounds(250, 560, 250, 50);
        check_inventory.setText("Check Inventory");
        check_inventory.setFont(new Font("Comic Sans", Font.BOLD, 22));
        check_inventory.addActionListener(this);
        
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.setSize(500, 650);
        main_frame.setLayout(null);
        main_frame.add(label);
        main_frame.add(back);
        main_frame.add(add);
        main_frame.add(subtract);
        main_frame.add(check_inventory);
        main_frame.add(scrollPane);
        main_frame.add(item);
        main_frame.add(quantity);
        main_frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==add){
            String userinput_item = item.getText();
            String userinput_quantity = quantity.getText();
        }
        else if(e.getSource()==subtract){
            String userinput_item = item.getText();
            String userinput_quantity = quantity.getText();
        }
        
        if(e.getSource()==back){
            main_frame.dispose();
            MainMenu mainmenu = new MainMenu();
        }
        else if(e.getSource()==check_inventory){
            main_frame.dispose();
            check_inventory checkinv = new check_inventory();
        }
    }
}