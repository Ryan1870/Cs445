public abstract class Creature extends Thing {
	
	private Thing lastAte;
	
	public Creature(String name)
	{
		super(name);
	}
	
	public void eat(Thing aThing)
	{
		lastAte = aThing;
		System.out.println(this.getClass() + " has just eaten a " + aThing);
	}
	
	public abstract void move();
	
	public void whatDidYouEat()
	{
		if(lastAte.equals(null))
		{
			System.out.println(super.toString() + " has had nothing to eat!");
		}
		else
			System.out.println(super.toString() + " jas eaten a " + lastAte);	
	}
	

}