package epicode.giorno2;

import epicode.giorno2.es4.For;

import java.util.Scanner;

public class TestaFor {
    public static void main(String[] args){
        For num1 = new For();
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci numero");

        num1.setNum(scanner.nextInt());

        num1.contoAllaRovescia(num1.getNum());
    }
}
