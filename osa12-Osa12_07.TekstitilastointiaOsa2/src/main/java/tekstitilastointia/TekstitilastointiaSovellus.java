package tekstitilastointia;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TekstitilastointiaSovellus extends Application {

    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {
        Label kirjaimia = new Label("Kirjaimia: 0");
        Label sanoja = new Label("Sanoja: 0");
        Label pisin = new Label("Pisin sana on:");
        TextArea tekstikentta = new TextArea();

        tekstikentta.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            kirjaimia.setText("Kirjaimia: " + uusiArvo.length());
            String[] palat = uusiArvo.split(" ");
            sanoja.setText("Sanoja: " + palat.length);
            pisin.setText("Pisin sana on: " + Arrays.stream(palat).sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst().get());
        }
        );

        HBox horisontaali = new HBox();
        horisontaali.getChildren().addAll(kirjaimia, sanoja, pisin);
        horisontaali.setSpacing(10);

        BorderPane asettelu = new BorderPane();
        asettelu.setBottom(horisontaali);
        asettelu.setCenter(tekstikentta);

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
