package application;

import java.awt.Button;
import java.awt.FocusTraversalPolicy;
import java.awt.font.TextLayout;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Random;

import javax.management.remote.SubjectDelegationPermission;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Main extends Application {
	// variables and calling alien
	private boolean alive;
	ArrayList<Rectangle> enemy = new ArrayList<Rectangle>();
	int BOARD_WIDTH = 600;

	private double secondstoShoot;
	Rectangle bulletRectangle;
	int x;
	int y;
	int w;
	int h;
	int z;
	Rectangle bullet;
	//
	private enemyClass Alien = new enemyClass(100, 100, 100, 100, 1);

	Pane root = new Pane();

	// start
	public void start(Stage primaryStage) throws Exception {
		int j = 0;
		int p = 0;
		for (int i = 1; i < 6; i++) {
			Alien = new enemyClass(i * 70, 20 + y, 50, 30, 1);
			Rectangle alienRectangle = Alien.getGraphic();
			// enemy.add(Alien);
			Enemymovement(alienRectangle);

//             Bullet b = new Bullet(Alien.getGraphic().getX(), Alien.getGraphic().getY());
//             root.getChildren().add(b.getGraphic());
//             b.shoot();
			if (i == 5) {
				y = y + 60;
				if (j != 4) {
					i = 0;
				}
				j++;
			}

			root.getChildren().add(Alien.getGraphic());

			p++;
		}

		AnimationTimer timer = new AnimationTimer() {

			@Override
			public void handle(long arg0) {

			}
		};
		timer.start();
		Scene scene = new Scene(root, 500, 600);
		primaryStage.setTitle("Space Invaders Project");

		primaryStage.setScene(scene);

		primaryStage.show();

	}

	public void Enemymovement(Rectangle Alien) {
		TranslateTransition translateTransition = new TranslateTransition();
		translateTransition.setNode(Alien);
		translateTransition.setDuration(Duration.seconds(1));

		translateTransition.setAutoReverse(true);
		translateTransition.setToX(x - 20);

		translateTransition.setFromX(50);

		translateTransition.setCycleCount(Transition.INDEFINITE);
		translateTransition.play();

	}

	public static void main(String[] args) {
		launch(args);
	}


}