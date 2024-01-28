package rutvik.guice2;

import com.drawingapp.EdgeValue;
import com.drawingapp.colorValue;
import com.google.inject.Inject;

public class DrawSquare implements DrawShape {
	
	private String color;
	private Integer edge;

	//google guice 5.1.0
	@Inject
	public DrawSquare(@colorValue String color, @EdgeValue Integer edge) {
		super();
		this.color = color;
		this.edge = edge;
	}

	public void draw() {
		System.out.println("Drawing Shape of color: " + color + "and edge: "+ edge);
	}
}
