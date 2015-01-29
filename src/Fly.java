
public class Fly extends Creature implements Flyer{

	public Fly(String name) {
		super(name);
		}

	@Override
	public void move() {
		
		this.fly();
		
	}

	@Override
	public void fly() {
		
		System.out.println(super.toString() + " is buzzing around in flight.");
	}
	
	public void eat(Thing aThing)
	{
		if(aThing.getClass().getSimpleName().equals("Thing"))
		{
			super.eat(aThing);
		}
		else
			System.out.println(super.toString() + " won't eat a "+ aThing);
	}

}
