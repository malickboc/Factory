
public class Main {
	public static void main(String[] args) {
		
		
		shape shape = ShapeFcatory.getShape("Circle");
		shape.draw();
		shape = ShapeFcatory.getShape("Rectangle");
		shape.draw();
	}

}
