
public class ShapeFcatory {
	public static shape getShape(String shapeType) {
		
		
		shape Shape ;
		
		switch (shapeType) {
		
		case "Rectangle":
			Shape = new Rectangle();
			break;
			
		case "Circle":
			Shape = new Rectangle();
			break;
			default:
				Shape = null;
				
				break;
			
		}
		return Shape;
	}

}
