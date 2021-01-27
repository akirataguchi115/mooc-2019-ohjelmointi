package sovellus;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PuolueetSovellus extends Application {

    public static void main(String[] args) {
        launch(PuolueetSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {
        NumberAxis xAkseli = new NumberAxis(1968, 2008, 4);
        NumberAxis yAkseli = new NumberAxis(0, 30, 5);

        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Puolueiden suhteellinen kannatus");

        //luetaan data Hajautustauluun
        List<String[]> rivit = new ArrayList<>();
        try {
            Files.lines(Paths.get("puoluedata.tsv")).forEach(rivi -> {
                String[] palat = rivi.split("\t");
                rivit.add(palat);
            });
        } catch (Exception e) {
            System.out.print("Tapahtui virhe: " + e.getMessage());
        }

        Map<String, Map<Integer, Double>> arvot = new HashMap<>();
        for (int i = 1; i < rivit.size(); i++) {
            Map<Integer, Double> kannatusVuosi = new HashMap<>();
            for (int j = 1; j < rivit.get(i).length; j++) {
                int vuosi = Integer.valueOf(rivit.get(0)[j]);
                String kannatusteksti = rivit.get(i)[j];
                if (kannatusteksti.equals("-")) {
                    continue;
                }
                Double kannatus = Double.valueOf(kannatusteksti);
                kannatusVuosi.put(vuosi, kannatus);
            }
            arvot.put(rivit.get(i)[0], kannatusVuosi);
        }

        //lisätään arvot graafeihin
        arvot.keySet().stream().forEach(puolue -> {
            // jokaiselle puolueelle luodaan oma datajoukko
            XYChart.Series data = new XYChart.Series();
            data.setName(puolue);

            // datajoukkoon lisätään puolueen pisteet
            arvot.get(puolue).entrySet().stream().forEach(pari -> {
                data.getData().add(new XYChart.Data(pari.getKey(), pari.getValue()));
            });

            // ja datajoukko lisätään kaavioon
            viivakaavio.getData().add(data);
        });
        Scene nakyma = new Scene(viivakaavio, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
}
