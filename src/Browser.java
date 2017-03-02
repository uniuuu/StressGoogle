import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Browser extends Application{

	public static void main(String[] args) {
		
Application.launch(args);

}
	private long h=2;
	@Override
	public void start(Stage stage) throws Exception {
		
//		private int j=1;
		WebView myWebView = new WebView();
		WebEngine engine = myWebView.getEngine();
/*		for (int j=1; j>10000; j++){
			int h=2;
			h*=h;*/
		
		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), ev -> {
			
			 h+=h;
			engine.load("http://www.google.com/search?q=" + h);
		        		System.out.println(h);
		 }));
	    timeline.setCycleCount(Animation.INDEFINITE);
	    timeline.play();
	   
		

	//	}
		VBox root = new VBox();
		root.getChildren().addAll(myWebView);
		
		Scene scene = new Scene(root, 500, 200);
				stage.setScene(scene);
		
		stage.show();
	//	Application.launch(args);
	}
	

	
}
