
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    JButton back;
    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(220,10,100,40);
        l1.setForeground(Color.RED);
        add(l1);
        
          String s="This website is revealed to provide the best traveling assistance to customers and travel\n" +
"agencies. We have developed travel and tour management systems to render a found stage\n" +
"where tourist can find their tour places according to their likes. This system also helps to\n" +
"promote liable and pleasant tourism so that people can enjoy their vacations at their favorite\n" +
"places. This way also benefits develop tourism with different cultures so that they enrich the\n" +
"tourism experience and build variety. We develop this system to create and improve forms of\n" +
"tourism that provide better cooperation opportunities for tourists and locals and increase a\n" +
"better opinion of different cultures, customs, lifestyles, traditional knowledge, and beliefs.\n" +
"This system also gives tours-related data like which bus can go to certain places and which are\n" +
"tourist attractions, cities, and provinces. Tourists can also get the Map and exploration system\n" +
"and can also see other tourist reviews. Tourists can also book tours through our tours with\n" +
"packages and a travels management system";
        
        TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
         back = new JButton("Back");
         back.setBounds(200,420,100,25);
         back.addActionListener(this);
         add(back);
         
       
         
        setVisible(true);
        
    }
    public static void main(String args[]){
        new About();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == back){
            setVisible(false);
        }
    }
}
