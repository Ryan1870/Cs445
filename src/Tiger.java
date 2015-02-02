
public class Tiger extends Creature{

	public Tiger(String name) {
		super(name);
		
	}

	@Override
	public void move() {
		
		//name class has just pounced
		System.out.println(super.toString() + " has just pounced.");
	}
	
	

	

}
