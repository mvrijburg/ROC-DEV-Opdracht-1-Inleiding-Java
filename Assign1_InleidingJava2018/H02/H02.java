package Assign1_InleidingJava2018.H02;

import java.applet.*;
import java.awt.*;

//een klasse met de naam Show van het type Applet
public class H02 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawString("Welcome to Java!!", 50, 60 );
    }

}