import java.util.Scanner;

public class Main {
//date:20161002
// name:王奕盛
// id:106022312
// purpose:判斷奇數偶數

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int v1 = scn.nextInt() % 2 ;
        if (v1==1) {
            System.out.println("奇數");

        }else{
            System.out.println("偶數");
        }
    }
}
