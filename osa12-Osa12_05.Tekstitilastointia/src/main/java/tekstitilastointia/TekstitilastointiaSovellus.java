package tekstitilastointia;

import javafx.application.Application;
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
        HBox horisontaali = new HBox();
        horisontaali.getChildren().addAll(new Label("Kirjaimia: 0"), new Label("Sanoja: 0"), new Label("Pisin sana on:"));
        horisontaali.setSpacing(2.00);
        
        BorderPane asettelu = new BorderPane();
        asettelu.setBottom(horisontaali);
        asettelu.setCenter(new TextArea());
        
        Scene nakyma = new Scene(asettelu);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    
}
