package pl.akademiakodu.zad6;

import java.util.Scanner;

/**
 * Created by Moody on 2017-03-08.
 */
public class Main {

    public static void main(String[] args) {

        final int winerInt = 242;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w naszej grze, odgadnij liczbę");

        int answer;

        while(true){
            System.out.println("Podaj liczbę");
            answer = scanner.nextInt();
            if (answer == winerInt){
                System.out.println("Wygrałeś!");
                break;
            }else if(answer > winerInt){
                System.out.println("celuj troszeczkę niżej");
            }else{
                System.out.println("Celuj troszeczkę wyżej");
            }
        }
    }
}