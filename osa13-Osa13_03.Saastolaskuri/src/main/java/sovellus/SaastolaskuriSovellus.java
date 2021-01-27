package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SaastolaskuriSovellus extends Application {

    public static void main(String[] args) {
        launch(SaastolaskuriSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {

        //Graafi
        NumberAxis xAkseli = new NumberAxis(0, 30, 1);
        NumberAxis yAkseli = new NumberAxis(0, 20000, 2500);
        yAkseli.setAutoRanging(true);
        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setLegendVisible(false);
        XYChart.Series saastoData = new XYChart.Series();
        XYChart.Series korkoData = new XYChart.Series();
        viivakaavio.getData().add(korkoData);
        viivakaavio.getData().add(saastoData);
        viivakaavio.setTitle("Säästölaskuri");

        //kutsuttavat koron muuttujat
        Slider korkoSlider = new Slider(0, 10, 0);
        Label korkoLuku = new Label("0");

        //kuukausittainen tallennus
        Label tallennusTeksti = new Label("Kuukausittainen tallennus");
        Slider tallennusSlider = new Slider(25, 250, 25);
        tallennusSlider.setShowTickLabels(true);
        tallennusSlider.setShowTickMarks(true);
        tallennusSlider.setMinorTickCount(5);
        tallennusSlider.setMajorTickUnit(25);
        Label tallennusLuku = new Label("25");
        tallennusSlider.setOnMouseClicked((event) -> {
            tallennusLuku.setText("" + tallennusSlider.getValue());
            korkoLuku.setText("" + korkoSlider.getValue());
            saastoData.getData().clear();
            korkoData.getData().clear();
            double viimeVuodenSaastot = 0;
            for (int i = 0; i < 31; i++) {
                saastoData.getData().add(new XYChart.Data(i, i * 12 * tallennusSlider.getValue()));
//                    double debug = viimeVuodenSaastot;
                if (i == 0) {
                    korkoData.getData().add(new XYChart.Data(i, 0));
                } else {
                    korkoData.getData().add(new XYChart.Data(i, (viimeVuodenSaastot + tallennusSlider.getValue() * 12) * (1 + (korkoSlider.getValue() / 100))));
                    viimeVuodenSaastot = (viimeVuodenSaastot + tallennusSlider.getValue() * 12) * (1 + (korkoSlider.getValue() / 100));
                }
            }
        });
        BorderPane tallennusAsettelu = new BorderPane();
        tallennusAsettelu.setLeft(tallennusTeksti);
        tallennusAsettelu.setCenter(tallennusSlider);
        tallennusAsettelu.setRight(tallennusLuku);

        //vuosittainen korko
        Label korkoTeksti = new Label("Vuosittainen korko");
        korkoSlider.setOnMouseClicked((event) -> {
            tallennusLuku.setText("" + tallennusSlider.getValue());
            korkoLuku.setText("" + korkoSlider.getValue());
            saastoData.getData().clear();
            korkoData.getData().clear();
            double viimeVuodenSaastot = 0;
            for (int i = 0; i < 31; i++) {
                saastoData.getData().add(new XYChart.Data(i, i * 12 * tallennusSlider.getValue()));
//                    double debug = viimeVuodenSaastot;
                if (i == 0) {
                    korkoData.getData().add(new XYChart.Data(i, 0));
                } else {
                    korkoData.getData().add(new XYChart.Data(i, (viimeVuodenSaastot + tallennusSlider.getValue() * 12) * (1 + (korkoSlider.getValue() / 100))));
                    viimeVuodenSaastot = (viimeVuodenSaastot + tallennusSlider.getValue() * 12) * (1 + (korkoSlider.getValue() / 100));
                }
            }
        });
        korkoSlider.setShowTickLabels(true);
        korkoSlider.setShowTickMarks(true);
        korkoSlider.setMinorTickCount(10);
        BorderPane korkoAsettelu = new BorderPane();
        korkoAsettelu.setLeft(korkoTeksti);
        korkoAsettelu.setCenter(korkoSlider);
        korkoAsettelu.setRight(korkoLuku);

        //Sliderit
        VBox vertikaali = new VBox();
        vertikaali.getChildren().addAll(tallennusAsettelu, korkoAsettelu);

        //Asettelu
        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(viivakaavio);
        asettelu.setTop(vertikaali);
        Scene nakyma = new Scene(asettelu);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
}
