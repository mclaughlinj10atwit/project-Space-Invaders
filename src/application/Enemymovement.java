package application;

import java.util.ArrayList;

import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Enemymovement {
	public void Enemymovement1(ArrayList<Rectangle> allEnemy) {
		for (int i = 1; i < allEnemy.size() + 1; i++) {
		int x = i * 50;
		 TranslateTransition translateTransition = new TranslateTransition();
		 translateTransition.setNode(allEnemy.get(i));
		 translateTransition.setDuration(Duration.seconds(4));
		
		translateTransition.setAutoReverse(true);
			translateTransition.setToX( x + 1);

		
		translateTransition.setFromX(400);

		
		translateTransition.setCycleCount(Transition.INDEFINITE);
		translateTransition.play();
		}
	}
}
