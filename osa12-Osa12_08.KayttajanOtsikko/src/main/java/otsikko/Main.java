package otsikko;

import java.util.Scanner;
import javafx.application.Application;

public class Main{

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Application.launch(KayttajanOtsikko.class, "--otsikko=" + lukija.nextLine());
    }

}
