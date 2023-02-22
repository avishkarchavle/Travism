package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class BookPackage extends JFrame implements ActionListener{
     Choice cpackage;
     JTextField tfpersons;
     String username;
     JLabel labelusername, labelid, labelnumber, labelprice, labelphone;
     JButton checkprice, bookpackage, back;
    BookPackage(String username) {
        this.username = username;
        setBounds(350, 200, 1100, 500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel text = new JLabel("BOOK PACKAGE");
        text.setBounds(100, 10, 200, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(text);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 70, 100, 20);
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblusername);

        labelusername = new JLabel();
        labelusername.setBounds(250, 70, 200, 20);
        labelusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelusername);

        JLabel lblpackage = new JLabel("Select package");
        lblpackage.setBounds(40, 110, 150, 20);
        lblpackage.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblpackage);

        cpackage = new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setBounds(250,110,200,20);
        add(cpackage);
        
        JLabel lblpersons = new JLabel("Total persons");
        lblpersons.setBounds(40, 150, 150, 25);
        lblpersons.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblpersons);

        tfpersons = new JTextField("1");
        tfpersons.setBounds(250,150,200,25);
         tfpersons.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(tfpersons);

        JLabel lblid = new JLabel("Id");
        lblid.setBounds(40, 190, 150, 20);
        lblid.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblid);

        labelid = new JLabel();
        labelid.setBounds(250, 190, 200, 25);
         labelid.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelid);
        
        JLabel lblnum = new JLabel("Number");
        lblnum.setBounds(40, 230, 150, 25);
        lblnum.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblnum);
        

        labelnumber = new JLabel();
        labelnumber.setBounds(250, 230, 150, 25);
        labelnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelnumber);
        
         JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(40, 270, 150, 20);
        lblphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblphone);

        labelphone = new JLabel();
        labelphone.setBounds(250, 270, 200, 25);
         labelphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelphone);
        
        JLabel lbltotal = new JLabel("Total Price");
        lbltotal.setBounds(40, 310, 150, 25);
        lbltotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lbltotal);
        
        labelprice = new JLabel();
        labelprice .setBounds(250, 310, 150, 25);
       labelprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelprice);

              try {
            Conn conn = new Conn();
            String query = "Select * from customer where username = '" + username + "'";
            ResultSet rs = conn.s.executeQuery(query);
            while (rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
            //    labelprice.setText(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
              
         checkprice = new JButton("Check price");
          checkprice.setBackground(Color.BLACK);
          checkprice.setForeground(Color.WHITE);
           checkprice.setBounds(60,380,120,25);
           checkprice.addActionListener(this);
           add(checkprice);
              
           bookpackage = new JButton("Book Package");
          bookpackage.setBackground(Color.BLACK);
          bookpackage.setForeground(Color.WHITE);
           bookpackage.setBounds(200,380,120,25);
           bookpackage.addActionListener(this);
           add(bookpackage);
              
          back = new JButton("Back");
          back.setBackground(Color.BLACK);
          back.setForeground(Color.WHITE);
           back.setBounds(340,380,120,25);
           back.addActionListener(this);
           add(back);
              
           
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(550, 20, 500, 300);
       add(image);
        
        setVisible(true);

    }
     @Override
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource()== checkprice){
          String pack = cpackage.getSelectedItem();
          int cost = 0;
          if(pack.equals("Gold Package")){
              cost+= 21000;
          }else if(pack.equals("Silver Package")){
              cost+= 15000;
          } else{
              cost+= 10000;
          }
           int persons = Integer.parseInt(tfpersons.getText());
           cost *= persons;
         labelprice.setText("Rs " + cost);
      }
      else if(ae.getSource()== bookpackage){
          try{
              Conn c = new Conn();
              c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"','"+cpackage.getSelectedItem()+"', '"+tfpersons.getText()+"' ,'"+labelid.getText()+"', '"+labelnumber.getText()+"' , '"+labelphone.getText()+"', '"+labelprice.getText()+"')");
            JOptionPane.showMessageDialog(null,"Package Booked Successfully");
            setVisible(false);
          } catch (Exception e){
              e.printStackTrace();
          }
      }else{
          setVisible(false);
      }
    }
    public static void main(String args[]) {
        new BookPackage("g");
    }

   
}

