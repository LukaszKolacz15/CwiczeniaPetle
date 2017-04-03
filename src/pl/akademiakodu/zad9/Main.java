package pl.akademiakodu.zad9;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by OskarPraca on 2017-03-07.
 */
public class Main {

    //psvm


    public static void main(String[] args) {


        final int winnerInt = 242;

        Scanner scanner = new Scanner(System.in);
        // System.out.println("Witaj w naszej grze. Odgadnij liczbę!");

        System.out.print("Podaj liczbę N: ");
        int liczbaN = scanner.nextInt();

        if(liczbaN == 0) {
            System.out.println("Wynik to 1");
            System.exit(0);
        }

        BigInteger zmiennaOperacyjna = new BigInteger("1");
        for(long i = 1; i <= liczbaN; i++) {
            System.out.println(zmiennaOperacyjna.toString());
            zmiennaOperacyjna = zmiennaOperacyjna.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println("Wynik to: " + zmiennaOperacyjna.toString());

    }


}