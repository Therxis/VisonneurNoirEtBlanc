package ihm;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Window extends Application {
	/**
	 * Load the MainWindow.fxml
	 */
	public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        URL fxmlFileUrl = getClass().getResource("/MainWindow.fxml");
        if (fxmlFileUrl == null) {
                System.out.println("Impossible de charger le fichier fxml");
                System.exit(-1); 
        } 
        loader.setLocation(fxmlFileUrl); 
        
        WindowController controller = new WindowController();
        loader.setController(controller);

        Parent root = loader.load();
        
        Scene scene = new Scene(root); 
        stage.setScene(scene);
        stage.setTitle("Convertisseur");
        stage.show();
}

public static void main(String[] args) {
        Application.launch(args);
}
}