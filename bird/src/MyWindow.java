import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.awt.*;
import javax.swing.*;

public class MyWindow extends JFrame {

    private GroupB f;
    static public int height=800;
    static public int width=800;

    public MyWindow(){
        this.setSize(width,height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public MyWindow(GroupB j){
        this();
        this.setVisible(true);
        this.f=j;
    }

    public void paint(Graphics g){
        getGraphics().translate(height/2,width/2);
        g.clearRect(0,0,10000,10000);
        getGraphics().drawLine(0,height/2,width,height/2);
        getGraphics().drawLine(width/2,height,width/2,0);

        f.draw(g);
    }



}
