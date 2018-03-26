package FX;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/FX.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/application.css").toString());
			primaryStage.setScene(scene);
			primaryStage.getIcons().add(new Image(getClass().getResource("/logo.png").toString()));
			primaryStage.setTitle("FairPlay");
			primaryStage.setResizable(false);
			primaryStage.addEventFilter(KeyEvent.KEY_PRESSED, k -> {
				if((k.getCode() == KeyCode.SPACE) || (k.getCode() == KeyCode.ENTER)) {
					k.consume();
				}
			});
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
