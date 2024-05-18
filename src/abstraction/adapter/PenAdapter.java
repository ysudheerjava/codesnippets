package abstraction.adapter;

public class PenAdapter implements Pen {
	
	PilotPen pp = new PilotPen();

	@Override
	public void write() {
		// TODO Auto-generated method stub
		pp.mark();
		
	}
	
	

}
