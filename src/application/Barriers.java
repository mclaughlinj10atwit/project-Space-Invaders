package application;

public class Barriers {
	import javafx.scene.Group;
	import javafx.scene.shape.Rectangle;

	public class Barrier{
		private Group root;
		
		public Barrier(Group root) {
			this.root = root;
		}
		
		public void build() {
			int dimensions = 25;
			int x = 130;
			int y = 700;
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 3; j++) {
					for(int k = 0; k < 5; k++) {
						Rectangle rect=new Rectangle();
						rect.setX(x+(26*k));
						rect.setY(y);
						rect.setHeight(dimensions);
						rect.setWidth(dimensions);
						root.getChildren().add(rect);

					}
					y = y + dimensions + 1;
				}
				x = x + 200;
				y = 700;
			}

		}

		

	}


