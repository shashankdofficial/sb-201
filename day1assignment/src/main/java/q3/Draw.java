package q3;

//Dependent Class
public class Draw {

	Shapes shape;
	
	//Setter Injection Point
	public void setShape(Shapes shape) {
		this.shape = shape;
	}


	public void drawshape() {
		shape.draw();
	}

}
