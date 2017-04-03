package pl.akademiakodu.zad5;

import java.util.Scanner;

/**
 * Created by Moody on 2017-03-08.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz N: ");
        int numberN = scanner.nextInt();
        int zmiennaOperacyjna = 0;

        for(int i=1; i<= numberN; i++){
            zmiennaOperacyjna += i;
        }

        System.out.println("suma to: "+zmiennaOperacyjna);

    }
}