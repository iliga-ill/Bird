import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.lang.Math;
import java.awt.*;
import javax.swing.*;

public class Macaw extends Bird{
private String name;
private int n = 0;

    public static int XM=0,Xm=1200,YM=0,Ym=700;
    public int size=40;
    public int x=((int) (Math.random()*(width-width/100*10)));
    public int y=((int) (Math.random()*(height-height/100*15)));

    Macaw(String name){
    }

    public void bird(){System.out.println("я попугай "+ name +"!");}

    public void speak(){n++;}

    public void fly(){System.out.println("я лечу!");}

    public void setName(String name){this.name=name;}

    public String getName(){return this.name;}

    public int getNumber(){return this.n;}

    public void hello(Macaw b){ System.out.println("Hello: " + b.getName());}

    public void Create(Graphics g){
        g.setColor(new Color(0,255,255));
        super.draw(g, size, x, y);
        if (XM<x+size) {XM=x+size;}
        if (YM<y+size) {YM=y+size;}
        if (Xm>x+size) {Xm=x+size;}
        if (Ym>y+size) {Ym=y+size;}
    }

    public void StartSqural(Graphics g){
        g.setColor(new Color(0,255,255));
        super.squral(g,XM,Xm,YM,Ym,size);
        }

}

