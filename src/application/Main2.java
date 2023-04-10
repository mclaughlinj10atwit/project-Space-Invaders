package application;

public class Main2 {
	import javafx.animation.KeyFrame;
	import javafx.animation.Timeline;
	import javafx.application.Application;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.scene.Scene;
	import javafx.scene.input.KeyCode;
	import javafx.scene.input.KeyEvent;
	import javafx.scene.layout.Pane;
	import javafx.stage.Stage;
	import javafx.util.Duration;

	public class Main extends Application{

		public static void main(String[] args) {
			launch(args);
		}

		@Override
		public void start(Stage primaryStage) throws Exception {
			Pane p = new Pane();
			
			Player pl = new Player(220,525,60,40);
			p.getChildren().add(pl.getGraphic());
			
			pl.getGraphic().setOnKeyPressed(new EventHandler<KeyEvent>() {
				@Override
				public void handle(KeyEvent event) {
					if(event.getCode() == KeyCode.LEFT) {
						if(pl.getXVel()>0) {
							pl.setXVel(-300);
						}
						if(pl.collideL()) {
							pl.setXVel(300);
						}
						pl.update();
					}
					if(event.getCode() == KeyCode.RIGHT) {
						if(pl.getXVel()<0) {
							pl.setXVel(300);
						}
						if(pl.collideR()) {
							pl.setXVel(-300);
						}
						pl.update();
					}
					if(event.getCode() == KeyCode.SPACE) {
						Bullet b = new Bullet(pl.getGraphic().getX(), pl.getGraphic().getY());
						p.getChildren().add(b.getGraphic());
						EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent event) {
								b.shoot();
								if(b.collide()==true) {
									p.getChildren().remove(b.getGraphic());
								}
							}
							
						};

						Timeline tl = new Timeline(new KeyFrame(Duration.millis(16),eh));
						tl.setCycleCount(Timeline.INDEFINITE);
						tl.play();
						
					}
				}
					
			});
			
			Scene s = new Scene(p, 500, 600);
			primaryStage.setScene(s);
			primaryStage.show();
			pl.getGraphic().requestFocus();
			
		}
		
	}

}
