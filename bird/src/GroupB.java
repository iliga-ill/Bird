import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.lang.Math;
import java.awt.*;
import javax.swing.*;

    public class GroupB {


        static Scanner scan = new Scanner(System.in);

        private ArrayList<Bird> f;
        private ArrayList<Integer> t;
        boolean flag = false;
        int temp = 1;
        int way = 0;
        int Enums;

        static int M=0;
        static int P=0;
        static int V=0;

        public GroupB() {
            String[] names = new String[7];
            names[0] = "Ilua";
            names[1] = "Dima";
            names[2] = "Kirill";
            names[3] = "Dasha";
            names[4] = "Kesha";
            names[5] = "Sonya";
            names[6] = "Vlad";

            f = new ArrayList<>();
            t = new ArrayList<>();
            Date date = new Date();
            while (temp == 1) {
                System.out.println("Выберите 1 чтобы создать попугая, 2-чтобы создать пингвина, 3-чтобы создать воробья: ");
                way = getNumber();
                if (way == 1) {
                    Enums = (int) (Math.random() * 7);
                    String name = names[Enums];
                    System.out.println("Cоздан папугай " + name);
                    f.add(new Macaw(name));
                    M++;

                    System.out.println("сейчас: " + date.toString());
                    if (date.getHours() < 6) {System.out.println("сейчас ночь");}
                    else {System.out.println("сейчас день");}

                } else if (way == 2) {
                    System.out.println("Пингвин создан ");
                    f.add(new Pingvin());
                    t.add(2);
                    P++;
                    System.out.println("сейчас: " + date.toString());
                    if (date.getHours() < 6) {System.out.println("сейчас ночь");}
                    else {System.out.println("сейчас день");}

                } else if (way == 3) {
                    System.out.println("Воробей создан ");
                    f.add(new Vorobei());
                    t.add(3);
                    V++;
                    System.out.println("сейчас: " + date.toString());
                    if (date.getHours() < 6) {System.out.println("сейчас ночь");}
                    else {System.out.println("сейчас день");}
                }
                System.out.println("если хотите продолжить создание, нажмите 1, иначе 0 ");
                temp = getNumber();
            }
            System.out.println("Cоздано: \nПапугаев: "+M+"\nПингвинов: "+P+"\nВоробьев: "+V);
        }

        public int getNumber(){
            if (scan.hasNextInt()){
                return scan.nextInt();
            }
            else {
                System.out.print("Incorrect value.Please try again: ");
                scan.next();
                return getNumber();
            }
        }

        public String getName(){
            return scan.next();
        }

        public void flyingGroup() {
            for (int i = 0; i < f.size(); i++) {
                f.get(i).fly();
            }
        }


            public void draw(Graphics g){

                for (int i=0;i<f.size();i++) {
                    f.get(i).Create(g);
                }
                for (int i=0;i<f.size();i++) {
                    if (((f.get(i) instanceof Macaw)&(M>1)) || ((f.get(i) instanceof Pingvin)&(P>1))) {
                        f.get(i).StartSqural(g);
                    }
                }
            }

    }

