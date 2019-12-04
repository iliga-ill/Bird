import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.awt.*;
import javax.swing.*;



public class Vorobei extends Bird{

    public static int XM=0,Xm=1200,YM=0,Ym=700;
    public int size=10;
    public int x=((int) (Math.random()*(width-width/100*10)));
    public int y= x;/*((int) (Math.random()*(height-height/100*15)));*/

    Vorobei(){
    }

    public void Create(Graphics g){
        g.setColor(new Color(255,255,0));
        super.draw(g, size, x, y);
        if (XM<x+size) {XM=x+size;}
        if (YM<y+size) {YM=y+size;}
        if (Xm>x+size) {Xm=x+size;}
        if (Ym>y+size) {Ym=y+size;}
    }
    public void StartSqural(Graphics g){
        g.setColor(new Color(255,255,0));
        super.squral(g,XM,Xm,YM,Ym,size);
        }
}

