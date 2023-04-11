package application;

import javafx.scene.shape.Rectangle;

public class Bullet {
	
	private Rectangle graphic;
	private double bXPos;
	private double bYPos;
	private double bYUPos;
	private double bYVel=200;
	private double dt = 0.016; //16 milliseconds
	
	public Bullet(double xPos, double yPos) {
		graphic = new Rectangle(5, 30);
		graphic.setX(xPos+27.5);
		graphic.setY(yPos-30);
	}
	
	public void shoot() {
		bYUPos = graphic.getY()-bYVel*dt;
		updateBullet();
	}
	
	public void updateBullet() {
		graphic.setY(bYUPos);
	}
	
	public Rectangle getGraphic() {
		return graphic;
	}
	
	public boolean collide() {
		if(graphic.getY() <= 0) {
			return true;
		}
		return false;
	}
	
}

////public class Bullet {
////	private double x;
////	private double y;
////	private double speed;
////	private boolean seen;
////
////	public Bullet(double startx, double starty) {
////		x = startx;
////		y = starty;
////		for (int i = 0; i < 10; i++) {
////		y = y -1;
////		}
////		
////		speed = 7;
////		seen = true;
////
////	}
////
////	public void update() {
////		x += speed;
////		if (x > 600) {
////			seen = false;
////		}
////	}
////
////	public double getX() {
////		return x;
////	}
////
////	public void setX(double x) {
////		this.x = x;
////		;
////	}
////
////	public double getY() {
////		return y;
////	}
////
////	public void setY(double y) {
////		this.y = y;
////	}
//
//	public double getSpeed() {
//		return speed;
//	}
//
//	public void setSpeed(double speed) {
//		this.speed = speed;
//	}
//
//	public boolean getSeen() {
//		return seen;
//	}
//
//	public void setSeen(boolean seen) {
//		this.seen = seen;
//	}
//}
