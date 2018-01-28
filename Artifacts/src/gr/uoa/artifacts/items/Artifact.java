package gr.uoa.artifacts.items;

public abstract class Artifact {
	
	public enum Movement{impressionism,expressionism,naturalism};
	public enum Condition{bad,good,excellent};
	public enum Technique{oil,aquarelle,tempera};
	public enum Material{iron,stone,wood};
	
	protected int index;
	protected String creator;
	protected int year;
	
	abstract public void getInfo();

	abstract public void evalute(Movement mov, Condition con);

	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
