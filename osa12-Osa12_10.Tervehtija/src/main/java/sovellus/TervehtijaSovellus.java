package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TervehtijaSovellus extends Application {

    public static void main(String[] args) {
        launch(TervehtijaSovellus.class);
    }

    @Override
    public void start(Stage ikuna) {
        Label ohje = new Label("Kirjoita nimesi ja aloita.");
        TextField tekstikentta = new TextField();
        Button aloita = new Button("Aloita");

        GridPane asettelu = new GridPane();

        asettelu.add(ohje, 0, 0);
        asettelu.add(tekstikentta, 0, 1);
        asettelu.add(aloita, 0, 3);

        asettelu.setPrefSize(300, 180);
        asettelu.setAlignment(Pos.CENTER);
        asettelu.setVgap(10);
        asettelu.setHgap(10);
        asettelu.setPadding(new Insets(20, 20, 20, 20));

        Scene kirjausnakyma = new Scene(asettelu);

        Label tervetuloateksti = new Label("Tervetuloa ");

        StackPane tervetuloaAsettelu = new StackPane();
        tervetuloaAsettelu.setPrefSize(300, 180);
        tervetuloaAsettelu.getChildren().add(tervetuloateksti);
        tervetuloaAsettelu.setAlignment(Pos.CENTER);
        Scene terve = new Scene(tervetuloaAsettelu);

        aloita.setOnAction((event) -> {
            tervetuloateksti.setText("Tervetuloa " + tekstikentta.getText() + "!");
            ikuna.setScene(terve);
        });
        
        ikuna.setScene(kirjausnakyma);
        ikuna.show();
    }
}
