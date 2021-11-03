package by.overone.lesson_oxo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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




        }





    }

    public static void check (){}

    public static void showturn (int turn){
        System.out.println("-------your turn---------");
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
}
