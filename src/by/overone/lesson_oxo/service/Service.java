package by.overone.lesson_oxo.service;

public class Service {
    public static int rotate (int dsk,int rad){
        int rezult=-1;
        String[] dskStr=Integer.toString(dsk).split("");
        if (rad==0) {rezult=dsk; System.out.println("---" + rad); return rezult;}
        if (rad==1) {
            String rez=dskStr[6]+dskStr[3]+dskStr[0]+dskStr[7]+dskStr[4]+dskStr[1]+dskStr[8]+dskStr[5]+dskStr[2];
            rezult=Integer.parseInt(rez);System.out.println("---" + rad); return rezult;}
        if (rad==2) {
            String rez=dskStr[8]+dskStr[7]+dskStr[6]+dskStr[5]+dskStr[4]+dskStr[3]+dskStr[2]+dskStr[1]+dskStr[0];
            rezult=Integer.parseInt(rez);System.out.println("---" + rad); return rezult;}
        if (rad==3) {
            String rez=dskStr[2]+dskStr[5]+dskStr[8]+dskStr[1]+dskStr[4]+dskStr[7]+dskStr[0]+dskStr[3]+dskStr[6];
            rezult=Integer.parseInt(rez);System.out.println("---" + rad); return rezult;}
        if (rad==4) {
            String rez=dskStr[2]+dskStr[1]+dskStr[0]+dskStr[5]+dskStr[4]+dskStr[3]+dskStr[8]+dskStr[7]+dskStr[6];
            rezult=Integer.parseInt(rez);System.out.println("---" + rad); return rezult;}
        if (rad==5) {
            String rez=dskStr[8]+dskStr[5]+dskStr[2]+dskStr[7]+dskStr[4]+dskStr[1]+dskStr[6]+dskStr[3]+dskStr[0];
            rezult=Integer.parseInt(rez);System.out.println("---" + rad); return rezult;}
        if (rad==6) {
            String rez=dskStr[6]+dskStr[7]+dskStr[8]+dskStr[3]+dskStr[4]+dskStr[5]+dskStr[0]+dskStr[1]+dskStr[2];
            rezult=Integer.parseInt(rez);System.out.println("---" + rad); return rezult;}
        if (rad==7) {
            String rez=dskStr[0]+dskStr[3]+dskStr[6]+dskStr[1]+dskStr[4]+dskStr[7]+dskStr[2]+dskStr[5]+dskStr[8];
            rezult=Integer.parseInt(rez);System.out.println("---" + rad); return rezult;}

        return -1;
    }


    public static int checkToEnd (int desk){
        char[] d;
        d=Integer.toString(desk).toCharArray();
        if (    (d[0]=='3' && d[1]=='3' && d[2]=='3') ||
                (d[3]=='3' && d[4]=='3' && d[5]=='3') ||
                (d[6]=='3' && d[7]=='3' &&d[8]=='3' )  ||
                (d[0]=='3' && d[3]=='3' &&d[6]=='3' )  ||
                (d[1]=='3' && d[4]=='3' &&d[7]=='3' )  ||
                (d[2]=='3' && d[5]=='3' &&d[9]=='3' )  ||
                (d[0]=='3' && d[4]=='3' &&d[8]=='3' )  ||
                (d[2]=='3' && d[4]=='3' &&d[6]=='3' )
        ) return 1;

        int cellcheck=0;
        for (int i=0; i<d.length; i++) {
            if (d[i]=='1') {cellcheck+=1;}
        }

        if (cellcheck>0) {return -1;}
        return 0;
    }



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
}
