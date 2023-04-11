package application;

import java.io.PrintWriter;
import java.util.ArrayList;

import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public abstract class Enemymovement {
 private int x;
 private int y;
 private int w;
 private int h;
	public Enemymovement(int x, int y, int w, int h) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		Rectangle enemy = new Rectangle(x,y,w,h);
		enemy.setFill(Color.BLACK);

	}

	public  void Enemymovement1(Rectangle Alien) {
		 TranslateTransition translateTransition = new TranslateTransition();
		 translateTransition.setNode(Alien);
		 translateTransition.setDuration(Duration.seconds(4));
		
		translateTransition.setAutoReverse(true);
			translateTransition.setToX( x + 1);

		
		translateTransition.setFromX(400);

		
		translateTransition.setCycleCount(Transition.INDEFINITE);
		translateTransition.play();
		
		}
	}

