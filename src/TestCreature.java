import java.util.ArrayList;

public class TestCreature {

	public static final int THING_COUNT = 10;
	public static final int CREATURE_COUNT = 6;
	
	public static void main(String[] args) {
		
		
		
		Thing[] arry = new Thing[THING_COUNT];
		Creature[] carry = new Creature[CREATURE_COUNT];
		
		
			Thing thg = new Thing("tname");
			Thing thg2 = new Thing("tname2");
			Tiger tig = new Tiger("Tiger1");
			Tiger tig2 = new Tiger("Tiger2");
			arry[0] = thg;
			arry[1] = thg2;
			arry[2] = tig;
			arry[3] = tig2;
			
		System.out.println("\nThings:\n");

		for(int j = 0; j < arry.length; j++)
		{
			if(arry[j]!= null)
				System.out.println(arry[j]);
		}
	
	Bat bat1 = new Bat("BatName1");
	Ant ant1 = new Ant("ant1");
	Fly fly1 = new Fly("flyName1");
	Bat bat2 = new Bat("BatMan2");
	Ant ant2 = new Ant("ant2");
	Fly fly2 = new Fly("flyName2");
	
	carry[0] = bat1;
	carry[1] = ant1;
	carry[2] = fly1;
	carry[3] = bat2;
	carry[4] = ant2;
	carry[5] = fly2;
	
	System.out.println("\nCreatures: \n");
	
		for(int k = 0; k < carry.length; k++)
		{
			if(carry[k]!= null)
			{
				
				carry[k].eat(thg);
				carry[k].eat(tig);
				carry[k].move();
				carry[k].whatDidYouEat();
			}
		}
	
			
	
	
	
	
	
	
	
	}
	
	
	
}

