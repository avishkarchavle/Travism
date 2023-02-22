package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton addPersonalDetails, viewPersonalDetails,  updatePersonalDetails, checkPackages , bookPackages, viewPackages, viewHotels, destinations, bookHotel,viewBookedHotel, payments, Calculator, notepad, about, deletePersonalDetails ;
    Dashboard(String username) {
        this.username = username;
        //setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // full frame
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);

        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);

        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);

        updatePersonalDetails = new JButton("Update Details");
        updatePersonalDetails.setBounds(0, 50, 300, 50);
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 110));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        deletePersonalDetails = new JButton("Delete Details");
        deletePersonalDetails.setBounds(0, 150, 300, 50);
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 120));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);

         checkPackages = new JButton("Check packages");
        checkPackages.setBounds(0, 200, 300, 50);
        checkPackages.setBackground(new Color(0, 0, 102));
        checkPackages.setForeground(Color.WHITE);
        checkPackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkPackages.setMargin(new Insets(0, 0, 0, 100));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);

        bookPackages = new JButton("Book packages");
        bookPackages.setBounds(0, 250, 300, 50);
        bookPackages.setBackground(new Color(0, 0, 102));
        bookPackages.setForeground(Color.WHITE);
        bookPackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookPackages.setMargin(new Insets(0, 0, 0, 110));
        bookPackages.addActionListener(this);
        p2.add(bookPackages);

        viewPackages = new JButton("View packages");
        viewPackages.setBounds(0, 300, 300, 50);
        viewPackages.setBackground(new Color(0, 0, 102));
        viewPackages.setForeground(Color.WHITE);
        viewPackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPackages.setMargin(new Insets(0, 0, 0, 110));
        viewPackages.addActionListener(this);
        p2.add(viewPackages);

        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0, 350, 300, 50);
        viewHotels.setBackground(new Color(0, 0, 102));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewHotels.setMargin(new Insets(0, 0, 0, 130));
        viewHotels.addActionListener(this);
        p2.add(viewHotels);

        bookHotel = new JButton("Book Hotel");
        bookHotel.setBounds(0, 400, 300, 50);
        bookHotel.setBackground(new Color(0, 0, 102));
        bookHotel.setForeground(Color.WHITE);
        bookHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookHotel.setMargin(new Insets(0, 0, 0, 140));
        bookHotel.addActionListener(this);
        p2.add(bookHotel);

        viewBookedHotel = new JButton("View Booked Hotel");
        viewBookedHotel.setBounds(0, 450, 300, 50);
        viewBookedHotel.setBackground(new Color(0, 0, 102));
        viewBookedHotel.setForeground(Color.WHITE);
        viewBookedHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewBookedHotel.setMargin(new Insets(0, 0, 0, 75));
        viewBookedHotel.addActionListener(this);
        p2.add(viewBookedHotel);

        destinations = new JButton("Destinations");
        destinations.setBounds(0, 500, 300, 50);
        destinations.setBackground(new Color(0, 0, 102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0, 0, 0, 125));
        destinations.addActionListener(this);
        p2.add(destinations);

        payments = new JButton("Payments");
        payments.setBounds(0, 550, 300, 50);
        payments.setBackground(new Color(0, 0, 102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0, 0, 0, 145));
        payments.addActionListener(this);
        p2.add(payments);

        Calculator = new JButton("Calculator");
        Calculator.setBounds(0, 600, 300, 50);
        Calculator.setBackground(new Color(0, 0, 102));
        Calculator.setForeground(Color.WHITE);
        Calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Calculator.setMargin(new Insets(0, 0, 0, 145));
        Calculator.addActionListener(this);
        p2.add(Calculator);

        notepad = new JButton("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 0, 0, 150));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton("About");
        about.setBounds(0, 700, 300, 50);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0, 175));
        about.addActionListener(this);
        p2.add(about);

         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.WHITE);
         text.setFont(new Font("Raleway", Font.PLAIN,50));
         image.add(text);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource()==viewPersonalDetails){
            new ViewCustomer(username);
        }else if(ae.getSource()==updatePersonalDetails){
            new UpdateCustomer(username);
        } else if(ae.getSource()==checkPackages){
            new CheckPackage();
        } else if(ae.getSource()==bookPackages){
            new BookPackage(username);
        }else if(ae.getSource()==viewPackages){
            new ViewPackage(username);
        }else if(ae.getSource()==viewHotels){
            new CheckHotels();
        } else if(ae.getSource()==destinations){
            new Destinations();
        }else if(ae.getSource()==bookHotel){
            new BookHotel(username);
        }
        else if(ae.getSource()==viewBookedHotel){
            new ViewBookedHotel(username);
        }else if(ae.getSource()==payments){
            new Payment();
        } else if (ae.getSource() == Calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if (ae.getSource() == notepad)
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        else if(ae.getSource() == about){
               new About();
        }else if(ae.getSource() == deletePersonalDetails){
            new DeleteDetails(username);
        }
        }
    
    public static void main(String args[]) {
        new Dashboard("");
    }
}
