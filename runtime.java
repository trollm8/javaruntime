import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class runtime extends Application {

    @Override
    public void start(Stage stage) {
 
        System.out.print("\033[H\033[2J");
        System.out.flush();


        System.out.println("trollm8's javascript runtime started!");

        
        WebView webView = new WebView();
        webView.getEngine().load("https://trollm8.xyz/index.html");


        Scene scene = new Scene(webView, 1024, 768);
        stage.setTitle("runtime");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
