package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/**
 * The only controller for the whole application.
 * 
 * @author Arturo
 */
public class SampleController {
	
    // Reference to the main application.
    private Main mainApp;
	
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
    
    /**
     * Closes the application when clicked on Exit in the secondary stage
     */
    @FXML
    private void cerrar() {
   	        System.exit(0);
    }
    
    /**
     * Closes the application when clicked on Exit in the secondary stage
     */
    @FXML
    public void abrir() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("Pantalla2.fxml"));
            BorderPane page = (BorderPane) loader.load();// importante cambiar si es un border o lo que sea.
            Stage sendStage = new Stage();
            sendStage.setTitle("Superheader");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);

            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
