package application;

public class GenericPlayer {
	import javafx.event.EventHandler;
	import javafx.scene.input.KeyCode;
	import javafx.scene.input.KeyEvent;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Rectangle;

	public abstract class GenericPlayer {
		
		private double xPos;
		private double yPos;
		private double xVel;
		private double yVel;
		private double width;
		private double height;
		private double dt;
		private Rectangle graphic;
		private double hp;
		private boolean hit;
		private boolean destroyed;
		
		public GenericPlayer(double x, double y, double w, double h, double hp) {
			xPos=x;
			yPos=y;
			xVel=300;
			yVel=200;
			width = w;
			height = h;
			this.hp = hp;
			dt = 0.016; //16 milliseconds
			graphic = new Rectangle(w,h);
			graphic.setX(xPos);
			graphic.setY(yPos);
			graphic.setFill(Color.GREEN);
		}
		

		public Rectangle getGraphic() {
			return graphic;
		}
		
		public void update() {
			//update position
			xPos = xPos+xVel*dt;
			
			//update graphic
			updateGraphic();
		}
		
		public boolean collideL() {
			boolean c = false;
			if(xPos <= 0) {
				c=true;
			}
			return c;
		}
		
		public boolean collideR() {
			boolean c = false;
			if(xPos >= 500-width) {
				c=true;
			}
			return c;
		}
		
		public void updateGraphic() {
			graphic.setX(xPos);
			graphic.setY(yPos);
		}

		public void hit() {
			hp--;
		}
		
		public boolean isDestroyed() {
			if(hp == 0) {
				return true;
			}
			else {
				return false;
			}
		}

		public double getX() {
			return xPos;
		}
		
		public double getY() {
			return yPos;
		}
		
		public double getXVel() {
			return xVel;
		}
		
		public double getYVel() {
			return yVel;
		}
		
		public void setXVel(double x) {
			xVel=x;
		}
		
		public void setYVel(double y) {
			yVel=y;
		}
		
	}

}
