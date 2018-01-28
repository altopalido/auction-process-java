package gr.uoa.artifacts.items;


public class Painting extends Masterpiece {

	private double length;
	private double width;
	private Technique technique;
	
	public Painting(int index, String creator, int year, Condition con, Movement mov, double length, double width, Technique tech){
		this.index = index;
		this.creator = creator;
		this.year = year;
		this.condition = con;
		this.movement = mov;
		this.length = length;
		this.width = width;
		this.technique = tech;
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Painting's area is " + width*length + " cm^2");
		System.out.println("Painting's technique is " + technique);
	}

	@Override
	public void evalute(Movement mov, Condition con) {
		if((condition.equals(con) && movement.equals(mov)) || 
				(movement.equals(mov) && 
						(condition.equals(Condition.excellent) || condition.equals(Condition.good)))){
			System.out.println("Acceptable painting");
		}else{
			System.out.println("Not acceptable painting");
		}
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Technique getTechnique() {
		return technique;
	}

	public void setTechnique(Technique technique) {
		this.technique = technique;
	}

	public double getSurface() {
		return length * width;
	}
	
}
