package application;

public class Player {
	import javafx.scene.paint.Color;

	public class Player extends GenericPlayer{

		private double x;
		private double y;
		private double hp = 3;
		
		public Player(double x, double y, double w, double h) {
			super(x, y, w, h, 3);
		}
		
	}

}
