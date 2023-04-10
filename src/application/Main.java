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
	private ArrayList<Bullet> bullets = new ArrayList<Bullet>();
//	 ArrayList<Rectangle> enemy = new  ArrayList<Rectangle>( AlienInstructions.getAlien());

	private double secondstoShoot;
	Rectangle bulletRectangle;
	int x;
	int y;
	int w;
	int h;
	int z;
	Rectangle bullet;
	//
	AlienInstructions Alien = new AlienInstructions( x, y, w, z);

	Pane root = new Pane();

	// start
	public void start(Stage primaryStage) throws Exception {
		root.getChildren().addAll(Alien.getAlien());
//		AlienInstructions s = new AlienInstructions((int)Alien.getTranslateX() + 10 - 50 * h, (int)Alien.getTranslateY() - 100 ,5,20);
	//	root.getChildren().addAll(Alien.Enemymovement1(enemy));
	//	Rectangle r = new Rectangle(100,50,50,50);
	 //   root.getChildren().add(Alien.Enemymovement(s));
		//	root.getChildren().add(shoot(Alien));
//		 TranslateTransition translateTransition = new TranslateTransition();
//		 translateTransition.setNode(r);
//		 translateTransition.setDuration(Duration.seconds(4));
//		
//		translateTransition.setAutoReverse(true);
//			translateTransition.setToX( x + 1);
//
//		
//		translateTransition.setFromX(400);
//
//		
//		translateTransition.setCycleCount(Transition.INDEFINITE);
//		translateTransition.play();
//
//		root.getChildren().add(r);
		
AnimationTimer timer = new AnimationTimer() {
			
			@Override
			public void handle(long arg0) {
		           enemyShoot();
				

				
			}
		};
			timer.start();
		Scene scene = new Scene(root, 500, 600);
		primaryStage.setTitle("Space Invaders Project");

		primaryStage.setScene(scene);
		
		primaryStage.show();
		
		
		
	}


	
//	public void shoot(AlienInstructions alien) {
//		alive = true;
//		int l = 0;
//		int h = 0;
//		while(alive == true) {
//		AlienInstructions s = new AlienInstructions((int)alien.getTranslateX() + 10 - 50 * h, (int)alien.getTranslateY() - 100 ,5,20);
//		enemy.add(s);
//	  h++;
//	Random r = new Random();
//	int low = 1;
//	int high = 100;
//	int result = r.nextInt(high-low)+ low;
//	if (result < 50) {
//		
//	}
//	else {
//		s.enemyMovement();
//	}
//		if (l == 4) {
//			alive = false;
//		}
//		
//		l++;
//		
//		
//	//	root.getChildren().add(s);
//		}
//		return bullet;
//		}
//	
//	private void enemyShoot() {
//     enemy.forEach(s ->{
//    	 s.enemyMovement();
//     });
//		
//		secondstoShoot += 5;
//		for (int i = 0; i < 20; i++) {
//					shoot(Alien);
//			    }
//
//			
//	}
	public void shoot(ArrayList<Rectangle> allEnemys) {
		alive = true;
		int l = 0;
		int h = 0;
		while(alive == true) {

		Bullet s = new Bullet((int)Alien.getTranslateX() + 10 - 100 * h, (int)Alien.getTranslateY() - 100);
h++;
	
	
		if (l == 4) {
			alive = false;
		}
		
		l++;
		
		
//		root.getChildren().add(s);
		}
		}
	
	private void enemyShoot() {
//     Alien.getAlien().forEach(s ->{
//    	 Alien.enemyMovement();
//     });
//		
//		secondstoShoot += 5;
//		for (int i = 0; i < 20; i++) {
//					shoot(Alien.getAlien());
//			    }

			
	}
	public static void main(String[] args) {
		launch(args);
	}

	
	
public void movement(double x){
//	 TranslateTransition translateTransition = new TranslateTransition();
//	 translateTransition.setNode(Alien);
//	 translateTransition.setDuration(Duration.seconds(4));
//
//	 if (x < 290) {
//		 x = x + 1;
//   	 translateTransition.setByX(290);
//
//		 
//	 }
//	
//	  if (x == 290) {
//		 x = x -1;
//   	 translateTransition.setByX(-300);
//
//	 }
//	
//
//	 translateTransition.setCycleCount(1);
//	 translateTransition.play();
}

//TranslateTransition translateTransition = new TranslateTransition();
//translateTransition.setNode(Alien);
//translateTransition.setDuration(Duration.seconds(4));
//// translateTransition.setNode(enemyShoot(Alien));
	public void atBorder() {
		
	}
	}
