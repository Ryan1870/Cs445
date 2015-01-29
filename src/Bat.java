
public class Bat extends Creature implements Flyer{

	public Bat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		
		System.out.println(super.getName() + " " + this.getClass().getSimpleName() + " is swooping through the dark." );
	}

	@Override
	public void move() {
		this.fly();
		
	}
	
	public void eat(Thing aThing){
		
		if(aThing.getClass().getSimpleName().equals("Thing"))
		{
			System.out.println( super.getName() + " " + this.getClass().getSimpleName() + " wont eat a " + aThing);
		}
		else if(aThing.getClass().getSimpleName().equals("Creature"))
		{
			super.eat(aThing);
			
		}
		
	}

}
