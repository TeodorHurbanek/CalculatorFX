import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        String pathToMain = "sample/calculator.fxml";

        URL mainURL = getClass().getResource(pathToMain);

        Parent parent = FXMLLoader.load(mainURL);

        Scene scene = new Scene(parent);

        /*metoda setResizable, kt. nezvacsi okno*/
        primaryStage.setResizable(false);
        primaryStage.setTitle("Calculatecho");
        primaryStage.getIcons().add(new Image("images/logo3.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
