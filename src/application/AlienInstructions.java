package application;

import java.util.ArrayList;

import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class AlienInstructions extends Enemymovement{
	private int x;
	private int y;
	private int w;
	private int h;
	private Rectangle Alien;
	boolean moveRight;
	boolean moveLeft;
	boolean isvisible;
	
		 // TODO Auto-generated constructor stub
//		public	AlienInstructions(int x, int y, int w, int h) {
//			super(x,y,w,h);
//			this.x = x;
//			this.y = y;
//		}
	ArrayList<Rectangle> enemy = new ArrayList<Rectangle>();
	//Rectangle [] enemys = new Rectangle[21];

		public  AlienInstructions(int x,int y,int w,int h) {
			super(x,y,w,h);
		}
}

//			int j = 0;
//			int p = 0;
//			for (int i = 1; i < 6; i++) {
//				 Alien = new Rectangle(i * 100, 50 + y, 50, 30);
//				 enemy.add(Alien);
//
//			//	movement(i * 50);
//				if (i == 5) {
//					y = y + 60;
//					if (j != 4) {
//						i = 0;
//					}
//					j++;
//				}
//				
//p++;
//			}
////			for (int i = 1; i < enemy.size() + 1; i++) {
////				 TranslateTransition translateTransition = new TranslateTransition();
////				 translateTransition.setNode(enemy.get(i));
////				 translateTransition.setDuration(Duration.seconds(4));
////				
////				translateTransition.setAutoReverse(true);
////					translateTransition.setToX( x + 1);
////
////				
////				translateTransition.setFromX(400);
////
////				
////				translateTransition.setCycleCount(Transition.INDEFINITE);
////				translateTransition.play();
////			}
//		}
//	
//		public int getTranslateX() {
//			return x ;
//			
//		}
//		public int getTranslateY() {
//			return y ;
//			
//		}
//		public int  enemyMovement() {
//			return y+ 50;
//		}
////		public  ArrayList<Rectangle> getAlien() {
////			return enemy;
////		}
//}
//
////	public static class AlienInstructions extends Rectangle {
////
////	public	AlienInstructions(int x, int y, int w, int h) {
////			super(x, y, w, h);
////			setTranslateX(x);
////			setTranslateY(y);
////		}
////
////		void enemyMovement() {
////			setTranslateY(getTranslateY() + 5);
////		}
////		void getTranslateX() {
////			return setTranslate(x);
////		}
////	}
////}
//
//
