package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */
public class Harjutus1_lipud extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        EestiLipp();
        JaapaniLipp();
    }

    private Pane JaapaniLipp() {
        Stage lava = new Stage();

        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 220, 170);
        lava.setScene(stseen);
        lava.show();

        Rectangle valgeTaust = new Rectangle(11, 11, 198, 148);
        valgeTaust.setFill(Color.TRANSPARENT);
        valgeTaust.setStroke(Color.BLACK);
        valgeTaust.setStrokeWidth(1);

        Circle punane = new Circle(110, 85, 50,Color.RED);

        pane.getChildren().addAll(valgeTaust,punane);
        return pane;
    }

    private Pane EestiLipp() {
        Stage lava = new Stage();


        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 220, 170);
        lava.setScene(stseen);
        lava.show();

        Rectangle sinine = new Rectangle(10,10,200,50);
        sinine.setFill(Color.BLUE);
        Rectangle must = new Rectangle(10,60,200,50);
        Rectangle valge = new Rectangle(11,110,198,48);
        valge.setFill(Color.TRANSPARENT);
        valge.setStroke(Color.BLACK);
        valge.setStrokeWidth(1);

        pane.getChildren().addAll(sinine, must, valge);
        return pane;
    }
}
