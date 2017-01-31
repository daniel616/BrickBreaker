import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld extends Application{
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn = new Button("Click me");
		Button exit = new Button("Exit");
		exit.setOnAction(e->{System.out.print("but");System.exit(0);});
		btn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				//System.out.println("hellow world");
			}
		});
		
		VBox root = new VBox();
		root.getChildren().addAll(exit,btn);
		Scene scene = new Scene(root, 500, 300);
		primaryStage.setTitle("my title");
		primaryStage.setScene(scene);
		primaryStage.show();
		// TODO Auto-generated method stub
		
	}
}
