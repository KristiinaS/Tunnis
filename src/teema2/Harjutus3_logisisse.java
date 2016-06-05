package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sun.security.util.Password;

/**
 * 1. Loo sisse logimise ekraan (ainult visuaal)
 * 2. Määra üks võimalik kasutaja ja parool (andmebaasi veel ei kasuta)
 * 3. Ebaõnnestunud katse näitab kasutajale errorit
 * 4. Õnnestunud katse puhul vaheta pilt uue vastu (kasvõi roheline ring), .
 */
public class Harjutus3_logisisse extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        Scene loginScene = new Scene(vbox);

        primaryStage.setScene(loginScene);
        primaryStage.show();

        Label kasutajaLabel = new Label("Sisesta kasutaja:");
        TextField kasutajaInput = new TextField();
        Label parooliLabel = new Label("Sisesta parool:");
        PasswordField parooliInput = new PasswordField();
        Button loginButton = new Button("Logi sisse");

        Label teade = new Label();


        vbox.getChildren().addAll(kasutajaLabel,kasutajaInput,parooliLabel,parooliInput,loginButton, teade);

        loginButton.setOnAction(event -> {
            String kasutajanimi = kasutajaInput.getText();
            String parool = parooliInput.getText();
            if (kasutajanimi.equals("Krister") && parool.equals("täiegasalajane")){
                System.out.println("Said sisse");
            } else {
                System.out.println("Vale parool");
                teade.setText("Vale parool/kasutaja");
            }

        });


    }
}
