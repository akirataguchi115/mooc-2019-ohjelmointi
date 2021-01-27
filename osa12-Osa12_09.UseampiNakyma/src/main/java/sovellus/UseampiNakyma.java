package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application {

    public static void main(String[] args) {
        launch(UseampiNakyma.class);
    }

    @Override
    public void start(Stage ikkuna) {
        BorderPane asettelu = new BorderPane();
        Scene eka = new Scene(asettelu);
        VBox horizontal = new VBox();
        Scene toka = new Scene(horizontal);
        GridPane gridi = new GridPane();
        Scene kolmas = new Scene(gridi);

        Button nab = new Button("Ekaan näkymään!");
        nab.setOnAction((asdf) -> {
            ikkuna.setScene(eka);
        });
        gridi.add(new Label("Kolmas näkymä!"), 0, 0);
        gridi.add(nab, 1, 1);

        Button nappens = new Button("Kolmanteen näkymään!");
        nappens.setOnAction((event) -> {
            ikkuna.setScene(kolmas);
        });
        Label text = new Label("Toka näkymä!");
        horizontal.getChildren().addAll(nappens, text);

        Label teksti = new Label("Eka näkymä!");
        Button nappi = new Button("Tokaan näkymään!");
        nappi.setOnAction((event) -> {
            ikkuna.setScene(toka);
        });

        asettelu.setTop(teksti);
        asettelu.setCenter(nappi);

        ikkuna.setScene(eka);
        ikkuna.show();
    }
}
