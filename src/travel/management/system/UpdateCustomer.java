package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class UpdateCustomer extends JFrame implements ActionListener {

    JLabel labelusername, labelname;
    JComboBox comboid;
    JTextField tfnumber, tfcountry, tfadd, tfemail, tfphnum, tfid, tfgender;
    JRadioButton rmale, rfemale;
    JButton add, back;

    UpdateCustomer(String username) {
        setBounds(500, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("UPDATE CUSTOMER DETAILS");
        text.setBounds(50,0,300,25);
        text.setFont(new Font("Tahoma", Font.PLAIN,20));
        
        add(text);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 50, 150, 25);
        add(lblusername);

        labelusername = new JLabel();
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);

        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30, 90, 150, 25);
        add(lblid);

       
        JLabel lblnum = new JLabel("Number");
        lblnum.setBounds(30, 130, 150, 25);
        add(lblnum);
        
        tfnumber = new JTextField();
        tfnumber.setBounds(220, 130, 150, 25);
        add(tfnumber);


        tfid = new JTextField();
        tfid.setBounds(220, 90, 150, 25);
        add(tfid);

        JLabel lblname = new JLabel("Username");
        lblname.setBounds(30, 170, 150, 25);
        add(lblname);

        labelname = new JLabel();
        labelname.setBounds(220, 170, 150, 25);
        add(labelname);

        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30, 210, 150, 25);
        add(lblgender);
 
        tfgender = new JTextField();
        tfgender.setBounds(220, 210, 150, 25);
        add(tfgender);

        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(30, 250, 150, 25);
        add(lblcountry);

        tfcountry = new JTextField();
        tfcountry.setBounds(220, 250, 150, 25);
        add(tfcountry);

        JLabel lbladd = new JLabel("Address");
        lbladd.setBounds(30, 290, 150, 25);
        add(lbladd);

        tfadd = new JTextField();
        tfadd.setBounds(220, 290, 150, 25);
        add(tfadd);

        JLabel lblphone = new JLabel("Phone Number");
        lblphone.setBounds(30, 330, 150, 25);
        add(lblphone);

        tfphnum = new JTextField();
        tfphnum.setBounds(220, 330, 150, 25);
        add(tfphnum);

        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(30, 370, 150, 25);
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(220, 370, 150, 25);
        add(tfemail);

        add = new JButton("Update");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(70, 430, 100, 25);
        add.addActionListener(this);
        add(add);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(220, 430, 100, 25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 40, 450, 300);
        add(image);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            while (rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tfid.setText(rs.getString("id"));
                tfnumber.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                tfcountry.setText(rs.getString("country"));
                tfadd.setText(rs.getString("address"));
               tfphnum.setText(rs.getString("phone"));
               tfemail.setText(rs.getString("email"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String username = labelusername.getText();
            String id = tfid.getText();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = tfgender.getText();
          
            String country = tfcountry.getText();
            String address = tfadd.getText();
            String phone = tfphnum.getText();
            String email = tfemail.getText();

            try {
                Conn c = new Conn();
                String query = "update customer set username='" + username + "', id = '" + id + "',number = '" + number + "',name = '" + name + "', gender = '" + gender + "', country = '" + country + "', address = '" + address + "', phone = '" + phone + "', email = '" + email + "'";
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String args[]) {
        new UpdateCustomer("g");
    }
}
