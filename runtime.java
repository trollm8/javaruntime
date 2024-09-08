import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class runtime extends Application {

    @Override
    public void start(Stage stage) {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("trollm8's javascript runtime started!");
        System.out.println("version 1.1");

        WebView webView = new WebView();
        webView.getEngine().load("https://trollm8.xyz/");

        Scene scene = new Scene(webView, 1024, 768);

 
        stage.setTitle("runtime");

        stage.getIcons().add(new Image("file:icon.png"));


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
