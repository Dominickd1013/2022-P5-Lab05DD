// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10,10,width,height);

        int x = 1;

        while (x <= 50) {
            x++;

            g.drawLine(x1, y1, x2, y2);
            y2 -= 12;
            x1 += 19;
        }

        x1 = 990;
        y1 = 640;
        x2 = 10;
        y2 = 640;
        x = 1;
        while (x <= 50) {
            x++;

            g.drawLine(x1, y1, x2, y2);
            y2 -= 12;
            x1 -= 19;
        }


    }
}
