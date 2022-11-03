// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g) {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10, 10, width, height); // draws large outlining rectangle

        int x = 1;

        while (x <= 50) {
            x++;

            g.drawLine(x1, y1, x2, y2); // draws bottom right arc
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

            g.drawLine(x1, y1, x2, y2); // draws bottom left arc
            y2 -= 12;
            x1 -= 19;
        }

        x1 = 1000;
        y1 = 10;
        x2 = 10;
        y2 = 0;
        x = 1;
        while (x <= 51) {
            x++;

            g.drawLine(x1, y1, x2, y2); // draws top left arc
            y2 += 13;
            x1 -= 19;
        }

        x1 = 990;
        y1 = 10;
        x2 = 990;
        y2 = 640;
        x = 1;
        while (x <= 50) {
            x++;

            g.drawLine(x1, y1, x2, y2); // draws the top right arc
            y2 -= 12;
            x1 -= 19;

        }


        // inner arcs next


        x1 = 240;
        y1 = 475;
        x2 = 768;
        y2 = 475;
        x = 1;
        while (x <= 49) {
            x++;

            g.drawLine(x1, y1, x2, y2); // draws inner bottom right arc
            y2 -= 6;
            x1 += 11;
        }
        x1 = 768;
        y1 = 475;
        x2 = 240;
        y2 = 475;
        x = 1;
        while (x <= 49) {
            x++;

            g.drawLine(x1, y1, x2, y2); // draws inner bottom left arc
            y2 -= 6;
            x1 -= 11;
        }

        x1 = 768;
        y1 = 190;
        x2 = 240;
        y2 = 190;
        x = 1;
        while (x <= 49) {
            x++;

            g.drawLine(x1, y1, x2, y2); // draws inner top left arc
            y2 += 6;
            x1 -= 11;
        }

        x1 = 240;
        y1 = 190;
        x2 = 768;
        y2 = 187;
        x = 1;
        while (x <= 49) {
            x++;

            g.drawLine(x1, y1, x2, y2); // draws inner top right arc
            y2 += 6;
            x1 += 11;

        }
    }
}
