package gr.uoa.artifacts.items;

public class Sculpture extends Masterpiece {

	private double volume;
	private Material material;
	
	public Sculpture(int index, String creator, int year, Condition con, Movement mov, double volume, Material mat){
		this.index = index;
		this.creator = creator;
		this.year = year;
		this.condition = con;
		this.movement = mov;
		this.volume = volume;
		this.material = mat;
	}

	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Sculpture's volume is " + volume + " cm^3");
		System.out.println("Sculpture's material is " + material);
	}

	@Override
	public void evalute(Movement mov, Condition con) {
		if((condition.equals(con) && movement.equals(mov)) || 
				(movement.equals(mov) && 
						(condition.equals(Condition.excellent) || condition.equals(Condition.good)))){
			System.out.println("Acceptable sculpture");
		}else{
			System.out.println("Not acceptable sculpture");
		}
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

}
