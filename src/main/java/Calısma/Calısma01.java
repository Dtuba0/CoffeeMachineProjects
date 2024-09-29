package Calısma;

import java.util.Scanner;

public class Calısma01 {
    public static void main(String[] args) {

        //basit hesap makinesi yapımı

        Scanner hesap =  new Scanner(System.in);
        System.out.println("ıkı adet sayı gırınız");

        double sayı1 = hesap.nextDouble();
        double sayı2 = hesap.nextDouble();

        System.out.println("işlem operatoru gırınız : (+,-,/,*)");

      //  String operator = hesap.nextLine();
        double sonuc = 0 ;
        char operator1 = hesap.next().charAt(0);

        switch (operator1){
            case '+':
                sonuc = sayı1 + sayı2 ;
                break;
            case'-':
                sonuc = sayı1 - sayı2;
                break;
            case'*':
                sonuc = sayı1 * sayı2;
                break;
            case'/':
                sonuc = sayı1 / sayı2;
                break;
            default:
                System.out.println("yanlıs operator sectınız ");
                return;




        }
        System.out.println(sayı1 + " " + operator1 +" " + sayı2 + " = " + sonuc);






    }
}
