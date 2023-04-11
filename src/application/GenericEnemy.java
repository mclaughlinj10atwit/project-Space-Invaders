package application;

//public class GenericEnemy {
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public abstract class GenericEnemy {

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
	private boolean border = false;

	public GenericEnemy(int x, int y, int w, int h, int hp) {
		xPos = x;
		yPos = y - 150;
		xVel = 300;
		yVel = 200;
		width = w;
		height = h;
		graphic = new Rectangle(x, y, w, h);

		graphic.setX(x);
		graphic.setY(y);
		graphic.setWidth(w);
		graphic.setHeight(h);
		this.hp = hp;
		dt = 0.016; // 16 milliseconds
//			graphic.setX(xPos);
//			graphic.setY(yPos);
		graphic.setFill(Color.BLACK);
	}
	public boolean border() {
		if (xPos <= 0) {
			border = true;
		}
		if (xPos >= 600) {
			border = true;
		}
		return border;

	}

	public Rectangle getGraphic() {
		return graphic;
	}

	public double getX() {
		return xPos;
	}

	public double getY() {
		return yPos;
	}
}
