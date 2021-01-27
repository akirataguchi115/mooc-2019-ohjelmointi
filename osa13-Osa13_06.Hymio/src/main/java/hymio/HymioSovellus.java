package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HymioSovellus extends Application {

    public static void main(String[] args) {
        launch(HymioSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {

        Canvas piirtoalusta = new Canvas(800, 900);
        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();

        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(piirtoalusta);

        piirturi.setFill(Color.BLACK);
        piirturi.fillRect(200, 200, 100, 100);
        piirturi.fillRect(500, 200, 100, 100);
        piirturi.fillRect(100, 500, 100, 100);
        for (int i = 0; i < 4; i++) {
            piirturi.fillRect(200 + (i * 100), 600, 100, 100);
        }
        piirturi.fillRect(600, 500, 100, 100);

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
}
