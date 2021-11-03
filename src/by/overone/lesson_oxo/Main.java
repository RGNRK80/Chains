package by.overone.lesson_oxo;

import by.overone.lesson_oxo.bd.Keys;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Keys keys=new Keys();
        Scanner scanner=new Scanner(System.in);
        System.out.println("use number of as calculator");
        System.out.println("[7][8][9]\n[4][5][6]\n[1][2][3]");
        boolean condition = true;
        int desk=111111111;
        int cell=0;

        while (condition) {
            check();  // проверка на концовку
            showturn(desk);

            if (scanner.hasNextInt()) {
                cell=scanner.nextInt();
            } else {
                System.out.println("try again");
                scanner.nextLine();
            continue;}

            //проверка ячейки на соответствие 1-9 и наличие 1 в месте ввода


            // ввод ячейки
            switch (cell) {
                case 1: {desk+=100; break;}
                case 2: {desk+=10; break;}
                case 3: {desk+=1; break;}
                case 4: {desk+=100000; break;}
                case 5: {desk+=10000; break;}
                case 6: {desk+=1000; break;}
                case 7: {desk+=100000000; break;}
                case 8: {desk+=10000000; break;}
                case 9: {desk+=1000000; break;}
            }

            // сравнение

            for (int i=0; i<4;i++){
            if (keys.keymap.containsKey(rotate(desk,i)))
            {
                desk=keys.keymap.get(rotate(desk,i));
                break;
            }

            }





        }
    }

    public static void check (){}

    public static void showturn (int turn){
        System.out.println("--your turn--");
        char[] deskOfTurn;
        deskOfTurn=Integer.toString(turn).toCharArray();

        for (int i=0; i<deskOfTurn.length;i++) {
            String cell="1";
            if (deskOfTurn[i]=='1') {cell="_";}
            if (deskOfTurn[i]=='2') {cell="0";}
            if (deskOfTurn[i]=='3') {cell="X";}

            System.out.print("[" + cell+"]");
            if ((i+1)%3==0 && i>0) {
                System.out.println();
            }
        }
    }

    public static int rotate (int dsk,int rad){
        int rezult=-1;
        String[] dskStr=Integer.toString(dsk).split("");
        if (rad==0) {rezult=dsk;}
        if (rad==1) {
            String rez=dskStr[6]+dskStr[3]+dskStr[0]+dskStr[7]+dskStr[4]+dskStr[1]+dskStr[8]+dskStr[5]+dskStr[2];
            rezult=Integer.parseInt(rez);}
        if (rad==2) {
            String rez=dskStr[8]+dskStr[7]+dskStr[6]+dskStr[5]+dskStr[4]+dskStr[3]+dskStr[2]+dskStr[1]+dskStr[0];
            rezult=Integer.parseInt(rez);}
        if (rad==3) {
            String rez=dskStr[2]+dskStr[5]+dskStr[8]+dskStr[1]+dskStr[4]+dskStr[7]+dskStr[0]+dskStr[3]+dskStr[6];
            rezult=Integer.parseInt(rez);}

    return rezult;
    }



}
