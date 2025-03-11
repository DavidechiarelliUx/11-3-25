package epicode.giorno2;

import epicode.giorno2.es3.StringaVirgola;

import java.util.Scanner;

public class TestaStringaConVirgola {
    public static void main (String[] args){
        StringaVirgola stringa1 = new StringaVirgola();
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci una stringa");

        stringa1.setStringa(scanner.nextLine());

        stringa1.CaratteriSeparatiDaVirgola(stringa1.getStringa());


    }
}
