package rutvik.guice2;

import com.google.inject.Inject;

public class SquareRequestSub extends SquareRequest {
	@Inject
	public SquareRequestSub(DrawShape d) {
		super(d);
	}
	
	@Override
	public void makeRequest() {
		System.out.println("in subRequest");
		d.draw();
	}
	
}
