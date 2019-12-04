import java.security.acl.Group;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.awt.*;
import javax.swing.*;

public class Bird extends MyWindow {

    public Bird() {}

    public void Create(Graphics g){}

    public void fly() {/*System.out.println("I'm flying.");*/}

    public void speak(){ System.out.println("I'm flying.");}

    public void draw(Graphics g, int size,int x,int y) {g.fillOval(x+size,y+size,size,size);}

    public void Oval(Graphics g, int size,int sizeP, int x,int y) {//пятнышко
        g.fillOval(x+size+(size-sizeP)/2,y+size+(size-sizeP)/2,sizeP,sizeP);
    }

    public void StartSqural(Graphics g){}
    public void squral(Graphics g, int XM,int Xm,int YM,int Ym, int size) {
    g.drawLine(XM+size,YM+size,Xm,YM+size);
    g.drawLine(Xm,YM+size,Xm,Ym);
    g.drawLine(Xm,Ym,XM+size,Ym);
    g.drawLine(XM+size,Ym,XM+size,YM+size);
    }
}









