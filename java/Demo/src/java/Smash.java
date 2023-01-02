
import java.applet.Applet;
import java.awt.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcacnj
 */
public class Smash extends Applet{
    public void init() {
        System.out.println("Hii It is coming");
    }
    public void start() {
        System.out.println("Mee It is coming");
    }
    public void paint(Graphics g) {
        g.drawString("Hii Global", 150, 150);
    }

}
