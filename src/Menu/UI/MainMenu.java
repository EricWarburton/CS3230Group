/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu.UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author reddt
 */
public class MainMenu extends Application {
<<<<<<< HEAD:src/Menu/UI/MainMenu.java

=======
    
    private MainMenuFXMLController main;
    
>>>>>>> Don't have to minimize main window:src/MainMenu/UI/MainMenu.java
    @Override
    public void start(Stage stage) throws Exception {
        main = new MainMenuFXMLController();
        Parent root = FXMLLoader.load(getClass().getResource("MainMenuFXML.fxml"));
        root.getStylesheets().add(getClass().getResource("darkTheme.css").toExternalForm());
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    } 
}
