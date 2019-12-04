import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.awt.*;
import javax.swing.*;

public class Pingvin extends Bird{

    public static int XM=0,Xm=1200,YM=0,Ym=700;
    public int size=30;
    public int sizeP=((int) (Math.random()*20));
    public int x=((int) (Math.random()*(width-width/100*10)));
    public int y=((int) (Math.random()*(height-height/100*10)));

    Pingvin(){
    }

    public void speak(){System.out.println("я пингвин!"); }
    public void bird(){System.out.println("я пингвин");}
    public void fly(){System.out.println("пингвины не летают!");}
    public void Create(Graphics g){
        g.setColor(new Color(255,0,255));
        super.draw(g , size, x, y);
        g.setColor(new Color(150,150,150));
        super.Oval(g , size, sizeP, x, y);
        if (XM<x+size) {XM=x+size;}
        if (YM<y+size) {YM=y+size;}
        if (Xm>x+size) {Xm=x+size;}
        if (Ym>y+size) {Ym=y+size;}
    }

    public void StartSqural(Graphics g){
        g.setColor(new Color(255,0,255));
        super.squral(g,XM,Xm,YM,Ym,size);
        }
}
