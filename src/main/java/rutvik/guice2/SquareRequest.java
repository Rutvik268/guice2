package rutvik.guice2;

import com.google.inject.Inject;

public class SquareRequest {
	DrawShape d;
	
	@Inject
	public SquareRequest(DrawShape d){
		this.d = d;
	}
	
	public void makeRequest() {
		d.draw();
	}

	public Object getDrawShape() {

		return d;
	}
}
