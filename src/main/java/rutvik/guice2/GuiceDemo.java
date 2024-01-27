package rutvik.guice2;

import com.drawingapp.AppModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class GuiceDemo {
	
	private static final String SQUARE_REQ = "square";

	private static void sendReqest(String squareReq) {
		
		if (squareReq.equals(SQUARE_REQ)) {
			Injector injector = Guice.createInjector(new AppModule());
			
			SquareRequest request = injector.getInstance(SquareRequest.class);
			request.makeRequest();
			
			SquareRequest request2 = injector.getInstance(SquareRequest.class);
			request2.makeRequest();
			
			boolean areDrawShapesEqual = request.getDrawShape() == request2.getDrawShape();
			System.out.println("are shapes equal:" + areDrawShapesEqual);
		}
	}

	public static void main(String[] args) {
		sendReqest(SQUARE_REQ);

	}
}
