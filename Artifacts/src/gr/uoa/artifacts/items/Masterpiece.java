package gr.uoa.artifacts.items;

public abstract class Masterpiece extends Artifact {

	protected Condition condition;
	protected Movement movement;
	
	@Override
	public void getInfo() {
		System.out.println("Masterpiece's movement is " + movement);
		System.out.println("Masterpiece's condition is " + condition);
	}

	@Override
	public void evalute(Movement mov, Condition con) {
		// TODO Auto-generated method stub
		
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	
	

}
