package BasicExamples.GUI.test;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {



    /*
    1 example

    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }

     */



    /*

    2 example

    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("test.jpg").getImage();
        g.fillRect(20, 50, 100, 100);
        g.drawImage(image, 3,4,this);
    }

    Action = Insert image in frame

     */


    public void paintComponent(Graphics g) {

        g.setColor(Color.green);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        int red = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);


    }


}
