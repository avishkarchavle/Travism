package travel.management.system;

import javax.swing.*;
import java.awt.*;  // for image class

public class Splash extends JFrame implements Runnable {

    Thread thread;

    Splash() {
        // later set dynamically
//       setSize(1200,600);  // to make frame 
//       setLocation(200,100);  // to set the location of the frame

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg")); //to load image

        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT); // to scale image but image class object cannot be directly called in add function
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); //to place image on frame
        add(image);
        setVisible(true);   // by default it is hidden
        thread = new Thread(this);
        thread.start();

    }

    public void run() {
        try {
            Thread.sleep((3000));
             new Login();
            setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Splash frame = new Splash();
        int x = 1;
        for (int i = 0; i <= 500; x += 7, i += 6) {
            frame.setLocation(750 - (x + i) / 2, 400 - (i / 2));
            frame.setSize(x + i, i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        } // dynamic splash opening
    }
}
// multi-threading
// multiple inheritence allowed with interfaces not with classes
