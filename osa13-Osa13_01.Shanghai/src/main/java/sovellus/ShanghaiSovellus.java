package sovellus;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiSovellus extends Application {

    public static void main(String[] args) {
        launch(ShanghaiSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {
        // luodaan kaaviossa käytettävät x- ja y-akselit
        NumberAxis xAkseli = new NumberAxis(2007, 2017, 4);
        NumberAxis yAkseli = new NumberAxis();

        // asetetaan akseleille nimet
        xAkseli.setLabel("Vuosi");
        yAkseli.setLabel("Suhteellinen kannatus (%)");

        // luodaan viivakaavio. Viivakaavion arvot annetaan numeroina
        // ja se käyttää aiemmin luotuja x- ja y-akseleita
        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Suhteellinen kannatus vuosina 1968-2008");

        // luodaan viivakaavioon lisättävä datajoukko
        XYChart.Series rkpData = new XYChart.Series();
        rkpData.setName("RKP");
        // lisätään datajoukkoon yksittäisiä pisteitä
        rkpData.getData().add(new XYChart.Data(2007, 73));
        rkpData.getData().add(new XYChart.Data(2008, 68));
        rkpData.getData().add(new XYChart.Data(2009, 72));
        rkpData.getData().add(new XYChart.Data(2010, 62));
        rkpData.getData().add(new XYChart.Data(2011, 74));
        rkpData.getData().add(new XYChart.Data(2012, 73));
        rkpData.getData().add(new XYChart.Data(2013, 76));
        rkpData.getData().add(new XYChart.Data(2014, 73));
        rkpData.getData().add(new XYChart.Data(2015, 67));
        rkpData.getData().add(new XYChart.Data(2016, 56));
        rkpData.getData().add(new XYChart.Data(2017, 56));

        // lisätään datajoukko viivakaavioon
        viivakaavio.getData().add(rkpData);

        // näytetään viivakaavio
        Scene nakyma = new Scene(viivakaavio, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
