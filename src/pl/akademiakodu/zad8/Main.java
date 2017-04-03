package pl.akademiakodu.zad8;

import java.util.Scanner;

/**
 * Created by Moody on 2017-03-08.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password;
        do{
            System.out.println("Podaj hasło");
            password=scanner.nextLine();

            if(password.equalsIgnoreCase("Polska")){ // metoda porownuje ciagi znakow oraz ignorujac ich wielkosc
                System.out.println("Hasło poprawne!");
                break;
            }

        }while (true);

    }
}