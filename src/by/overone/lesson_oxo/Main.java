package by.overone.lesson_oxo;

import by.overone.lesson_oxo.bd.BDKeys;
import by.overone.lesson_oxo.service.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BDKeys keys=new BDKeys();
        Scanner scanner=new Scanner(System.in);
        System.out.println("use numbers as calculator");
        System.out.println("[7][8][9]\n[4][5][6]\n[1][2][3]");
        boolean condition = true;
        int desk=111111111;
        int cell=0;

        while (condition) {
            Service.showturn(desk);

            // проверка на доски концовку
            if (Service.checkToEnd(desk)==1) {
                System.out.println("you lose");
                condition=false;
                break;
            }
           if (Service.checkToEnd(desk)==0) {
                System.out.println("no winner");
                condition=false;
                break;
            }

           // ввод числа и проверка
            if (scanner.hasNextInt()) {
                cell=scanner.nextInt();
            } else {
                System.out.println("try again");
                scanner.nextLine();
            continue;}

            //проверка ячейки на соответствие 1-9 и наличие 1 в месте ввода

            int desk1=desk;
            int[] deskChek=new int[9];
            for (int i=8; i>=0;i--){
            deskChek[i]=desk1%10;
            desk1=desk1/10;

            }
            //System.out.println(Arrays.toString(deskChek));

            int checkNumber=0;
            switch (cell) {
               case 1: checkNumber=6;break;
               case 2: checkNumber=7;break;
               case 3: checkNumber=8;break;
               case 4: checkNumber=3;break;
               case 5: checkNumber=4;break;
               case 6: checkNumber=5;break;
               case 7: checkNumber=0;break;
               case 8: checkNumber=1;break;
               case 9: checkNumber=2;break;
            }

            if (cell>9 || cell<1) {System.out.println("try again"); continue;}
            if (deskChek[checkNumber]!=1) {System.out.println("try again"); continue;}


            // ввод ячейки
            switch (cell) {
                case 1: desk+=100; break;
                case 2: desk+=10; break;
                case 3: desk+=1; break;
                case 4: desk+=100000; break;
                case 5: desk+=10000; break;
                case 6: desk+=1000; break;
                case 7: desk+=100000000; break;
                case 8: desk+=10000000; break;
                case 9: desk+=1000000; break;
            }

            // сравнение

            for (int i=0; i<8;i++) {
                int check = Service.rotate(desk, i);
                if (keys.keymap.containsKey(check)) {
                   /* System.out.println("проверка вращением______________");
                    Service.showturn(check);
                    System.out.println(" алгоритм поворота " + i);
                    System.out.println("шаблон по ключу :");
                    Service.showturn(keys.keymap.get(check));
                    System.out.println("_______________________________");*/

                desk = Service.rotate(keys.keymap.get(check),-i);
                break;
                }
            }

        }
    }


}
