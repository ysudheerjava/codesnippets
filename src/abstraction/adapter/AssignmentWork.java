package abstraction.adapter;

public class AssignmentWork {

	Pen p = new PenAdapter();

	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

	void write() {
		p.write();
	}

}
