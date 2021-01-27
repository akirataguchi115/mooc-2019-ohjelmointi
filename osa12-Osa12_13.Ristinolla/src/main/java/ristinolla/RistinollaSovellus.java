package ristinolla;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RistinollaSovellus extends Application {

    private Logiikka logiikka;

    public static void main(String[] args) {
        launch(RistinollaSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {
        this.logiikka = new Logiikka();
        Label vuoro = new Label("Vuoro: X");
        vuoro.setFont(Font.font("Monospaced", 40));
        GridPane ruudukko = new GridPane();
        ruudukko.setVgap(10);
        ruudukko.setHgap(10);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button nappi = new Button(" ");
                nappi.setFont(Font.font("Monospaced", 40));
                int x = j;
                int y = i;
                nappi.setOnMouseClicked((event) -> {
                    if (this.logiikka.saaPelata(x, y)) {
                        nappi.setText(this.logiikka.getVuoro());
                        this.logiikka.aseta(x, y);
                        vuoro.setText("Vuoro: " + this.logiikka.getVuoro());
                        if (this.logiikka.loppu()) {
                            vuoro.setText("Loppu!");
                        }
                    }
                });
                ruudukko.add(nappi, i, j);
            }
        }

        BorderPane asettelu = new BorderPane();
        asettelu.setTop(vuoro);
        asettelu.setCenter(ruudukko);

        Scene nakyma = new Scene(asettelu);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
