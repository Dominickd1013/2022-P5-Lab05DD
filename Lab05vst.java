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
        int x1 = 50;
        int y1 = 640;
        int x2 = 990;
        int y2 = 600;
        g.drawRect(10,10,width,height);

        int x = 1;

        {

            if(x >= 1) {

                g.drawLine(x1, y1, x2, y2);



            }



        }
    }
}
