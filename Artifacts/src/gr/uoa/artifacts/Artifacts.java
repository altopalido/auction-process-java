package gr.uoa.artifacts;

import gr.uoa.artifacts.items.Artifact;
import gr.uoa.artifacts.items.Painting;
import gr.uoa.artifacts.items.Sculpture;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Artifacts {

	static int numberOfArtifacts = 0;
	
	public static void main(String[] args) {
		
		if(args.length < 3){
			System.out.println("Arguments must be 3");
			System.exit(0);
		}
		
		numberOfArtifacts = Integer.parseInt(args[0]);
		
		List<Artifact> artifacts = createRandomArtifacts();

		auction(artifacts, Artifact.Movement.valueOf(args[1]), Artifact.Condition.valueOf(args[2]));
	}
	
	private static List<Artifact> createRandomArtifacts(){
		List<Artifact> result = new ArrayList<Artifact>();
		int counter;
		Random rand = new Random();
		
		for(counter = 0; counter<numberOfArtifacts/2; counter++){
			int index = counter;
			String creator = "Creator" + counter;
			//create a random year between 1800 and 2017
		    int year = rand.nextInt((2017 - 1800) + 1) + 1800;
		    
		    //Create a random condition
		    int pick = rand.nextInt(Artifact.Condition.values().length);
		    Artifact.Condition cond = Artifact.Condition.values()[pick];
		    //Create a random movement
		    pick = rand.nextInt(Artifact.Movement.values().length);
		    Artifact.Movement mov = Artifact.Movement.values()[pick];
		    //Create a random Technique
		    pick = rand.nextInt(Artifact.Technique.values().length);
		    Artifact.Technique tech = Artifact.Technique.values()[pick];
		    		    
		    double length = rand.nextInt((100-2) + 1) + 2;
		    double width = rand.nextInt((100-2) + 1) + 2;

		    Painting paint = new Painting(index, creator, year, cond, mov, length, width, tech);
		    result.add(paint);
		}
		
		for(;counter<numberOfArtifacts; counter++){
			
			int index = counter;
			String creator = "Creator" + counter;
			//create a random year between 1800 and 2017
		    int year = rand.nextInt((2017 - 1800) + 1) + 1800;
		    
		    //Create a random condition
		    int pick = rand.nextInt(Artifact.Condition.values().length);
		    Artifact.Condition cond = Artifact.Condition.values()[pick];
		    //Create a random movement
		    pick = rand.nextInt(Artifact.Movement.values().length);
		    Artifact.Movement mov = Artifact.Movement.values()[pick];
		    //Create a random Material
		    pick = rand.nextInt(Artifact.Material.values().length);
		    Artifact.Material mat = Artifact.Material.values()[pick];
		    		    
		    double volume = rand.nextInt((100-2) + 1) + 2;
		    
		    Sculpture sculpture = new Sculpture(index, creator, year, cond, mov, volume, mat);
		    result.add(sculpture);
		}
		
		return result;
	}
	
	private static void auction(List<Artifact> artifacts, Artifact.Movement mov, Artifact.Condition con){
		for(Artifact art : artifacts){
			System.out.println("Artifacts index is: " + art.getIndex());
			art.getInfo();
			art.evalute(mov, con);
			System.out.println("----------------------------------");
		}
	}

}
